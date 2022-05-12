// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/response/account.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

// Set default value for message response.DescribeAccessKey
func (this *DescribeAccessKey) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *DescribeUsers) _xxx_xxx_Validator_Validate_user_set() error {
	for _, item := range this.UserSet {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.DescribeUsers
func (this *DescribeUsers) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_set(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.ValidateRequestSignature
func (this *ValidateRequestSignature) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *CreateUser) _xxx_xxx_Validator_Validate_user() error {
	if dt, ok := interface{}(this.User).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.CreateUser
func (this *CreateUser) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateUser) _xxx_xxx_Validator_Validate_user() error {
	if dt, ok := interface{}(this.User).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.UpdateUser
func (this *UpdateUser) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.DeleteUser
func (this *DeleteUser) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message response.CheckSession
func (this *CheckSession) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message response.CreateSession
func (this *CreateSession) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message response.GetUserRole
func (this *GetUserRole) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *CreateProvider) _xxx_xxx_Validator_Validate_provider() error {
	if dt, ok := interface{}(this.Provider).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.CreateProvider
func (this *CreateProvider) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_provider(); err != nil {
		return err
	}
	return nil
}

func (this *GetProvider) _xxx_xxx_Validator_Validate_provider() error {
	if dt, ok := interface{}(this.Provider).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.GetProvider
func (this *GetProvider) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_provider(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.DeleteProvider
func (this *DeleteProvider) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}
