// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/request/stream_job_manage.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.ListStreamJobs
func (this *ListStreamJobs) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.CreateStreamJob
func (this *CreateStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteStreamJobs
func (this *DeleteStreamJobs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.MoveStreamJobs
func (this *MoveStreamJobs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.UpdateStreamJob
func (this *UpdateStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DescribeStreamJob
func (this *DescribeStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.SetStreamJobCode
func (this *SetStreamJobCode) SetDefaults() {
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

// Set default value for message request.SetStreamJobSchedule
func (this *SetStreamJobSchedule) SetDefaults() {
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

// Set default value for message request.SetStreamJobArgs
func (this *SetStreamJobArgs) SetDefaults() {
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

// Set default value for message request.GetStreamJobCode
func (this *GetStreamJobCode) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.GetStreamJobSchedule
func (this *GetStreamJobSchedule) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.GetStreamJobArgs
func (this *GetStreamJobArgs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ListReleaseStreamJobs
func (this *ListReleaseStreamJobs) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.ReleaseStreamJob
func (this *ReleaseStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.OfflineReleaseStreamJob
func (this *OfflineReleaseStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.SuspendReleaseStreamJob
func (this *SuspendReleaseStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ResumeReleaseStreamJob
func (this *ResumeReleaseStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ListStreamJobVersions
func (this *ListStreamJobVersions) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.DescribeFlinkUIByInstanceId
func (this *DescribeFlinkUIByInstanceId) SetDefaults() {
	if this == nil {
		return
	}
	return
}
