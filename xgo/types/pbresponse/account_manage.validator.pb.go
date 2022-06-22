// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/response/account_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
)

func (this *ListUsers) _xxx_xxx_Validator_Validate_infos() error {
	for _, item := range this.Infos {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.ListUsers
func (this *ListUsers) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeUser) _xxx_xxx_Validator_Validate_user_set() error {
	if dt, ok := interface{}(this.UserSet).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.DescribeUser
func (this *DescribeUser) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_set(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.CreateUser
func (this *CreateUser) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *ListAccessKeys) _xxx_xxx_Validator_Validate_infos() error {
	for _, item := range this.Infos {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.ListAccessKeys
func (this *ListAccessKeys) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeAccessKey) _xxx_xxx_Validator_Validate_key_set() error {
	if dt, ok := interface{}(this.KeySet).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.DescribeAccessKey
func (this *DescribeAccessKey) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_key_set(); err != nil {
		return err
	}
	return nil
}

func (this *CreateAccessKey) _xxx_xxx_Validator_Validate_access_key_id() error {
	if !(this.AccessKeyId != "") {
		return protovalidator.FieldError1("CreateAccessKey", "the value of field 'access_key_id' must be not equal to ''", this.AccessKeyId)
	}
	return nil
}

func (this *CreateAccessKey) _xxx_xxx_Validator_Validate_secret_access_key() error {
	if !(this.SecretAccessKey != "") {
		return protovalidator.FieldError1("CreateAccessKey", "the value of field 'secret_access_key' must be not equal to ''", this.SecretAccessKey)
	}
	return nil
}

// Set default value for message response.CreateAccessKey
func (this *CreateAccessKey) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_access_key_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_secret_access_key(); err != nil {
		return err
	}
	return nil
}

func (this *CheckSession) _xxx_xxx_Validator_Validate_user_set() error {
	if dt, ok := interface{}(this.UserSet).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *CheckSession) _xxx_xxx_Validator_Validate_key_set() error {
	if dt, ok := interface{}(this.KeySet).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.CheckSession
func (this *CheckSession) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_set(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_key_set(); err != nil {
		return err
	}
	return nil
}

func (this *CreateSession) _xxx_xxx_Validator_Validate_user_set() error {
	if dt, ok := interface{}(this.UserSet).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.CreateSession
func (this *CreateSession) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_set(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.CreateNotification
func (this *CreateNotification) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *ListNotifications) _xxx_xxx_Validator_Validate_infos() error {
	for _, item := range this.Infos {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.ListNotifications
func (this *ListNotifications) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeNotification) _xxx_xxx_Validator_Validate_nf_set() error {
	if dt, ok := interface{}(this.NfSet).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.DescribeNotification
func (this *DescribeNotification) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_nf_set(); err != nil {
		return err
	}
	return nil
}
