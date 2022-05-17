// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/request/flink_developer.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.SubmitFlinkJob
func (this *SubmitFlinkJob) SetDefaults() {
	if this == nil {
		return
	}
	if this.Args != nil {
		if dt, ok := interface{}(this.Args).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Code != nil {
		if dt, ok := interface{}(this.Code).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.ExecuteFlinkSql
func (this *ExecuteFlinkSql) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.GetFlinkJobStatus
func (this *GetFlinkJobStatus) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.CancelFlinkJob
func (this *CancelFlinkJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ValidateFlinkJob
func (this *ValidateFlinkJob) SetDefaults() {
	if this == nil {
		return
	}
	if this.Code != nil {
		if dt, ok := interface{}(this.Code).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.GetFlinkJobsByUrl
func (this *GetFlinkJobsByUrl) SetDefaults() {
	if this == nil {
		return
	}
	return
}
