// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/file.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
	utf8 "unicode/utf8"
)

func (this *File) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("File", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("File", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("File", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "res-")) {
		return protovalidator.FieldError1("File", "the value of field 'id' must start with string 'res-'", this.Id)
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) >= 2) {
		return protovalidator.FieldError1("File", "the byte length of field 'name' must be greater than or equal to '2'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 128) {
		return protovalidator.FieldError1("File", "the byte length of field 'name' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_desc() error {
	if !(utf8.RuneCountInString(this.Desc) <= 1024) {
		return protovalidator.FieldError1("File", "the character length of field 'desc' must be less than or equal to '1024'", protovalidator.StringCharsetLenToString(this.Desc))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_size() error {
	if !(this.Size >= 0) {
		return protovalidator.FieldError1("File", "the value of field 'size' must be greater than or equal to '0'", protovalidator.Int64ToString(this.Size))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_etag() error {
	if !(len(this.Etag) == 32) {
		return protovalidator.FieldError1("File", "the byte length of field 'etag' must be equal to '32'", protovalidator.StringByteLenToString(this.Etag))
	}
	return nil
}

var _xxx_xxx_Validator_File_InEnums_Status = map[File_Status]bool{0: true, 1: true, 2: true}

func (this *File) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("File", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_File_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("File", "the value of field 'status' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_version() error {
	if !(len(this.Version) == 16) {
		return protovalidator.FieldError1("File", "the byte length of field 'version' must be equal to '16'", protovalidator.StringByteLenToString(this.Version))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type >= 1) {
		return protovalidator.FieldError1("File", "the value of field 'type' must be greater than or equal to '1'", protovalidator.Int32ToString(this.Type))
	}
	if !(this.Type <= 3) {
		return protovalidator.FieldError1("File", "the value of field 'type' must be less than or equal to '3'", protovalidator.Int32ToString(this.Type))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) > 0) {
		return protovalidator.FieldError1("File", "the byte length of field 'created_by' must be greater than '0'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	if !(len(this.CreatedBy) < 65) {
		return protovalidator.FieldError1("File", "the byte length of field 'created_by' must be less than '65'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("File", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *File) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("File", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

// Set default value for message model.File
func (this *File) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_desc(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_size(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_etag(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created_by(); err != nil {
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
