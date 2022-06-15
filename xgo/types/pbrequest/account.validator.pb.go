// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/account.proto

package pbrequest

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
	strings "strings"
	utf8 "unicode/utf8"
)

// Set default value for message request.DescribeAccessKey
func (this *DescribeAccessKey) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *DescribeUsers) _xxx_xxx_Validator_Validate_users() error {
	if !(len(this.Users) > 0) {
		return protovalidator.FieldError1("DescribeUsers", "the length of field 'users' must be greater than '0'", strconv.Itoa(len(this.Users)))
	}
	if !(len(this.Users) <= 100) {
		return protovalidator.FieldError1("DescribeUsers", "the length of field 'users' must be less than or equal to '100'", strconv.Itoa(len(this.Users)))
	}
	for _, item := range this.Users {
		_ = item // To avoid unused panics.
		if !(strings.HasPrefix(item, "usr-")) {
			return protovalidator.FieldError1("DescribeUsers", "the value of array item where in field 'users' must start with string 'usr-'", item)
		}
	}
	return nil
}

// Set default value for message request.DescribeUsers
func (this *DescribeUsers) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_users(); err != nil {
		return err
	}
	return nil
}

// Set default value for message request.ValidateRequestSignature
func (this *ValidateRequestSignature) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *CreateUser) _xxx_xxx_Validator_Validate_user_name() error {
	if !(utf8.RuneCountInString(this.UserName) >= 2) {
		return protovalidator.FieldError1("CreateUser", "the character length of field 'user_name' must be greater than or equal to '2'", protovalidator.StringCharsetLenToString(this.UserName))
	}
	if !(utf8.RuneCountInString(this.UserName) <= 128) {
		return protovalidator.FieldError1("CreateUser", "the character length of field 'user_name' must be less than or equal to '128'", protovalidator.StringCharsetLenToString(this.UserName))
	}
	return nil
}

func (this *CreateUser) _xxx_xxx_Validator_Validate_password() error {
	if !(utf8.RuneCountInString(this.Password) >= 2) {
		return protovalidator.FieldError1("CreateUser", "the character length of field 'password' must be greater than or equal to '2'", protovalidator.StringCharsetLenToString(this.Password))
	}
	if !(utf8.RuneCountInString(this.Password) <= 128) {
		return protovalidator.FieldError1("CreateUser", "the character length of field 'password' must be less than or equal to '128'", protovalidator.StringCharsetLenToString(this.Password))
	}
	return nil
}

var _xxx_xxx_Validator_CreateUser_In_Lang = map[string]bool{"": true, "cn": true, "en": true}

func (this *CreateUser) _xxx_xxx_Validator_Validate_lang() error {
	if !(_xxx_xxx_Validator_CreateUser_In_Lang[this.Lang]) {
		return protovalidator.FieldError1("CreateUser", "the value of field 'lang' must be one of '[ cn en]'", this.Lang)
	}
	return nil
}

func (this *CreateUser) _xxx_xxx_Validator_Validate_email() error {
	if !(len(this.Email) > 1) {
		return protovalidator.FieldError1("CreateUser", "the byte length of field 'email' must be greater than '1'", protovalidator.StringByteLenToString(this.Email))
	}
	if !(len(this.Email) <= 128) {
		return protovalidator.FieldError1("CreateUser", "the byte length of field 'email' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Email))
	}
	return nil
}

func (this *CreateUser) _xxx_xxx_Validator_Validate_phone() error {
	if !(len(this.Phone) > 1) {
		return protovalidator.FieldError1("CreateUser", "the byte length of field 'phone' must be greater than '1'", protovalidator.StringByteLenToString(this.Phone))
	}
	if !(len(this.Phone) <= 128) {
		return protovalidator.FieldError1("CreateUser", "the byte length of field 'phone' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Phone))
	}
	return nil
}

var _xxx_xxx_Validator_CreateUser_In_Currency = map[string]bool{"": true, "CNY": true, "USD": true}

func (this *CreateUser) _xxx_xxx_Validator_Validate_currency() error {
	if !(_xxx_xxx_Validator_CreateUser_In_Currency[this.Currency]) {
		return protovalidator.FieldError1("CreateUser", "the value of field 'currency' must be one of '[ CNY USD]'", this.Currency)
	}
	return nil
}

// Set default value for message request.CreateUser
func (this *CreateUser) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_password(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_lang(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_email(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_phone(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_currency(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateUser) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) == 20) {
		return protovalidator.FieldError1("UpdateUser", "the byte length of field 'user_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(strings.HasPrefix(this.UserId, "usr-")) {
		return protovalidator.FieldError1("UpdateUser", "the value of field 'user_id' must start with string 'usr-'", this.UserId)
	}
	return nil
}

// Set default value for message request.UpdateUser
func (this *UpdateUser) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteUser) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) == 20) {
		return protovalidator.FieldError1("DeleteUser", "the byte length of field 'user_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(strings.HasPrefix(this.UserId, "usr-")) {
		return protovalidator.FieldError1("DeleteUser", "the value of field 'user_id' must start with string 'usr-'", this.UserId)
	}
	return nil
}

// Set default value for message request.DeleteUser
func (this *DeleteUser) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}

// Set default value for message request.CheckSession
func (this *CheckSession) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *CreateSession) _xxx_xxx_Validator_Validate_user_name() error {
	if !(utf8.RuneCountInString(this.UserName) >= 2) {
		return protovalidator.FieldError1("CreateSession", "the character length of field 'user_name' must be greater than or equal to '2'", protovalidator.StringCharsetLenToString(this.UserName))
	}
	if !(utf8.RuneCountInString(this.UserName) <= 128) {
		return protovalidator.FieldError1("CreateSession", "the character length of field 'user_name' must be less than or equal to '128'", protovalidator.StringCharsetLenToString(this.UserName))
	}
	return nil
}

func (this *CreateSession) _xxx_xxx_Validator_Validate_password() error {
	if !(utf8.RuneCountInString(this.Password) >= 0) {
		return protovalidator.FieldError1("CreateSession", "the character length of field 'password' must be greater than or equal to '0'", protovalidator.StringCharsetLenToString(this.Password))
	}
	if !(utf8.RuneCountInString(this.Password) <= 128) {
		return protovalidator.FieldError1("CreateSession", "the character length of field 'password' must be less than or equal to '128'", protovalidator.StringCharsetLenToString(this.Password))
	}
	return nil
}

// Set default value for message request.CreateSession
func (this *CreateSession) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_password(); err != nil {
		return err
	}
	return nil
}

func (this *CheckUserExists) _xxx_xxx_Validator_Validate_user_name() error {
	if !(utf8.RuneCountInString(this.UserName) >= 2) {
		return protovalidator.FieldError1("CheckUserExists", "the character length of field 'user_name' must be greater than or equal to '2'", protovalidator.StringCharsetLenToString(this.UserName))
	}
	if !(utf8.RuneCountInString(this.UserName) <= 128) {
		return protovalidator.FieldError1("CheckUserExists", "the character length of field 'user_name' must be less than or equal to '128'", protovalidator.StringCharsetLenToString(this.UserName))
	}
	return nil
}

// Set default value for message request.CheckUserExists
func (this *CheckUserExists) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_name(); err != nil {
		return err
	}
	return nil
}

func (this *CreateNotification) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) == 20) {
		return protovalidator.FieldError1("CreateNotification", "the byte length of field 'user_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(strings.HasPrefix(this.UserId, "usr-")) {
		return protovalidator.FieldError1("CreateNotification", "the value of field 'user_id' must start with string 'usr-'", this.UserId)
	}
	return nil
}

// Set default value for message request.CreateNotification
func (this *CreateNotification) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateNotification) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) == 20) {
		return protovalidator.FieldError1("UpdateNotification", "the byte length of field 'user_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(strings.HasPrefix(this.UserId, "usr-")) {
		return protovalidator.FieldError1("UpdateNotification", "the value of field 'user_id' must start with string 'usr-'", this.UserId)
	}
	return nil
}

// Set default value for message request.UpdateNotification
func (this *UpdateNotification) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteNotification) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) == 20) {
		return protovalidator.FieldError1("DeleteNotification", "the byte length of field 'user_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(strings.HasPrefix(this.UserId, "usr-")) {
		return protovalidator.FieldError1("DeleteNotification", "the value of field 'user_id' must start with string 'usr-'", this.UserId)
	}
	return nil
}

// Set default value for message request.DeleteNotification
func (this *DeleteNotification) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}

func (this *GetNotifications) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) == 20) {
		return protovalidator.FieldError1("GetNotifications", "the byte length of field 'user_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UserId))
	}
	if !(strings.HasPrefix(this.UserId, "usr-")) {
		return protovalidator.FieldError1("GetNotifications", "the value of field 'user_id' must start with string 'usr-'", this.UserId)
	}
	return nil
}

// Set default value for message request.GetNotifications
func (this *GetNotifications) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}
