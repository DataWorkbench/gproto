// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/developer.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
)

func (this *SubmitFlinkJobV2) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("SubmitFlinkJobV2", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *SubmitFlinkJobV2) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SubmitFlinkJobV2", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	return nil
}

func (this *SubmitFlinkJobV2) _xxx_xxx_Validator_Validate_args() error {
	if dt, ok := interface{}(this.Args).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SubmitFlinkJobV2) _xxx_xxx_Validator_Validate_code() error {
	if dt, ok := interface{}(this.Code).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.SubmitFlinkJob_v2
func (this *SubmitFlinkJobV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flink_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_args(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_code(); err != nil {
		return err
	}
	return nil
}

func (this *GetFlinkJobV2) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("GetFlinkJobV2", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *GetFlinkJobV2) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("GetFlinkJobV2", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	return nil
}

func (this *GetFlinkJobV2) _xxx_xxx_Validator_Validate_cluster_id() error {
	if !(len(this.ClusterId) == 20) {
		return protovalidator.FieldError1("GetFlinkJobV2", "the byte length of field 'cluster_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ClusterId))
	}
	return nil
}

// Set default value for message request.GetFlinkJob_v2
func (this *GetFlinkJobV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flink_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_cluster_id(); err != nil {
		return err
	}
	return nil
}

func (this *CancelFlinkJobV2) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("CancelFlinkJobV2", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *CancelFlinkJobV2) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("CancelFlinkJobV2", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	return nil
}

func (this *CancelFlinkJobV2) _xxx_xxx_Validator_Validate_cluster_id() error {
	if !(len(this.ClusterId) == 20) {
		return protovalidator.FieldError1("CancelFlinkJobV2", "the byte length of field 'cluster_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ClusterId))
	}
	return nil
}

// Set default value for message request.CancelFlinkJob_v2
func (this *CancelFlinkJobV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flink_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_cluster_id(); err != nil {
		return err
	}
	return nil
}

func (this *ValidateFlinkJobV2) _xxx_xxx_Validator_Validate_code() error {
	if dt, ok := interface{}(this.Code).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.ValidateFlinkJob_v2
func (this *ValidateFlinkJobV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_code(); err != nil {
		return err
	}
	return nil
}
