// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/response/billing.proto

package pbresponse

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
)

// Set default value for message response.GetPriceComponents
func (this *GetPriceComponents) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *CreateBillingInstance) _xxx_xxx_Validator_Validate_instance_id() error {
	if !(len(this.InstanceId) == 30) {
		return protovalidator.FieldError1("CreateBillingInstance", "the byte length of field 'instance_id' must be equal to '30'", protovalidator.StringByteLenToString(this.InstanceId))
	}
	return nil
}

// Set default value for message response.CreateBillingInstance
func (this *CreateBillingInstance) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_instance_id(); err != nil {
		return err
	}
	return nil
}

func (this *StopBillingInstance) _xxx_xxx_Validator_Validate_message() error {
	if !(len(this.Message) == 20) {
		return protovalidator.FieldError1("StopBillingInstance", "the byte length of field 'message' must be equal to '20'", protovalidator.StringByteLenToString(this.Message))
	}
	return nil
}

// Set default value for message response.StopBillingInstance
func (this *StopBillingInstance) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_message(); err != nil {
		return err
	}
	return nil
}

func (this *RecoveryBillingInstance) _xxx_xxx_Validator_Validate_message() error {
	if !(len(this.Message) == 20) {
		return protovalidator.FieldError1("RecoveryBillingInstance", "the byte length of field 'message' must be equal to '20'", protovalidator.StringByteLenToString(this.Message))
	}
	return nil
}

// Set default value for message response.RecoveryBillingInstance
func (this *RecoveryBillingInstance) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_message(); err != nil {
		return err
	}
	return nil
}
