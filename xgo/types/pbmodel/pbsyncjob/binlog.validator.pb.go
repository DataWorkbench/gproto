// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/syncjob/binlog.proto

package pbsyncjob

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

func (this *BinlogSource) _xxx_xxx_Validator_Validate_start() error {
	if dt, ok := interface{}(this.Start).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.BinlogSource
func (this *BinlogSource) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_start(); err != nil {
		return err
	}
	return nil
}

// Set default value for message model.Start
func (this *Start) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}
