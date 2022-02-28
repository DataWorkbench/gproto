// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/syncjob/kafka.proto

package pbsyncjob

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

func (this *KafkaSource) _xxx_xxx_Validator_Validate_column() error {
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *KafkaSource) _xxx_xxx_Validator_Validate_consumer_settings() error {
	if dt, ok := interface{}(this.ConsumerSettings).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.KafkaSource
func (this *KafkaSource) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_consumer_settings(); err != nil {
		return err
	}
	return nil
}

// Set default value for message model.ConsumerSettings
func (this *ConsumerSettings) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *KafkaTarget) _xxx_xxx_Validator_Validate_tableFields() error {
	for _, item := range this.TableFields {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *KafkaTarget) _xxx_xxx_Validator_Validate_consumer_settings() error {
	if dt, ok := interface{}(this.ConsumerSettings).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.KafkaTarget
func (this *KafkaTarget) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_tableFields(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_consumer_settings(); err != nil {
		return err
	}
	return nil
}
