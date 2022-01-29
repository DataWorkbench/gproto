// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults v0.1
// source: proto/types/response/stream_job_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/pkg/types/pbmodel"
)

// Set default value for message response.ListStreamJobs
func (this *ListStreamJobs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CreateStreamJob
func (this *CreateStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeStreamJob
func (this *DescribeStreamJob) SetDefaults() {
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

// Set default value for message response.GetStreamJobCode
func (this *GetStreamJobCode) SetDefaults() {
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

// Set default value for message response.StreamJobCodeSyntax
func (this *StreamJobCodeSyntax) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.GetStreamJobArgs
func (this *GetStreamJobArgs) SetDefaults() {
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

// Set default value for message response.GetStreamJobSchedule
func (this *GetStreamJobSchedule) SetDefaults() {
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

// Set default value for message response.ListReleaseStreamJobs
func (this *ListReleaseStreamJobs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ListStreamJobVersions
func (this *ListStreamJobVersions) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ListBuiltInConnectors
func (this *ListBuiltInConnectors) SetDefaults() {
	if this == nil {
		return
	}
	return
}
