#!/usr/bin/env bash
# Generate protobuf code for java


if ! [[ "$0" =~ scripts/generate_java.sh ]]; then
	echo "must be run from repository root"
	exit 255
fi

current_path=$(cd "$(dirname "${0}")" || exit 1; pwd)

# install dep package.
sh "${current_path}/ensure_dep.sh"

# load project env.
if [ -f "./project_env.sh" ]; then
  . ./project_env.sh
fi

cd "${current_path}"/.. || exit 1

GOPATH=$(go env GOPATH)

# check java version.
if ! java -version 2>&1 |grep 'java version "11.' >/dev/null ; then
  echo "Error: the java not install or version not 11"
  exit 1
fi

# generate code
for f in proto/*.proto;do
  echo "generate java code for proto file {$f}"

  # generate java code.
  protoc -I. -I./proto -I"${GOPATH}"/src --java_out=src/main/java "$f"

  # generate java grpc code.
  protoc -I. -I./proto -I"${GOPATH}"/src --grpc-java_out=src/main/java  "$f"

#  protoc -I. -I./proto -I"${GOPATH}"/src --plugin=protoc-gen-grpc-java="${HOME}"/tmp/protoc-gen-grpc-java-1.38.0-osx-x86_64.exe --java_out=src/main/java  --grpc-java_out=src/main/java "$f"
done

if git status |grep 'src/main/java' >/dev/null; then
  echo "mvn clean package deploy"
  mvn clean package deploy >/dev/null 2>&1 || exit $?
else
  echo "no java code generated, skip mvn deploy"
fi

exit $?
