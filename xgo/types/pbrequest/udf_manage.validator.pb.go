// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/udf_manage.proto

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

func (this *ListUDFs) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ListUDFs", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ListUDFs", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *ListUDFs) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListUDFs", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListUDFs", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListUDFs) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListUDFs", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListUDFs_In_SortBy = map[string]bool{"": true, "id": true, "name": true, "created": true, "updated": true}

func (this *ListUDFs) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListUDFs_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListUDFs", "the value of field 'sort_by' must be one of '[ id name created updated]'", this.SortBy)
	}
	return nil
}

var _xxx_xxx_Validator_ListUDFs_InEnums_Type = map[pbmodel.UDF_Type]bool{0: true, 1: true, 2: true, 3: true}

func (this *ListUDFs) _xxx_xxx_Validator_Validate_type() error {
	if !(_xxx_xxx_Validator_ListUDFs_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("ListUDFs", "the value of field 'type' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

// Set default value for message request.ListUDFs
func (this *ListUDFs) Validate() error {
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
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteUDFs) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DeleteUDFs", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DeleteUDFs", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DeleteUDFs) _xxx_xxx_Validator_Validate_udf_ids() error {
	if !(len(this.UdfIds) > 0) {
		return protovalidator.FieldError1("DeleteUDFs", "the length of field 'udf_ids' must be greater than '0'", strconv.Itoa(len(this.UdfIds)))
	}
	if !(len(this.UdfIds) < 100) {
		return protovalidator.FieldError1("DeleteUDFs", "the length of field 'udf_ids' must be less than '100'", strconv.Itoa(len(this.UdfIds)))
	}
	for _, item := range this.UdfIds {
		_ = item // To avoid unused panics.
		if !(strings.HasPrefix(item, "udf-")) {
			return protovalidator.FieldError1("DeleteUDFs", "the value of array item where in field 'udf_ids' must start with string 'udf-'", item)
		}
	}
	return nil
}

// Set default value for message request.DeleteUDFs
func (this *DeleteUDFs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_udf_ids(); err != nil {
		return err
	}
	return nil
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("CreateUDF", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) >= 1) {
		return protovalidator.FieldError1("CreateUDF", "the byte length of field 'name' must be greater than or equal to '1'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 65) {
		return protovalidator.FieldError1("CreateUDF", "the byte length of field 'name' must be less than or equal to '65'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_desc() error {
	if !(len(this.Desc) <= 256) {
		return protovalidator.FieldError1("CreateUDF", "the byte length of field 'desc' must be less than or equal to '256'", protovalidator.StringByteLenToString(this.Desc))
	}
	return nil
}

var _xxx_xxx_Validator_CreateUDF_InEnums_Type = map[pbmodel.UDF_Type]bool{0: true, 1: true, 2: true, 3: true}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type > 0) {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_CreateUDF_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'type' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

var _xxx_xxx_Validator_CreateUDF_InEnums_Language = map[pbmodel.UDF_Language]bool{0: true, 1: true, 2: true, 3: true}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_language() error {
	if !(this.Language > 0) {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'language' must be greater than '0'", protovalidator.Int32ToString(int32(this.Language)))
	}
	if !(_xxx_xxx_Validator_CreateUDF_InEnums_Language[this.Language]) {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'language' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Language)))
	}
	return nil
}

func (this *CreateUDF) _xxx_xxx_Validator_CheckIf_file_id() bool {
	if !(this.Language == 2) {
		return false
	}
	return true
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_file_id() error {
	if !this._xxx_xxx_Validator_CheckIf_file_id() {
		return nil
	}
	if !(len(this.FileId) == 20) {
		return protovalidator.FieldError1("CreateUDF", "the byte length of field 'file_id' must be equal to '20'", protovalidator.StringByteLenToString(this.FileId))
	}
	if !(strings.HasPrefix(this.FileId, "res-")) {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'file_id' must start with string 'res-'", this.FileId)
	}
	return nil
}

var _xxx_xxx_Validator_CreateUDF_In_Code_By_Language = map[pbmodel.UDF_Language]bool{1: true, 3: true}

func (this *CreateUDF) _xxx_xxx_Validator_CheckIf_code() bool {
	if !(_xxx_xxx_Validator_CreateUDF_In_Code_By_Language[this.Language]) {
		return false
	}
	return true
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_code() error {
	if !this._xxx_xxx_Validator_CheckIf_code() {
		return nil
	}
	if !(utf8.RuneCountInString(this.Code) > 0) {
		return protovalidator.FieldError1("CreateUDF", "the character length of field 'code' must be greater than '0'", protovalidator.StringCharsetLenToString(this.Code))
	}
	if !(utf8.RuneCountInString(this.Code) <= 20000) {
		return protovalidator.FieldError1("CreateUDF", "the character length of field 'code' must be less than or equal to '20000'", protovalidator.StringCharsetLenToString(this.Code))
	}
	return nil
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_usage_sample() error {
	if !(utf8.RuneCountInString(this.UsageSample) <= 2000) {
		return protovalidator.FieldError1("CreateUDF", "the character length of field 'usage_sample' must be less than or equal to '2000'", protovalidator.StringCharsetLenToString(this.UsageSample))
	}
	return nil
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_created_by() error {
	if !(this.CreatedBy != "") {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'created_by' must be not equal to ''", this.CreatedBy)
	}
	return nil
}

func (this *CreateUDF) _xxx_xxx_Validator_Validate_space_owner() error {
	if !(this.SpaceOwner != "") {
		return protovalidator.FieldError1("CreateUDF", "the value of field 'space_owner' must be not equal to ''", this.SpaceOwner)
	}
	return nil
}

// Set default value for message request.CreateUDF
func (this *CreateUDF) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
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
	if err := this._xxx_xxx_Validator_Validate_language(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_file_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_code(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_usage_sample(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_space_owner(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateUDF) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("UpdateUDF", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("UpdateUDF", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *UpdateUDF) _xxx_xxx_Validator_Validate_udf_id() error {
	if !(len(this.UdfId) < 21) {
		return protovalidator.FieldError1("UpdateUDF", "the byte length of field 'udf_id' must be less than '21'", protovalidator.StringByteLenToString(this.UdfId))
	}
	if !(strings.HasPrefix(this.UdfId, "udf-")) {
		return protovalidator.FieldError1("UpdateUDF", "the value of field 'udf_id' must start with string 'udf-'", this.UdfId)
	}
	return nil
}

func (this *UpdateUDF) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) > 0) {
		return protovalidator.FieldError1("UpdateUDF", "the byte length of field 'name' must be greater than '0'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 65) {
		return protovalidator.FieldError1("UpdateUDF", "the byte length of field 'name' must be less than or equal to '65'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

func (this *UpdateUDF) _xxx_xxx_Validator_Validate_desc() error {
	if !(len(this.Desc) <= 256) {
		return protovalidator.FieldError1("UpdateUDF", "the byte length of field 'desc' must be less than or equal to '256'", protovalidator.StringByteLenToString(this.Desc))
	}
	return nil
}

func (this *UpdateUDF) _xxx_xxx_Validator_CheckIf_file_id() bool {
	if !(this.FileId != "") {
		return false
	}
	return true
}

func (this *UpdateUDF) _xxx_xxx_Validator_Validate_file_id() error {
	if !this._xxx_xxx_Validator_CheckIf_file_id() {
		return nil
	}
	if !(len(this.FileId) == 20) {
		return protovalidator.FieldError1("UpdateUDF", "the byte length of field 'file_id' must be equal to '20'", protovalidator.StringByteLenToString(this.FileId))
	}
	if !(strings.HasPrefix(this.FileId, "res-")) {
		return protovalidator.FieldError1("UpdateUDF", "the value of field 'file_id' must start with string 'res-'", this.FileId)
	}
	return nil
}

func (this *UpdateUDF) _xxx_xxx_Validator_CheckIf_code() bool {
	if !(this.Code != "") {
		return false
	}
	return true
}

func (this *UpdateUDF) _xxx_xxx_Validator_Validate_code() error {
	if !this._xxx_xxx_Validator_CheckIf_code() {
		return nil
	}
	if !(utf8.RuneCountInString(this.Code) > 0) {
		return protovalidator.FieldError1("UpdateUDF", "the character length of field 'code' must be greater than '0'", protovalidator.StringCharsetLenToString(this.Code))
	}
	if !(utf8.RuneCountInString(this.Code) <= 20000) {
		return protovalidator.FieldError1("UpdateUDF", "the character length of field 'code' must be less than or equal to '20000'", protovalidator.StringCharsetLenToString(this.Code))
	}
	return nil
}

func (this *UpdateUDF) _xxx_xxx_Validator_Validate_usage_sample() error {
	if !(utf8.RuneCountInString(this.UsageSample) <= 2000) {
		return protovalidator.FieldError1("UpdateUDF", "the character length of field 'usage_sample' must be less than or equal to '2000'", protovalidator.StringCharsetLenToString(this.UsageSample))
	}
	return nil
}

// Set default value for message request.UpdateUDF
func (this *UpdateUDF) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_udf_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_desc(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_file_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_code(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_usage_sample(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeUDF) _xxx_xxx_Validator_Validate_udf_id() error {
	if !(len(this.UdfId) == 20) {
		return protovalidator.FieldError1("DescribeUDF", "the byte length of field 'udf_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UdfId))
	}
	if !(strings.HasPrefix(this.UdfId, "udf-")) {
		return protovalidator.FieldError1("DescribeUDF", "the value of field 'udf_id' must start with string 'udf-'", this.UdfId)
	}
	return nil
}

// Set default value for message request.DescribeUDF
func (this *DescribeUDF) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_udf_id(); err != nil {
		return err
	}
	return nil
}
