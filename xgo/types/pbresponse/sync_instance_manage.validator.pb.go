// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/response/sync_instance_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

func (this *ListSyncInstances) _xxx_xxx_Validator_Validate_infos() error {
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

// Set default value for message response.ListSyncInstances
func (this *ListSyncInstances) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeSyncInstance) _xxx_xxx_Validator_Validate_info() error {
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message response.DescribeSyncInstance
func (this *DescribeSyncInstance) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}