// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/syncjob/column.proto

package pbsyncjob

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
)

func (this *Column) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) > 1) {
		return protovalidator.FieldError1("Column", "the byte length of field 'name' must be greater than '1'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 128) {
		return protovalidator.FieldError1("Column", "the byte length of field 'name' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

func (this *Column) _xxx_xxx_Validator_Validate_type() error {
	if !(len(this.Type) > 1) {
		return protovalidator.FieldError1("Column", "the byte length of field 'type' must be greater than '1'", protovalidator.StringByteLenToString(this.Type))
	}
	if !(len(this.Type) <= 128) {
		return protovalidator.FieldError1("Column", "the byte length of field 'type' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Type))
	}
	return nil
}

// Set default value for message model.Column
func (this *Column) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	return nil
}
