// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/request/scheduler.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.SubmitStreamJob
func (this *SubmitStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	if this.Property != nil {
		if dt, ok := interface{}(this.Property).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.StopStreamJob
func (this *StopStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteStreamJobsBySpaceIds
func (this *DeleteStreamJobsBySpaceIds) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteStreamJobsByJobIds
func (this *DeleteStreamJobsByJobIds) SetDefaults() {
	if this == nil {
		return
	}
	return
}