// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/flink_developer.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
)

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("SubmitFlinkJob", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_flink_url() error {
	if !(this.FlinkUrl != "") {
		return protovalidator.FieldError1("SubmitFlinkJob", "the value of field 'flink_url' must be not equal to ''", this.FlinkUrl)
	}
	return nil
}

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_flink_version() error {
	if !(this.FlinkVersion != "") {
		return protovalidator.FieldError1("SubmitFlinkJob", "the value of field 'flink_version' must be not equal to ''", this.FlinkVersion)
	}
	return nil
}

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_args() error {
	if dt, ok := interface{}(this.Args).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_code() error {
	if dt, ok := interface{}(this.Code).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.SubmitFlinkJob
func (this *SubmitFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flink_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_flink_url(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_flink_version(); err != nil {
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

// Set default value for message request.ExecuteFlinkSql
func (this *ExecuteFlinkSql) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *GetFlinkJobStatus) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("GetFlinkJobStatus", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *GetFlinkJobStatus) _xxx_xxx_Validator_Validate_flink_url() error {
	if !(this.FlinkUrl != "") {
		return protovalidator.FieldError1("GetFlinkJobStatus", "the value of field 'flink_url' must be not equal to ''", this.FlinkUrl)
	}
	return nil
}

func (this *GetFlinkJobStatus) _xxx_xxx_Validator_Validate_flink_version() error {
	if !(this.FlinkVersion != "") {
		return protovalidator.FieldError1("GetFlinkJobStatus", "the value of field 'flink_version' must be not equal to ''", this.FlinkVersion)
	}
	return nil
}

// Set default value for message request.GetFlinkJobStatus
func (this *GetFlinkJobStatus) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flink_id(); err != nil {
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

func (this *CancelFlinkJob) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("CancelFlinkJob", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *CancelFlinkJob) _xxx_xxx_Validator_Validate_flink_url() error {
	if !(this.FlinkUrl != "") {
		return protovalidator.FieldError1("CancelFlinkJob", "the value of field 'flink_url' must be not equal to ''", this.FlinkUrl)
	}
	return nil
}

func (this *CancelFlinkJob) _xxx_xxx_Validator_Validate_flink_version() error {
	if !(this.FlinkVersion != "") {
		return protovalidator.FieldError1("CancelFlinkJob", "the value of field 'flink_version' must be not equal to ''", this.FlinkVersion)
	}
	return nil
}

// Set default value for message request.CancelFlinkJob
func (this *CancelFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flink_id(); err != nil {
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

func (this *ValidateFlinkJob) _xxx_xxx_Validator_Validate_code() error {
	if dt, ok := interface{}(this.Code).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.ValidateFlinkJob
func (this *ValidateFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_code(); err != nil {
		return err
	}
	return nil
}

func (this *GetFlinkJobsByUrl) _xxx_xxx_Validator_Validate_flink_url() error {
	if !(this.FlinkUrl != "") {
		return protovalidator.FieldError1("GetFlinkJobsByUrl", "the value of field 'flink_url' must be not equal to ''", this.FlinkUrl)
	}
	return nil
}

// Set default value for message request.GetFlinkJobsByUrl
func (this *GetFlinkJobsByUrl) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flink_url(); err != nil {
		return err
	}
	return nil
}
