// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator v0.1
// source: proto/types/request/job_manage.proto

package pbrequest

import (
	pbmodel "github.com/DataWorkbench/gproto/pkg/types/pbmodel"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/validatorpb"
	protovalidator "github.com/yu31/proto-go-plugin/pkg/protovalidator"
)

func (this *FreeFlinkJob) _xxx_xxx_Validator_Validate_instance_id() error {
	if !(len(this.InstanceId) == 20) {
		return protovalidator.FieldError1("FreeFlinkJob", "the byte length of field 'instance_id' must be equal to '20'", protovalidator.StringByteLenToString(this.InstanceId))
	}
	return nil
}

func (this *FreeFlinkJob) _xxx_xxx_Validator_Validate_note_id() error {
	if !(len(this.NoteId) == 9) {
		return protovalidator.FieldError1("FreeFlinkJob", "the byte length of field 'note_id' must be equal to '9'", protovalidator.StringByteLenToString(this.NoteId))
	}
	return nil
}

// Set default value for message request.FreeFlinkJob
func (this *FreeFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_instance_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_note_id(); err != nil {
		return err
	}
	return nil
}

func (this *InitFlinkJob) _xxx_xxx_Validator_Validate_instance_id() error {
	if !(len(this.InstanceId) == 20) {
		return protovalidator.FieldError1("InitFlinkJob", "the byte length of field 'instance_id' must be equal to '20'", protovalidator.StringByteLenToString(this.InstanceId))
	}
	return nil
}

func (this *InitFlinkJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("InitFlinkJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	return nil
}

func (this *InitFlinkJob) _xxx_xxx_Validator_Validate_args() error {
	if dt, ok := interface{}(this.Args).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *InitFlinkJob) _xxx_xxx_Validator_Validate_code() error {
	if dt, ok := interface{}(this.Code).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.InitFlinkJob
func (this *InitFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_instance_id(); err != nil {
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

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_instance_id() error {
	if !(len(this.InstanceId) == 20) {
		return protovalidator.FieldError1("SubmitFlinkJob", "the byte length of field 'instance_id' must be equal to '20'", protovalidator.StringByteLenToString(this.InstanceId))
	}
	return nil
}

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_note_id() error {
	if !(len(this.NoteId) == 9) {
		return protovalidator.FieldError1("SubmitFlinkJob", "the byte length of field 'note_id' must be equal to '9'", protovalidator.StringByteLenToString(this.NoteId))
	}
	return nil
}

var _xxx_xxx_Validator_SubmitFlinkJob_InEnums_Type = map[pbmodel.StreamJob_Type]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true}

func (this *SubmitFlinkJob) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type > 0) {
		return protovalidator.FieldError1("SubmitFlinkJob", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_SubmitFlinkJob_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("SubmitFlinkJob", "the value of field 'type' must in enums of '[0 1 2 3 4 5]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

// Set default value for message request.SubmitFlinkJob
func (this *SubmitFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_instance_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_note_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	return nil
}

func (this *GetFlinkJob) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("GetFlinkJob", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *GetFlinkJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("GetFlinkJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	return nil
}

func (this *GetFlinkJob) _xxx_xxx_Validator_Validate_cluster_id() error {
	if !(len(this.ClusterId) == 20) {
		return protovalidator.FieldError1("GetFlinkJob", "the byte length of field 'cluster_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ClusterId))
	}
	return nil
}

// Set default value for message request.GetFlinkJob
func (this *GetFlinkJob) Validate() error {
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

func (this *CancelFlinkJob) _xxx_xxx_Validator_Validate_flink_id() error {
	if !(len(this.FlinkId) == 32) {
		return protovalidator.FieldError1("CancelFlinkJob", "the byte length of field 'flink_id' must be equal to '32'", protovalidator.StringByteLenToString(this.FlinkId))
	}
	return nil
}

func (this *CancelFlinkJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("CancelFlinkJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	return nil
}

func (this *CancelFlinkJob) _xxx_xxx_Validator_Validate_cluster_id() error {
	if !(len(this.ClusterId) == 20) {
		return protovalidator.FieldError1("CancelFlinkJob", "the byte length of field 'cluster_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ClusterId))
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
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_cluster_id(); err != nil {
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
