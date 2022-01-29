// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator v0.1
// source: proto/types/request/stream_instance_manage.proto

package pbrequest

import (
	pbmodel "github.com/DataWorkbench/gproto/pkg/types/pbmodel"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/defaultspb"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/validatorpb"
	protovalidator "github.com/yu31/proto-go-plugin/pkg/protovalidator"
	strings "strings"
)

func (this *ListStreamInstances) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListStreamInstances", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListStreamInstances", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListStreamInstances) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListStreamInstances", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

func (this *ListStreamInstances) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ListStreamInstances", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ListStreamInstances", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

var _xxx_xxx_Validator_ListStreamInstances_InEnums_State = map[pbmodel.StreamInstance_State]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true, 6: true, 7: true, 8: true}

func (this *ListStreamInstances) _xxx_xxx_Validator_Validate_state() error {
	if !(_xxx_xxx_Validator_ListStreamInstances_InEnums_State[this.State]) {
		return protovalidator.FieldError1("ListStreamInstances", "the value of field 'state' must in enums of '[0 1 2 3 4 5 6 7 8]'", protovalidator.Int32ToString(int32(this.State)))
	}
	return nil
}

var _xxx_xxx_Validator_ListStreamInstances_In_SortBy = map[string]bool{"": true, "id": true, "job_id": true, "created": true, "updated": true}

func (this *ListStreamInstances) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListStreamInstances_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListStreamInstances", "the value of field 'sort_by' must be one of '[ id job_id created updated]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListStreamInstances
func (this *ListStreamInstances) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_state(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *TerminateStreamInstances) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("TerminateStreamInstances", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("TerminateStreamInstances", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

// Set default value for message request.TerminateStreamInstances
func (this *TerminateStreamInstances) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	return nil
}

func (this *SuspendStreamInstances) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SuspendStreamInstances", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SuspendStreamInstances", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

// Set default value for message request.SuspendStreamInstances
func (this *SuspendStreamInstances) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	return nil
}

func (this *ResumeStreamInstances) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ResumeStreamInstances", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ResumeStreamInstances", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

// Set default value for message request.ResumeStreamInstances
func (this *ResumeStreamInstances) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeFlinkUIByInstanceId) _xxx_xxx_Validator_Validate_inst_id() error {
	if !(len(this.InstId) == 20) {
		return protovalidator.FieldError1("DescribeFlinkUIByInstanceId", "the byte length of field 'inst_id' must be equal to '20'", protovalidator.StringByteLenToString(this.InstId))
	}
	return nil
}

// Set default value for message request.DescribeFlinkUIByInstanceId
func (this *DescribeFlinkUIByInstanceId) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_inst_id(); err != nil {
		return err
	}
	return nil
}
