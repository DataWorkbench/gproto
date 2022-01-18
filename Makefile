# Copyright (C) 2020 Yunify, Inc.

VERBOSE = no

.PHONY: help
help:
	@echo "Please use \`make <target>\` where <target> is one of"
	@echo "  format  to format the code"
	@echo "  vet     to run golang vet"
	@echo "  lint    to run the staticcheck"
	@echo "  check   to format, vet, lint"
	@echo "  test    to run test case"
	@echo "  generate to generate protobuf code"
	@echo "  generate-go to generate protobuf code for go"
	@echo "  generate-java to generate protobuf code for java"
	@exit 0


GENERATE_GO = _generate_go() {                     \
    args="$(filter-out $@,$(MAKECMDGOALS))"; \
    if [[ $(VERBOSE) = "yes" ]]; then        \
        bash -x scripts/generate_go.sh $$args;  \
    else                                     \
        bash scripts/generate_go.sh $$args;      \
    fi                                       \
}

GENERATE_JAVA = _generate_java() {                     \
    args="$(filter-out $@,$(MAKECMDGOALS))"; \
    if [[ $(VERBOSE) = "yes" ]]; then        \
        bash -x scripts/generate_java.sh $$args;  \
    else                                     \
        bash scripts/generate_java.sh $$args;      \
    fi                                       \
}

.PHONY: format
format:
	@[[ ${VERBOSE} = "yes" ]] && set -x; go fmt ./...;

.PHONY: vet
vet:
	@[[ ${VERBOSE} = "yes" ]] && set -x; go vet ./...;

.PHONY: lint
lint:
	@[[ ${VERBOSE} = "yes" ]] && set -x; staticcheck ./...;

.PHONY: tidy
tidy:
	@[[ ${VERBOSE} = "yes" ]] && set -x; go mod tidy;

.PHONY: check
check: tidy format vet lint

.PHONY: test
test:
	@[[ ${VERBOSE} = "yes" ]] && set -x; go test -race -v ./... -test.count=1 -failfast

.PHONY: generate-go
generate-go:
	@$(GENERATE_GO); _generate_go;

.PHONY: generate-java
generate-java:
	@$(GENERATE_JAVA); _generate_java;

.PHONY: generate
generate: generate-go generate-java
#	@$(GENERATE_CODE); _generate_code;

.DEFAULT_GOAL = help

# Target name % means that it is a rule that matches anything, @: is a recipe;
# the : means do nothing
%:
	@:

