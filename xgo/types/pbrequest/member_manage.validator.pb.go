// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/member_manage.proto

package pbrequest

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
	strings "strings"
	utf8 "unicode/utf8"
)

func (this *ListAvailableUsers) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListAvailableUsers", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListAvailableUsers", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

// Set default value for message request.ListAvailableUsers
func (this *ListAvailableUsers) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	return nil
}

func (this *ListMembers) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ListMembers", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ListMembers", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *ListMembers) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListMembers", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListMembers", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListMembers) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListMembers", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListMembers_In_SortBy = map[string]bool{"": true, "user_id": true, "created": true, "updated": true}

func (this *ListMembers) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListMembers_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListMembers", "the value of field 'sort_by' must be one of '[ user_id created updated]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListMembers
func (this *ListMembers) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteMembers) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DeleteMembers", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DeleteMembers", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DeleteMembers) _xxx_xxx_Validator_Validate_user_ids() error {
	if !(len(this.UserIds) <= 100) {
		return protovalidator.FieldError1("DeleteMembers", "the length of field 'user_ids' must be less than or equal to '100'", strconv.Itoa(len(this.UserIds)))
	}
	return nil
}

// Set default value for message request.DeleteMembers
func (this *DeleteMembers) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_user_ids(); err != nil {
		return err
	}
	return nil
}

func (this *AddMembers) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("AddMembers", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("AddMembers", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *AddMembers) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) > 0) {
		return protovalidator.FieldError1("AddMembers", "the byte length of field 'created_by' must be greater than '0'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	if !(len(this.CreatedBy) < 65) {
		return protovalidator.FieldError1("AddMembers", "the byte length of field 'created_by' must be less than '65'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

func (this *AddMembers) _xxx_xxx_Validator_Validate_space_owner() error {
	if !(this.SpaceOwner != "") {
		return protovalidator.FieldError1("AddMembers", "the value of field 'space_owner' must be not equal to ''", this.SpaceOwner)
	}
	return nil
}

func (this *AddMembers) _xxx_xxx_Validator_Validate_user_ids() error {
	if !(len(this.UserIds) > 0) {
		return protovalidator.FieldError1("AddMembers", "the length of field 'user_ids' must be greater than '0'", strconv.Itoa(len(this.UserIds)))
	}
	if !(len(this.UserIds) <= 100) {
		return protovalidator.FieldError1("AddMembers", "the length of field 'user_ids' must be less than or equal to '100'", strconv.Itoa(len(this.UserIds)))
	}
	return nil
}

func (this *AddMembers) _xxx_xxx_Validator_Validate_system_role_ids() error {
	if !(len(this.SystemRoleIds) > 0) {
		return protovalidator.FieldError1("AddMembers", "the length of field 'system_role_ids' must be greater than '0'", strconv.Itoa(len(this.SystemRoleIds)))
	}
	if !(protovalidator.SliceIsUniqueString(this.SystemRoleIds)) {
		return protovalidator.FieldError2("AddMembers", "the array elements in field 'system_role_ids' must be unique")
	}
	for _, item := range this.SystemRoleIds {
		_ = item // To avoid unused panics.
		if !(strings.HasPrefix(item, "ros-")) {
			return protovalidator.FieldError1("AddMembers", "the value of array item where in field 'system_role_ids' must start with string 'ros-'", item)
		}
	}
	return nil
}

func (this *AddMembers) _xxx_xxx_Validator_Validate_desc() error {
	if !(utf8.RuneCountInString(this.Desc) <= 1024) {
		return protovalidator.FieldError1("AddMembers", "the character length of field 'desc' must be less than or equal to '1024'", protovalidator.StringCharsetLenToString(this.Desc))
	}
	return nil
}

// Set default value for message request.AddMembers
func (this *AddMembers) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_space_owner(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_user_ids(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_system_role_ids(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_desc(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateMember) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("UpdateMember", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("UpdateMember", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *UpdateMember) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) > 0) {
		return protovalidator.FieldError1("UpdateMember", "the byte length of field 'user_id' must be greater than '0'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(len(this.UserId) < 65) {
		return protovalidator.FieldError1("UpdateMember", "the byte length of field 'user_id' must be less than '65'", protovalidator.StringByteLenToString(this.UserId))
	}
	return nil
}

func (this *UpdateMember) _xxx_xxx_Validator_Validate_system_role_ids() error {
	if !(len(this.SystemRoleIds) > 0) {
		return protovalidator.FieldError1("UpdateMember", "the length of field 'system_role_ids' must be greater than '0'", strconv.Itoa(len(this.SystemRoleIds)))
	}
	if !(protovalidator.SliceIsUniqueString(this.SystemRoleIds)) {
		return protovalidator.FieldError2("UpdateMember", "the array elements in field 'system_role_ids' must be unique")
	}
	for _, item := range this.SystemRoleIds {
		_ = item // To avoid unused panics.
		if !(strings.HasPrefix(item, "ros-")) {
			return protovalidator.FieldError1("UpdateMember", "the value of array item where in field 'system_role_ids' must start with string 'ros-'", item)
		}
	}
	return nil
}

func (this *UpdateMember) _xxx_xxx_Validator_Validate_desc() error {
	if !(utf8.RuneCountInString(this.Desc) <= 1024) {
		return protovalidator.FieldError1("UpdateMember", "the character length of field 'desc' must be less than or equal to '1024'", protovalidator.StringCharsetLenToString(this.Desc))
	}
	return nil
}

// Set default value for message request.UpdateMember
func (this *UpdateMember) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_system_role_ids(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_desc(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeMember) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DescribeMember", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DescribeMember", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DescribeMember) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) > 0) {
		return protovalidator.FieldError1("DescribeMember", "the byte length of field 'user_id' must be greater than '0'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(len(this.UserId) < 65) {
		return protovalidator.FieldError1("DescribeMember", "the byte length of field 'user_id' must be less than '65'", protovalidator.StringByteLenToString(this.UserId))
	}
	return nil
}

// Set default value for message request.DescribeMember
func (this *DescribeMember) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}
