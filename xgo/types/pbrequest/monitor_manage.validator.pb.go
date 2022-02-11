// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/monitor_manage.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
	strings "strings"
)

func (this *ListMonitorRules) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListMonitorRules", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListMonitorRules", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListMonitorRules) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListMonitorRules", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

func (this *ListMonitorRules) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ListMonitorRules", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ListMonitorRules", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

// Set default value for message request.ListMonitorRules
func (this *ListMonitorRules) Validate() error {
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
	return nil
}

func (this *CreateMonitorRule) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("CreateMonitorRule", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.CreateMonitorRule
func (this *CreateMonitorRule) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteMonitorRules) _xxx_xxx_Validator_Validate_rule_ids() error {
	if !(len(this.RuleIds) > 0) {
		return protovalidator.FieldError1("DeleteMonitorRules", "the length of field 'rule_ids' must be greater than '0'", strconv.Itoa(len(this.RuleIds)))
	}
	if !(len(this.RuleIds) <= 100) {
		return protovalidator.FieldError1("DeleteMonitorRules", "the length of field 'rule_ids' must be less than or equal to '100'", strconv.Itoa(len(this.RuleIds)))
	}
	return nil
}

// Set default value for message request.DeleteMonitorRules
func (this *DeleteMonitorRules) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_rule_ids(); err != nil {
		return err
	}
	return nil
}

func (this *EnableMonitorRules) _xxx_xxx_Validator_Validate_rule_ids() error {
	if !(len(this.RuleIds) > 0) {
		return protovalidator.FieldError1("EnableMonitorRules", "the length of field 'rule_ids' must be greater than '0'", strconv.Itoa(len(this.RuleIds)))
	}
	if !(len(this.RuleIds) <= 100) {
		return protovalidator.FieldError1("EnableMonitorRules", "the length of field 'rule_ids' must be less than or equal to '100'", strconv.Itoa(len(this.RuleIds)))
	}
	return nil
}

// Set default value for message request.EnableMonitorRules
func (this *EnableMonitorRules) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_rule_ids(); err != nil {
		return err
	}
	return nil
}

func (this *DisableMonitorRules) _xxx_xxx_Validator_Validate_rule_ids() error {
	if !(len(this.RuleIds) > 0) {
		return protovalidator.FieldError1("DisableMonitorRules", "the length of field 'rule_ids' must be greater than '0'", strconv.Itoa(len(this.RuleIds)))
	}
	if !(len(this.RuleIds) <= 100) {
		return protovalidator.FieldError1("DisableMonitorRules", "the length of field 'rule_ids' must be less than or equal to '100'", strconv.Itoa(len(this.RuleIds)))
	}
	return nil
}

// Set default value for message request.DisableMonitorRules
func (this *DisableMonitorRules) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_rule_ids(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateMonitorRule) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("UpdateMonitorRule", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.UpdateMonitorRule
func (this *UpdateMonitorRule) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeMonitorRule) _xxx_xxx_Validator_Validate_rule_id() error {
	if !(len(this.RuleId) == 20) {
		return protovalidator.FieldError1("DescribeMonitorRule", "the byte length of field 'rule_id' must be equal to '20'", protovalidator.StringByteLenToString(this.RuleId))
	}
	return nil
}

// Set default value for message request.DescribeMonitorRule
func (this *DescribeMonitorRule) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_rule_id(); err != nil {
		return err
	}
	return nil
}