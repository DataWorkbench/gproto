// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/iaas_proxy.proto

package pbrequest

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
)

func (this *ListIaaSRouters) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) > 1) {
		return protovalidator.FieldError1("ListIaaSRouters", "the byte length of field 'user_id' must be greater than '1'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(len(this.UserId) < 65) {
		return protovalidator.FieldError1("ListIaaSRouters", "the byte length of field 'user_id' must be less than '65'", protovalidator.StringByteLenToString(this.UserId))
	}
	return nil
}

func (this *ListIaaSRouters) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListIaaSRouters", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListIaaSRouters", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListIaaSRouters) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListIaaSRouters", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

// Set default value for message request.ListIaaSRouters
func (this *ListIaaSRouters) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	return nil
}

func (this *ListIaaSRouterVXNets) _xxx_xxx_Validator_Validate_router_id() error {
	if !(strings.HasPrefix(this.RouterId, "rtr-")) {
		return protovalidator.FieldError1("ListIaaSRouterVXNets", "the value of field 'router_id' must start with string 'rtr-'", this.RouterId)
	}
	return nil
}

func (this *ListIaaSRouterVXNets) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListIaaSRouterVXNets", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListIaaSRouterVXNets", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListIaaSRouterVXNets) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListIaaSRouterVXNets", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

// Set default value for message request.ListIaaSRouterVXNets
func (this *ListIaaSRouterVXNets) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_router_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	return nil
}
