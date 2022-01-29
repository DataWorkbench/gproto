#!/usr/bin/env bash
# Generate protobuf code for java


if ! [[ "$0" =~ scripts/generate_java.sh ]]; then
	echo "must be run from repository root"
	exit 255
fi

current_path=$(cd "$(dirname "${0}")" || exit 1; pwd)

# load project env.
if [ -f "./project_env.sh" ]; then
  . ./project_env.sh
fi

## install dep package.
#sh "${current_path}/ensure_dep.sh"

cd "${current_path}"/.. || exit 1

GOPATH=$(go env GOPATH)

# check java version.
if ! java -version 2>&1 |grep 'java version "11.' >/dev/null ; then
  echo "Error: the java not install or version not 11"
  exit 1
fi

output_dir="./src/main/java"

# generate code
process_file() {
  file="$1"

  echo "generate Java code with proto file {$file}"
  # generate java code.
  protoc -I. -I./proto -I"${GOPATH}"/src --java_out="$output_dir" "$file"
  # generate java grpc code.
  protoc -I. -I./proto -I"${GOPATH}"/src --grpc-java_out="$output_dir"  "$file"
#  protoc -I. -I./proto -I"${GOPATH}"/src --plugin=protoc-gen-grpc-java="${HOME}"/tmp/protoc-gen-grpc-java-1.38.0-osx-x86_64.exe --java_out=src/main/java  --grpc-java_out=src/main/java "$file"
}

process_loop() {
  # shellcheck disable=SC2045
  for file in $(ls "$1")
  do
    path="$1"/"$file"
    if [ -d "$path" ]
    then
      process_loop "$path"
    else
      process_file "$path"
    fi
  done
}

# To avoids invalid code residue.
/bin/rm -fr "$output_dir"
mkdir -p "$output_dir"
# read proto files.
process_loop ./proto

#if git status |grep 'src/main/java' >/dev/null; then
#  echo "mvn clean package deploy"
#  mvn clean package deploy >/dev/null 2>&1 || exit $?
#else
#  echo "no java code generated, skip mvn deploy"
#fi

exit $?
