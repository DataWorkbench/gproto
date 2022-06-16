// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/account.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
	strings "strings"
)

// Set default value for message model.User
func (this *User) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *Role) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("Role", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "ros-")) {
		return protovalidator.FieldError1("Role", "the value of field 'id' must start with string 'ros-'", this.Id)
	}
	return nil
}

var _xxx_xxx_Validator_Role_InEnums_Type = map[Role_Type]bool{0: true, 1: true, 2: true, 3: true, 4: true}

func (this *Role) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type > 0) {
		return protovalidator.FieldError1("Role", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_Role_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("Role", "the value of field 'type' must in enums of '[0 1 2 3 4]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

func (this *Role) _xxx_xxx_Validator_Validate_name() error {
	if !(this.Name != "") {
		return protovalidator.FieldError1("Role", "the value of field 'name' must be not equal to ''", this.Name)
	}
	return nil
}

// Set default value for message model.Role
func (this *Role) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	return nil
}

func (this *AdminModule) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("AdminModule", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "pmo-")) {
		return protovalidator.FieldError1("AdminModule", "the value of field 'id' must start with string 'pmo-'", this.Id)
	}
	return nil
}

var _xxx_xxx_Validator_AdminModule_InEnums_Classify = map[AdminModule_Classify]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true}

func (this *AdminModule) _xxx_xxx_Validator_Validate_classify() error {
	if !(this.Classify > 0) {
		return protovalidator.FieldError1("AdminModule", "the value of field 'classify' must be greater than '0'", protovalidator.Int32ToString(int32(this.Classify)))
	}
	if !(_xxx_xxx_Validator_AdminModule_InEnums_Classify[this.Classify]) {
		return protovalidator.FieldError1("AdminModule", "the value of field 'classify' must in enums of '[0 1 2 3 4 5]'", protovalidator.Int32ToString(int32(this.Classify)))
	}
	return nil
}

func (this *AdminModule) _xxx_xxx_Validator_Validate_name() error {
	if !(this.Name != "") {
		return protovalidator.FieldError1("AdminModule", "the value of field 'name' must be not equal to ''", this.Name)
	}
	return nil
}

func (this *AdminModule) _xxx_xxx_Validator_Validate_api_lists() error {
	for _, item := range this.ApiLists {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message model.AdminModule
func (this *AdminModule) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_classify(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_api_lists(); err != nil {
		return err
	}
	return nil
}

func (this *AdminAPI) _xxx_xxx_Validator_Validate_api_name() error {
	if !(this.ApiName != "") {
		return protovalidator.FieldError1("AdminAPI", "the value of field 'api_name' must be not equal to ''", this.ApiName)
	}
	return nil
}

func (this *AdminAPI) _xxx_xxx_Validator_Validate_display_name() error {
	if !(this.DisplayName != "") {
		return protovalidator.FieldError1("AdminAPI", "the value of field 'display_name' must be not equal to ''", this.DisplayName)
	}
	return nil
}

var _xxx_xxx_Validator_AdminAPI_InEnums_PermType = map[AdminAPI_PermType]bool{0: true, 1: true, 2: true}

func (this *AdminAPI) _xxx_xxx_Validator_Validate_perm_type() error {
	if !(this.PermType > 0) {
		return protovalidator.FieldError1("AdminAPI", "the value of field 'perm_type' must be greater than '0'", protovalidator.Int32ToString(int32(this.PermType)))
	}
	if !(_xxx_xxx_Validator_AdminAPI_InEnums_PermType[this.PermType]) {
		return protovalidator.FieldError1("AdminAPI", "the value of field 'perm_type' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.PermType)))
	}
	return nil
}

func (this *AdminAPI) _xxx_xxx_Validator_Validate_permissions() error {
	if !(len(this.Permissions) > 0) {
		return protovalidator.FieldError1("AdminAPI", "the length of field 'permissions' must be greater than '0'", strconv.Itoa(len(this.Permissions)))
	}
	for _, item := range this.Permissions {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *AdminAPI) _xxx_xxx_Validator_Validate_roles() error {
	if !(len(this.Roles) > 0) {
		return protovalidator.FieldError1("AdminAPI", "the length of field 'roles' must be greater than '0'", strconv.Itoa(len(this.Roles)))
	}
	return nil
}

// Set default value for message model.AdminAPI
func (this *AdminAPI) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_api_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_display_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_perm_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_permissions(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_roles(); err != nil {
		return err
	}
	return nil
}

func (this *AdminAPI_Permission) _xxx_xxx_Validator_Validate_role() error {
	if dt, ok := interface{}(this.Role).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.AdminAPI.Permission
func (this *AdminAPI_Permission) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_role(); err != nil {
		return err
	}
	return nil
}

// Set default value for message model.Notification
func (this *Notification) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}
