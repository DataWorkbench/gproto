// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/response/account_proxy.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

func (this *DescribeAccessKeyByProxy) _xxx_xxx_Validator_Validate_key_set() error {
	if dt, ok := interface{}(this.KeySet).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.DescribeAccessKeyByProxy
func (this *DescribeAccessKeyByProxy) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_key_set(); err != nil {
		return err
	}
	return nil
}

func (this *ListUsersByProxy) _xxx_xxx_Validator_Validate_infos() error {
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

// Set default value for message response.ListUsersByProxy
func (this *ListUsersByProxy) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

func (this *ListNotificationsByProxy) _xxx_xxx_Validator_Validate_infos() error {
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

// Set default value for message response.ListNotificationsByProxy
func (this *ListNotificationsByProxy) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}
