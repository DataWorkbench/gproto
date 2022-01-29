#!/usr/bin/env bash
# Generate protobuf code for python

if ! [[ "$0" =~ scripts/generate_python.sh ]]; then
	echo "must be run from repository root"
	exit 255
fi

current_path=$(cd "$(dirname "${0}")" || exit 1; pwd)

# load project env.
if [ -f "./project_env.sh" ]; then
  . ./project_env.sh
fi

# install dep package.
sh "${current_path}/ensure_dep.sh"

cd "${current_path}"/.. || exit 1

GOPATH=$(go env GOPATH)

output_dir="./src/python"

# generate code
process_file() {
  file="$1"

  echo "generate Python code with proto file {$file}"
  python -m grpc_tools.protoc -I. -I./proto -I"${GOPATH}"/src --python_out="$output_dir" "$file"

#  # generate python code.
#  protoc -I. -I./proto -I"${GOPATH}"/src --python_out=src/ "$file"
#  # generate python grpc code.
#  protoc -I. -I./proto -I"${GOPATH}"/src --grpc-python_out=src/  "$file"
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


