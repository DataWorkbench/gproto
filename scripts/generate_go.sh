#!/usr/bin/env bash
# Generate grpc code

# Required:
# protobuf
# go-proto-validators
#

if ! [[ "$0" =~ scripts/generate_go.sh ]]; then
	echo "must be run from repository root"
	exit 255
fi

current_path=$(cd "$(dirname "${0}")" || exit 1; pwd)

# install dep package.
sh "${current_path}/ensure_dep.sh"

cd "${current_path}"/.. || exit 1


MODULE="github.com/DataWorkbench/gproto"
GOPATH=$(go env GOPATH)

if [ -z "${GOPATH}" ]; then
    echo "Error: the environment variable GOPATH is not set, please set it before running"
    exit 1
fi

# check the grpc plugin is installed.
if ! type protoc > /dev/null 2>&1; then
  echo "Error: the plugin <protoc> not install, please install it before running"
  exit 1
fi

if ! type protoc-gen-go > /dev/null 2>&1; then
  echo "Error: the plugin <protoc-gen-go> not install, please install it before running"
  exit 1
fi

if ! type protoc-gen-go-grpc > /dev/null 2>&1; then
  echo "Error: the plugin <protoc-gen-go-grpc> not install, please install it before running"
  exit 1
fi

# check the plugin version.
if [[ $(protoc --version | cut -f2 -d' ') != "3.14.0" ]]; then
  echo "Error: could not find protoc 3.14.0, is it installed in you PATH?"
  exit 1
fi

if [[ $(protoc-gen-go --version 2>&1 | cut -f2 -d' ') != "v1.25.0" ]]; then
  echo "Error: could not find protoc-gen-go v1.25.0, is it installed in you PATH?"
  exit 1
fi

if [[ $(protoc-gen-go-grpc --version 2>&1 | cut -f2 -d' ') != "1.0.1" ]]; then
  echo "Error: could not find protoc-gen-go-grpc 1.0.1, is it installed in you PATH?"
  exit 1
fi

# generate code
for f in proto/*.proto;do
  name=$(echo "${f}" | sed 's@proto/@@; s@.proto@@')
  package="$(grep 'go_package' ${f}| grep "$MODULE"|awk '{print $NF}')"
  package=$(echo "${package}"|sed 's/"//g; s/;//g')
  dir=${package//"$MODULE"/}

  # Generate go struct and grpc.
  protoc -I=. -I="${GOPATH}"/pkg/mod -I="${GOPATH}"/src  -I=./proto --go_opt=module="${MODULE}" --go-grpc_opt=module="${MODULE}" --go_out=. --go-grpc_out=. "$f"

  # Generate validator code.
  if grep "validator.proto" "$f" >/dev/null 2>&1; then
    protoc -I=. -I="${GOPATH}"/pkg/mod -I="${GOPATH}"/src  -I=./proto --govalidators_opt=paths=source_relative --govalidators_out=. "$f"
    mv -f proto/"${name}".validator.pb.go ".${dir}/"
    if [ "$(uname -s)" == "Darwin" ] && ! sed --version >/dev/null 2>&1; then
      sed -i "" 's@github.com/golang/protobuf/proto@google.golang.org/protobuf/proto@g' ".${dir}/${name}.validator.pb.go"
    else
      sed -i 's@github.com/golang/protobuf/proto@google.golang.org/protobuf/proto@g' ".${dir}/${name}.validator.pb.go"
    fi
  else
    /bin/rm -f ".${dir}/${name}.validator.pb.go"
  fi

    # Generate gosql code.
  if grep 'gosql.proto' "$f"  >/dev/null 2>&1; then
     protoc -I=. -I="${GOPATH}"/pkg/mod -I="${GOPATH}"/src  -I=./proto --gosql_opt=paths=source_relative --gosql_out=. "$f"
     mv -f proto/"${name}".sql.pb.go ".${dir}/"
  else
    /bin/rm -f ".${dir}/${name}.sql.pb.go"
  fi

  # Inject tag to struct and remove comments.
  pbgo=".${dir}/${name}.pb.go"
  if grep "\@inject_tag" "${pbgo}" >/dev/null 2>&1; then
    protoc-go-inject-tag -input="${pbgo}"
    if [ "$(uname -s)" == "Darwin" ] && ! sed --version >/dev/null 2>&1; then
      sed -i "" '/\@inject_tag/d' "${pbgo}"
    else
      sed -i '/\@inject_tag/d' "${pbgo}"
    fi
  fi
done

go fmt ./... >/dev/null 2>&1;

make tidy || exit $?
make vet || exit $?
make lint || exit $?

if [ "$(uname -s)" == "Darwin" ] && ! sed --version >/dev/null 2>&1; then
	sed -i "" '/import (/a\"database/sql/driver"\n"encoding/json"\n"fmt"\n"strings"' ./pkg/model/model.pb.go
else
	sed -i '/import (/a\"database/sql/driver"\n"encoding/json"\n"fmt"\n"strings"' ./pkg/model/model.pb.go
fi
cat <<EOF >> ./pkg/model/model.pb.go
func (r *SourceUrl) JsonToSourceUrl(bytes []byte) (out SourceUrl, err error) {
    var (
        mysql      SourceUrl_MySQL
        postgresql SourceUrl_PostgreSQL
        clickhouse SourceUrl_ClickHouse
        kafka      SourceUrl_Kafka
        s3         SourceUrl_S3
        hbase      SourceUrl_Hbase
        ftp        SourceUrl_Ftp
        hdfs       SourceUrl_HDFS
    )

    header := strings.ToLower(strings.Split(string(bytes), ":")[0])

    if strings.Index(header, "mysql") != -1 {
        if err = json.Unmarshal(bytes, &mysql); err != nil {
            return
        }
        out.Source = &mysql
    } else if strings.Index(header, "postgresql") != -1 {
        if err = json.Unmarshal(bytes, &postgresql); err != nil {
            return
        }
        out.Source = &postgresql
    } else if strings.Index(header, "clickhouse") != -1 {
        if err = json.Unmarshal(bytes, &clickhouse); err != nil {
            return
        }
        out.Source = &clickhouse
    } else if strings.Index(header, "kafka") != -1 {
        if err = json.Unmarshal(bytes, &kafka); err != nil {
            return
        }
        out.Source = &kafka
    } else if strings.Index(header, "s3") != -1 {
        if err = json.Unmarshal(bytes, &s3); err != nil {
            return
        }
        out.Source = &s3
    } else if strings.Index(header, "hbase") != -1 {
        if err = json.Unmarshal(bytes, &hbase); err != nil {
            return
        }
        out.Source = &hbase
    } else if strings.Index(header, "ftp") != -1 {
        if err = json.Unmarshal(bytes, &ftp); err != nil {
            return
        }
        out.Source = &ftp
    } else if strings.Index(header, "hdfs") != -1 {
        if err = json.Unmarshal(bytes, &hdfs); err != nil {
            return
        }
        out.Source = &hdfs
    } else {
        err = fmt.Errorf("Unknown header", header)
        return
    }

    return
}

func (r *SourceUrl) SourceUrlToJson(in SourceUrl) ([]byte, error) {
    outbytes, err := json.Marshal(&in.Source)
	return outbytes, err
}

func (r *SourceUrl) Scan(in interface{}) error {
	out, err := r.JsonToSourceUrl(in.([]byte))
    *r = out
    return err
}
func (r *SourceUrl) UnmarshalJSON(in []byte) error {
	out, err := r.JsonToSourceUrl(in)
    *r = out
	return err
}
func (in SourceUrl) Value() (driver.Value, error) {
	r, err := in.SourceUrlToJson(in)
	return string(r), err
}

func (in SourceUrl) MarshalJSON() ([]byte, error) {
	r, err := in.SourceUrlToJson(in)
    return r, err
}

func (r *TableUrl) JsonToTableUrl(bytes []byte) (out TableUrl, err error) {
    var (
        mysql      TableUrl_MySQL
        postgresql TableUrl_PostgreSQL
        clickhouse TableUrl_ClickHouse
        kafka      TableUrl_Kafka
        s3         TableUrl_S3
        hbase      TableUrl_Hbase
        ftp        TableUrl_Ftp
        hdfs       TableUrl_HDFS
    )

    header := strings.ToLower(strings.Split(string(bytes), ":")[0])

    if strings.Index(header, "mysql") != -1 {
        if err = json.Unmarshal(bytes, &mysql); err != nil {
            return
        }
        out.Table = &mysql
    } else if strings.Index(header, "postgresql") != -1 {
        if err = json.Unmarshal(bytes, &postgresql); err != nil {
            return
        }
        out.Table = &postgresql
    } else if strings.Index(header, "clickhouse") != -1 {
        if err = json.Unmarshal(bytes, &clickhouse); err != nil {
            return
        }
        out.Table = &clickhouse
    } else if strings.Index(header, "kafka") != -1 {
        if err = json.Unmarshal(bytes, &kafka); err != nil {
            return
        }
        out.Table = &kafka
    } else if strings.Index(header, "s3") != -1 {
        if err = json.Unmarshal(bytes, &s3); err != nil {
            return
        }
        out.Table = &s3
    } else if strings.Index(header, "hbase") != -1 {
        if err = json.Unmarshal(bytes, &hbase); err != nil {
            return
        }
        out.Table = &hbase
    } else if strings.Index(header, "ftp") != -1 {
        if err = json.Unmarshal(bytes, &ftp); err != nil {
            return
        }
        out.Table = &ftp
    } else if strings.Index(header, "hdfs") != -1 {
        if err = json.Unmarshal(bytes, &hdfs); err != nil {
            return
        }
        out.Table = &hdfs
    } else {
        err = fmt.Errorf("Unknown header", header)
        return
    }

    *r = out
    return
}

func (r *TableUrl) TableUrlToJson(in TableUrl) ([]byte, error) {
    outbytes, err := json.Marshal(&in.Table)
	return outbytes, err
}

func (r *TableUrl) Scan(in interface{}) error {
	out, err := r.JsonToTableUrl(in.([]byte))
    *r = out
    return err
}
func (r *TableUrl) UnmarshalJSON(in []byte) error {
	out, err := r.JsonToTableUrl(in)
    *r = out
	return err
}
func (in TableUrl) Value() (driver.Value, error) {
	r, err := in.TableUrlToJson(in)
	return string(r), err
}

func (in TableUrl) MarshalJSON() ([]byte, error) {
	r, err := in.TableUrlToJson(in)
    return r, err
}

EOF

exit $?
