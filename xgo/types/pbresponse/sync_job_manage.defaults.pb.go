// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/response/sync_job_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message response.ListSyncJobs
func (this *ListSyncJobs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CreateSyncJob
func (this *CreateSyncJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeSyncJob
func (this *DescribeSyncJob) SetDefaults() {
	if this == nil {
		return
	}
	if this.Info != nil {
		if dt, ok := interface{}(this.Info).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.GetSyncJobConf
func (this *GetSyncJobConf) SetDefaults() {
	if this == nil {
		return
	}
	if this.Args != nil {
		if dt, ok := interface{}(this.Args).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.GetSyncJobSchedule
func (this *GetSyncJobSchedule) SetDefaults() {
	if this == nil {
		return
	}
	if this.Schedule != nil {
		if dt, ok := interface{}(this.Schedule).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.ListReleaseSyncJobs
func (this *ListReleaseSyncJobs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ListSyncJobVersions
func (this *ListSyncJobVersions) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeSyncFlinkUIByInstanceId
func (this *DescribeSyncFlinkUIByInstanceId) SetDefaults() {
	if this == nil {
		return
	}
	return
}
