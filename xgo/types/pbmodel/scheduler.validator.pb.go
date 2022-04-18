// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/scheduler.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
)

func (this *StreamJobEvent) _xxx_xxx_Validator_Validate_property() error {
	if !(this.Property != nil) {
		return protovalidator.FieldError2("StreamJobEvent", "the value of field 'property' cannot be null")
	}
	if dt, ok := interface{}(this.Property).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *StreamJobEvent) _xxx_xxx_Validator_Validate_flink_url() error {
	if !(this.FlinkUrl != "") {
		return protovalidator.FieldError1("StreamJobEvent", "the value of field 'flink_url' must be not equal to ''", this.FlinkUrl)
	}
	return nil
}

func (this *StreamJobEvent) _xxx_xxx_Validator_Validate_flink_version() error {
	if !(this.FlinkVersion != "") {
		return protovalidator.FieldError1("StreamJobEvent", "the value of field 'flink_version' must be not equal to ''", this.FlinkVersion)
	}
	return nil
}

// Set default value for message model.StreamJobEvent
func (this *StreamJobEvent) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_property(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_flink_url(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_flink_version(); err != nil {
		return err
	}
	return nil
}

func (this *SyncJobEvent) _xxx_xxx_Validator_Validate_property() error {
	if !(this.Property != nil) {
		return protovalidator.FieldError2("SyncJobEvent", "the value of field 'property' cannot be null")
	}
	if dt, ok := interface{}(this.Property).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobEvent) _xxx_xxx_Validator_Validate_flink_url() error {
	if !(this.FlinkUrl != "") {
		return protovalidator.FieldError1("SyncJobEvent", "the value of field 'flink_url' must be not equal to ''", this.FlinkUrl)
	}
	return nil
}

func (this *SyncJobEvent) _xxx_xxx_Validator_Validate_flink_version() error {
	if !(this.FlinkVersion != "") {
		return protovalidator.FieldError1("SyncJobEvent", "the value of field 'flink_version' must be not equal to ''", this.FlinkVersion)
	}
	return nil
}

// Set default value for message model.SyncJobEvent
func (this *SyncJobEvent) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_property(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_flink_url(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_flink_version(); err != nil {
		return err
	}
	return nil
}
