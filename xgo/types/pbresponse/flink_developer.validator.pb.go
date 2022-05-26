// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/response/flink_developer.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbflink"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message response.SubmitFlinkJob
func (this *SubmitFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message response.SubmitFlinkJobInteractive
func (this *SubmitFlinkJobInteractive) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message response.ExecuteFlinkSql
func (this *ExecuteFlinkSql) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *GetFlinkJobsByUrl) _xxx_xxx_Validator_Validate_jobs() error {
	for _, item := range this.Jobs {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.GetFlinkJobsByUrl
func (this *GetFlinkJobsByUrl) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_jobs(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.GetFlinkJobsByUrl.FlinkJob
func (this *GetFlinkJobsByUrl_FlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message response.ValidateFlinkJob
func (this *ValidateFlinkJob) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}
