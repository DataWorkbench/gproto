// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/workspace.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
)

func (this *Workspace) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("Workspace", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "wks-")) {
		return protovalidator.FieldError1("Workspace", "the value of field 'id' must start with string 'wks-'", this.Id)
	}
	return nil
}

func (this *Workspace) _xxx_xxx_Validator_Validate_owner() error {
	if !(len(this.Owner) <= 64) {
		return protovalidator.FieldError1("Workspace", "the byte length of field 'owner' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Owner))
	}
	return nil
}

func (this *Workspace) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) > 1) {
		return protovalidator.FieldError1("Workspace", "the byte length of field 'name' must be greater than '1'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 128) {
		return protovalidator.FieldError1("Workspace", "the byte length of field 'name' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

var _xxx_xxx_Validator_Workspace_InEnums_Status = map[Workspace_Status]bool{0: true, 1: true, 2: true, 3: true}

func (this *Workspace) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("Workspace", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_Workspace_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("Workspace", "the value of field 'status' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *Workspace) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("Workspace", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *Workspace) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("Workspace", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

// Set default value for message model.Workspace
func (this *Workspace) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_owner(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_updated(); err != nil {
		return err
	}
	return nil
}

func (this *NetworkConfig) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("NetworkConfig", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("NetworkConfig", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *NetworkConfig) _xxx_xxx_Validator_Validate_router_id() error {
	if !(strings.HasPrefix(this.RouterId, "rtr-")) {
		return protovalidator.FieldError1("NetworkConfig", "the value of field 'router_id' must start with string 'rtr-'", this.RouterId)
	}
	return nil
}

func (this *NetworkConfig) _xxx_xxx_Validator_Validate_vxnet_id() error {
	if !(strings.HasPrefix(this.VxnetId, "vxnet-")) {
		return protovalidator.FieldError1("NetworkConfig", "the value of field 'vxnet_id' must start with string 'vxnet-'", this.VxnetId)
	}
	return nil
}

var _xxx_xxx_Validator_NetworkConfig_InEnums_Status = map[NetworkConfig_Status]bool{0: true, 1: true, 2: true}

func (this *NetworkConfig) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("NetworkConfig", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_NetworkConfig_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("NetworkConfig", "the value of field 'status' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *NetworkConfig) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("NetworkConfig", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *NetworkConfig) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("NetworkConfig", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

// Set default value for message model.NetworkConfig
func (this *NetworkConfig) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_router_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_vxnet_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_updated(); err != nil {
		return err
	}
	return nil
}
