// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/observer.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
)

func (this *InstanceStatusStat) _xxx_xxx_Validator_Validate_state() error {
	if !(this.State >= 0) {
		return protovalidator.FieldError1("InstanceStatusStat", "the value of field 'state' must be greater than or equal to '0'", protovalidator.Int32ToString(this.State))
	}
	return nil
}

func (this *InstanceStatusStat) _xxx_xxx_Validator_Validate_count() error {
	if !(this.Count >= 0) {
		return protovalidator.FieldError1("InstanceStatusStat", "the value of field 'count' must be greater than or equal to '0'", protovalidator.Int64ToString(this.Count))
	}
	return nil
}

// Set default value for message model.InstanceStatusStat
func (this *InstanceStatusStat) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_state(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_count(); err != nil {
		return err
	}
	return nil
}

func (this *InstanceRuntimeRankInfo) _xxx_xxx_Validator_Validate_running_time() error {
	if !(this.RunningTime >= 0) {
		return protovalidator.FieldError1("InstanceRuntimeRankInfo", "the value of field 'running_time' must be greater than or equal to '0'", protovalidator.Int64ToString(this.RunningTime))
	}
	return nil
}

// Set default value for message model.InstanceRuntimeRankInfo
func (this *InstanceRuntimeRankInfo) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_running_time(); err != nil {
		return err
	}
	return nil
}

func (this *InstanceErrorRankInfo) _xxx_xxx_Validator_Validate_error_count() error {
	if !(this.ErrorCount >= 0) {
		return protovalidator.FieldError1("InstanceErrorRankInfo", "the value of field 'error_count' must be greater than or equal to '0'", protovalidator.Int64ToString(this.ErrorCount))
	}
	return nil
}

// Set default value for message model.InstanceErrorRankInfo
func (this *InstanceErrorRankInfo) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_error_count(); err != nil {
		return err
	}
	return nil
}

func (this *DispatchTaskCountInfo) _xxx_xxx_Validator_Validate_flow_count() error {
	if !(this.FlowCount >= 0) {
		return protovalidator.FieldError1("DispatchTaskCountInfo", "the value of field 'flow_count' must be greater than or equal to '0'", protovalidator.Int32ToString(this.FlowCount))
	}
	return nil
}

func (this *DispatchTaskCountInfo) _xxx_xxx_Validator_Validate_instance_count() error {
	if !(this.InstanceCount >= 0) {
		return protovalidator.FieldError1("DispatchTaskCountInfo", "the value of field 'instance_count' must be greater than or equal to '0'", protovalidator.Int32ToString(this.InstanceCount))
	}
	return nil
}

func (this *DispatchTaskCountInfo) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("DispatchTaskCountInfo", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

// Set default value for message model.DispatchTaskCountInfo
func (this *DispatchTaskCountInfo) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_flow_count(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_instance_count(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_updated(); err != nil {
		return err
	}
	return nil
}

func (this *InstanceTaskExecStat) _xxx_xxx_Validator_Validate_hour() error {
	if !(this.Hour >= 0) {
		return protovalidator.FieldError1("InstanceTaskExecStat", "the value of field 'hour' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Hour))
	}
	if !(this.Hour <= 24) {
		return protovalidator.FieldError1("InstanceTaskExecStat", "the value of field 'hour' must be less than or equal to '24'", protovalidator.Int32ToString(this.Hour))
	}
	return nil
}

func (this *InstanceTaskExecStat) _xxx_xxx_Validator_Validate_instance_count() error {
	if !(this.InstanceCount >= 0) {
		return protovalidator.FieldError1("InstanceTaskExecStat", "the value of field 'instance_count' must be greater than or equal to '0'", protovalidator.Int64ToString(this.InstanceCount))
	}
	return nil
}

// Set default value for message model.InstanceTaskExecStat
func (this *InstanceTaskExecStat) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_hour(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_instance_count(); err != nil {
		return err
	}
	return nil
}