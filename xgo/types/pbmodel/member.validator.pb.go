// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/member.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
)

func (this *Role) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("Role", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("Role", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *Role) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("Role", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

func (this *Role) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) >= 1) {
		return protovalidator.FieldError1("Role", "the byte length of field 'name' must be greater than or equal to '1'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 128) {
		return protovalidator.FieldError1("Role", "the byte length of field 'name' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

var _xxx_xxx_Validator_Role_InEnums_Type = map[Role_Type]bool{0: true, 1: true, 2: true}

func (this *Role) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type > 0) {
		return protovalidator.FieldError1("Role", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_Role_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("Role", "the value of field 'type' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

var _xxx_xxx_Validator_Role_InEnums_Status = map[Role_Status]bool{0: true, 1: true, 2: true}

func (this *Role) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("Role", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_Role_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("Role", "the value of field 'status' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

// Set default value for message model.Role
func (this *Role) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	return nil
}

func (this *Member) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("Member", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("Member", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *Member) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) <= 64) {
		return protovalidator.FieldError1("Member", "the byte length of field 'user_id' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.UserId))
	}
	return nil
}

var _xxx_xxx_Validator_Member_InEnums_Status = map[Member_Status]bool{0: true, 1: true, 2: true}

func (this *Member) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("Member", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_Member_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("Member", "the value of field 'status' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *Member) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("Member", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *Member) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("Member", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

func (this *Member) _xxx_xxx_Validator_Validate_user_info() error {
	if dt, ok := interface{}(this.UserInfo).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *Member) _xxx_xxx_Validator_Validate_roles() error {
	for _, item := range this.Roles {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message model.Member
func (this *Member) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
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
	if err := this._xxx_xxx_Validator_Validate_user_info(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_roles(); err != nil {
		return err
	}
	return nil
}
