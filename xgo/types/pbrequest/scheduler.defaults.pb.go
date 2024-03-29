// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
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

// Set default value for message request.StopStreamInstance
func (this *StopStreamInstance) SetDefaults() {
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

// Set default value for message request.SubmitSyncJob
func (this *SubmitSyncJob) SetDefaults() {
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

// Set default value for message request.StopSyncJob
func (this *StopSyncJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.StopSyncInstance
func (this *StopSyncInstance) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteSyncJobsBySpaceIds
func (this *DeleteSyncJobsBySpaceIds) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteSyncJobsByJobIds
func (this *DeleteSyncJobsByJobIds) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.SubmitFlinkClusterMonitor
func (this *SubmitFlinkClusterMonitor) SetDefaults() {
	if this == nil {
		return
	}
	if this.Event != nil {
		if dt, ok := interface{}(this.Event).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.StopFlinkClusterMonitor
func (this *StopFlinkClusterMonitor) SetDefaults() {
	if this == nil {
		return
	}
	return
}
