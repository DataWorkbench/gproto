// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/stream_job_manage.proto

package pbrequest

import (
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
	strings "strings"
	utf8 "unicode/utf8"
)

func (this *ListStreamJobs) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ListStreamJobs", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ListStreamJobs", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *ListStreamJobs) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListStreamJobs", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListStreamJobs", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListStreamJobs) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListStreamJobs", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListStreamJobs_In_SortBy = map[string]bool{"": true, "id": true, "name": true, "created": true, "updated": true}

func (this *ListStreamJobs) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListStreamJobs_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListStreamJobs", "the value of field 'sort_by' must be one of '[ id name created updated]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListStreamJobs
func (this *ListStreamJobs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *CreateStreamJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("CreateStreamJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("CreateStreamJob", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *CreateStreamJob) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) < 65) {
		return protovalidator.FieldError1("CreateStreamJob", "the byte length of field 'created_by' must be less than '65'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

func (this *CreateStreamJob) _xxx_xxx_Validator_CheckIf_pid() bool {
	if !(this.Pid != "") {
		return false
	}
	return true
}

func (this *CreateStreamJob) _xxx_xxx_Validator_Validate_pid() error {
	if !this._xxx_xxx_Validator_CheckIf_pid() {
		return nil
	}
	if !(len(this.Pid) == 20) {
		return protovalidator.FieldError1("CreateStreamJob", "the byte length of field 'pid' must be equal to '20'", protovalidator.StringByteLenToString(this.Pid))
	}
	if !(strings.HasPrefix(this.Pid, "stj-")) {
		return protovalidator.FieldError1("CreateStreamJob", "the value of field 'pid' must start with string 'stj-'", this.Pid)
	}
	return nil
}

func (this *CreateStreamJob) _xxx_xxx_Validator_Validate_name() error {
	if !(utf8.RuneCountInString(this.Name) >= 2) {
		return protovalidator.FieldError1("CreateStreamJob", "the character length of field 'name' must be greater than or equal to '2'", protovalidator.StringCharsetLenToString(this.Name))
	}
	if !(utf8.RuneCountInString(this.Name) <= 128) {
		return protovalidator.FieldError1("CreateStreamJob", "the character length of field 'name' must be less than or equal to '128'", protovalidator.StringCharsetLenToString(this.Name))
	}
	return nil
}

func (this *CreateStreamJob) _xxx_xxx_Validator_Validate_desc() error {
	if !(utf8.RuneCountInString(this.Desc) <= 1020) {
		return protovalidator.FieldError1("CreateStreamJob", "the character length of field 'desc' must be less than or equal to '1020'", protovalidator.StringCharsetLenToString(this.Desc))
	}
	return nil
}

func (this *CreateStreamJob) _xxx_xxx_Validator_CheckIf_type() bool {
	if !(this.IsDirectory == false) {
		return false
	}
	return true
}

var _xxx_xxx_Validator_CreateStreamJob_InEnums_Type = map[pbmodel.StreamJob_Type]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true}

func (this *CreateStreamJob) _xxx_xxx_Validator_Validate_type() error {
	if !this._xxx_xxx_Validator_CheckIf_type() {
		return nil
	}
	if !(this.Type > 0) {
		return protovalidator.FieldError1("CreateStreamJob", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_CreateStreamJob_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("CreateStreamJob", "the value of field 'type' must in enums of '[0 1 2 3 4 5]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

func (this *CreateStreamJob) _xxx_xxx_Validator_Validate_space_owner() error {
	if !(this.SpaceOwner != "") {
		return protovalidator.FieldError1("CreateStreamJob", "the value of field 'space_owner' must be not equal to ''", this.SpaceOwner)
	}
	return nil
}

// Set default value for message request.CreateStreamJob
func (this *CreateStreamJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_pid(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_desc(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_space_owner(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteStreamJobs) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DeleteStreamJobs", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DeleteStreamJobs", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DeleteStreamJobs) _xxx_xxx_Validator_Validate_job_ids() error {
	if !(len(this.JobIds) > 0) {
		return protovalidator.FieldError1("DeleteStreamJobs", "the length of field 'job_ids' must be greater than '0'", strconv.Itoa(len(this.JobIds)))
	}
	if !(len(this.JobIds) <= 100) {
		return protovalidator.FieldError1("DeleteStreamJobs", "the length of field 'job_ids' must be less than or equal to '100'", strconv.Itoa(len(this.JobIds)))
	}
	for _, item := range this.JobIds {
		_ = item // To avoid unused panics.
		if !(strings.HasPrefix(item, "stj-")) {
			return protovalidator.FieldError1("DeleteStreamJobs", "the value of array item where in field 'job_ids' must start with string 'stj-'", item)
		}
	}
	return nil
}

// Set default value for message request.DeleteStreamJobs
func (this *DeleteStreamJobs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_ids(); err != nil {
		return err
	}
	return nil
}

func (this *MoveStreamJobs) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("MoveStreamJobs", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("MoveStreamJobs", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *MoveStreamJobs) _xxx_xxx_Validator_Validate_job_ids() error {
	if !(len(this.JobIds) > 0) {
		return protovalidator.FieldError1("MoveStreamJobs", "the length of field 'job_ids' must be greater than '0'", strconv.Itoa(len(this.JobIds)))
	}
	if !(len(this.JobIds) <= 100) {
		return protovalidator.FieldError1("MoveStreamJobs", "the length of field 'job_ids' must be less than or equal to '100'", strconv.Itoa(len(this.JobIds)))
	}
	for _, item := range this.JobIds {
		_ = item // To avoid unused panics.
		if !(strings.HasPrefix(item, "stj-")) {
			return protovalidator.FieldError1("MoveStreamJobs", "the value of array item where in field 'job_ids' must start with string 'stj-'", item)
		}
	}
	return nil
}

func (this *MoveStreamJobs) _xxx_xxx_Validator_CheckIf_target() bool {
	if !(this.Target != "") {
		return false
	}
	return true
}

func (this *MoveStreamJobs) _xxx_xxx_Validator_Validate_target() error {
	if !this._xxx_xxx_Validator_CheckIf_target() {
		return nil
	}
	if !(len(this.Target) == 20) {
		return protovalidator.FieldError1("MoveStreamJobs", "the byte length of field 'target' must be equal to '20'", protovalidator.StringByteLenToString(this.Target))
	}
	if !(strings.HasPrefix(this.Target, "stj-")) {
		return protovalidator.FieldError1("MoveStreamJobs", "the value of field 'target' must start with string 'stj-'", this.Target)
	}
	return nil
}

// Set default value for message request.MoveStreamJobs
func (this *MoveStreamJobs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_ids(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_target(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateStreamJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("UpdateStreamJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("UpdateStreamJob", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *UpdateStreamJob) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("UpdateStreamJob", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("UpdateStreamJob", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

func (this *UpdateStreamJob) _xxx_xxx_Validator_Validate_name() error {
	if !(utf8.RuneCountInString(this.Name) >= 2) {
		return protovalidator.FieldError1("UpdateStreamJob", "the character length of field 'name' must be greater than or equal to '2'", protovalidator.StringCharsetLenToString(this.Name))
	}
	if !(utf8.RuneCountInString(this.Name) <= 128) {
		return protovalidator.FieldError1("UpdateStreamJob", "the character length of field 'name' must be less than or equal to '128'", protovalidator.StringCharsetLenToString(this.Name))
	}
	return nil
}

func (this *UpdateStreamJob) _xxx_xxx_Validator_Validate_desc() error {
	if !(utf8.RuneCountInString(this.Desc) <= 1024) {
		return protovalidator.FieldError1("UpdateStreamJob", "the character length of field 'desc' must be less than or equal to '1024'", protovalidator.StringCharsetLenToString(this.Desc))
	}
	return nil
}

// Set default value for message request.UpdateStreamJob
func (this *UpdateStreamJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_desc(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeStreamJob) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("DescribeStreamJob", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("DescribeStreamJob", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

// Set default value for message request.DescribeStreamJob
func (this *DescribeStreamJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	return nil
}

func (this *SetStreamJobCode) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SetStreamJobCode", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SetStreamJobCode", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *SetStreamJobCode) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("SetStreamJobCode", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("SetStreamJobCode", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

func (this *SetStreamJobCode) _xxx_xxx_Validator_Validate_code() error {
	if !(this.Code != nil) {
		return protovalidator.FieldError2("SetStreamJobCode", "the value of field 'code' cannot be null")
	}
	if dt, ok := interface{}(this.Code).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.SetStreamJobCode
func (this *SetStreamJobCode) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_code(); err != nil {
		return err
	}
	return nil
}

func (this *SetStreamJobSchedule) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SetStreamJobSchedule", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SetStreamJobSchedule", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *SetStreamJobSchedule) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("SetStreamJobSchedule", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("SetStreamJobSchedule", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

func (this *SetStreamJobSchedule) _xxx_xxx_Validator_Validate_schedule() error {
	if !(this.Schedule != nil) {
		return protovalidator.FieldError2("SetStreamJobSchedule", "the value of field 'schedule' cannot be null")
	}
	if dt, ok := interface{}(this.Schedule).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.SetStreamJobSchedule
func (this *SetStreamJobSchedule) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_schedule(); err != nil {
		return err
	}
	return nil
}

func (this *SetStreamJobArgs) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SetStreamJobArgs", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SetStreamJobArgs", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *SetStreamJobArgs) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("SetStreamJobArgs", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("SetStreamJobArgs", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

func (this *SetStreamJobArgs) _xxx_xxx_Validator_Validate_args() error {
	if !(this.Args != nil) {
		return protovalidator.FieldError2("SetStreamJobArgs", "the value of field 'args' cannot be null")
	}
	if dt, ok := interface{}(this.Args).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.SetStreamJobArgs
func (this *SetStreamJobArgs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_args(); err != nil {
		return err
	}
	return nil
}

func (this *GetStreamJobCode) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("GetStreamJobCode", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("GetStreamJobCode", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

// Set default value for message request.GetStreamJobCode
func (this *GetStreamJobCode) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	return nil
}

func (this *GetStreamJobSchedule) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("GetStreamJobSchedule", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("GetStreamJobSchedule", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

// Set default value for message request.GetStreamJobSchedule
func (this *GetStreamJobSchedule) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	return nil
}

func (this *GetStreamJobArgs) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("GetStreamJobArgs", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("GetStreamJobArgs", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

// Set default value for message request.GetStreamJobArgs
func (this *GetStreamJobArgs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListReleaseStreamJobs) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListReleaseStreamJobs", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListReleaseStreamJobs", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListReleaseStreamJobs) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListReleaseStreamJobs", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

func (this *ListReleaseStreamJobs) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ListReleaseStreamJobs", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ListReleaseStreamJobs", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

var _xxx_xxx_Validator_ListReleaseStreamJobs_In_SortBy = map[string]bool{"": true, "id": true, "name": true, "created": true, "updated": true}

func (this *ListReleaseStreamJobs) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListReleaseStreamJobs_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListReleaseStreamJobs", "the value of field 'sort_by' must be one of '[ id name created updated]'", this.SortBy)
	}
	return nil
}

var _xxx_xxx_Validator_ListReleaseStreamJobs_InEnums_Status = map[pbmodel.StreamJobRelease_Status]bool{0: true, 1: true, 2: true, 3: true}

func (this *ListReleaseStreamJobs) _xxx_xxx_Validator_Validate_status() error {
	if !(_xxx_xxx_Validator_ListReleaseStreamJobs_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("ListReleaseStreamJobs", "the value of field 'status' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

// Set default value for message request.ListReleaseStreamJobs
func (this *ListReleaseStreamJobs) Validate() error {
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
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	return nil
}

func (this *ReleaseStreamJob) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("ReleaseStreamJob", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("ReleaseStreamJob", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

func (this *ReleaseStreamJob) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) < 65) {
		return protovalidator.FieldError1("ReleaseStreamJob", "the byte length of field 'created_by' must be less than '65'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

// Set default value for message request.ReleaseStreamJob
func (this *ReleaseStreamJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created_by(); err != nil {
		return err
	}
	return nil
}

func (this *OfflineReleaseStreamJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("OfflineReleaseStreamJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("OfflineReleaseStreamJob", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *OfflineReleaseStreamJob) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("OfflineReleaseStreamJob", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("OfflineReleaseStreamJob", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

// Set default value for message request.OfflineReleaseStreamJob
func (this *OfflineReleaseStreamJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	return nil
}

func (this *SuspendReleaseStreamJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SuspendReleaseStreamJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SuspendReleaseStreamJob", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *SuspendReleaseStreamJob) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("SuspendReleaseStreamJob", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("SuspendReleaseStreamJob", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

// Set default value for message request.SuspendReleaseStreamJob
func (this *SuspendReleaseStreamJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	return nil
}

func (this *ResumeReleaseStreamJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ResumeReleaseStreamJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ResumeReleaseStreamJob", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *ResumeReleaseStreamJob) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("ResumeReleaseStreamJob", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("ResumeReleaseStreamJob", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

// Set default value for message request.ResumeReleaseStreamJob
func (this *ResumeReleaseStreamJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListStreamJobVersions) _xxx_xxx_Validator_Validate_job_id() error {
	if !(len(this.JobId) == 20) {
		return protovalidator.FieldError1("ListStreamJobVersions", "the byte length of field 'job_id' must be equal to '20'", protovalidator.StringByteLenToString(this.JobId))
	}
	if !(strings.HasPrefix(this.JobId, "stj-")) {
		return protovalidator.FieldError1("ListStreamJobVersions", "the value of field 'job_id' must start with string 'stj-'", this.JobId)
	}
	return nil
}

func (this *ListStreamJobVersions) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListStreamJobVersions", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListStreamJobVersions", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListStreamJobVersions) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListStreamJobVersions", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListStreamJobVersions_In_SortBy = map[string]bool{"": true, "version": true, "created": true, "updated": true}

func (this *ListStreamJobVersions) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListStreamJobVersions_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListStreamJobVersions", "the value of field 'sort_by' must be one of '[ version created updated]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListStreamJobVersions
func (this *ListStreamJobVersions) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_job_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeFlinkUIByInstanceId) _xxx_xxx_Validator_Validate_instance_id() error {
	if !(len(this.InstanceId) == 20) {
		return protovalidator.FieldError1("DescribeFlinkUIByInstanceId", "the byte length of field 'instance_id' must be equal to '20'", protovalidator.StringByteLenToString(this.InstanceId))
	}
	if !(strings.HasPrefix(this.InstanceId, "sti-")) {
		return protovalidator.FieldError1("DescribeFlinkUIByInstanceId", "the value of field 'instance_id' must start with string 'sti-'", this.InstanceId)
	}
	return nil
}

// Set default value for message request.DescribeFlinkUIByInstanceId
func (this *DescribeFlinkUIByInstanceId) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_instance_id(); err != nil {
		return err
	}
	return nil
}
