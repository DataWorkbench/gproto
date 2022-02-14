// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/stream_instance.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
)

func (this *StreamInstance) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("StreamInstance", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *StreamInstance) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("StreamInstance", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

func (this *StreamInstance) _xxx_xxx_Validator_Validate_version() error {
	if !(len(this.Version) == 16) {
		return protovalidator.FieldError1("StreamInstance", "the byte length of field 'version' must be equal to '16'", protovalidator.StringByteLenToString(this.Version))
	}
	return nil
}

func (this *StreamInstance) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("StreamInstance", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "sti-")) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'id' must start with string 'sti-'", this.Id)
	}
	return nil
}

var _xxx_xxx_Validator_StreamInstance_InEnums_State = map[StreamInstance_State]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true, 6: true, 7: true, 8: true}

func (this *StreamInstance) _xxx_xxx_Validator_Validate_state() error {
	if !(this.State > 0) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'state' must be greater than '0'", protovalidator.Int32ToString(int32(this.State)))
	}
	if !(_xxx_xxx_Validator_StreamInstance_InEnums_State[this.State]) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'state' must in enums of '[0 1 2 3 4 5 6 7 8]'", protovalidator.Int32ToString(int32(this.State)))
	}
	return nil
}

var _xxx_xxx_Validator_StreamInstance_InEnums_Status = map[StreamInstance_Status]bool{0: true, 1: true, 2: true}

func (this *StreamInstance) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_StreamInstance_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'status' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *StreamInstance) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *StreamInstance) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("StreamInstance", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

// Set default value for message model.StreamInstance
func (this *StreamInstance) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_state(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_updated(); err != nil {
		return err
	}
	return nil
}
