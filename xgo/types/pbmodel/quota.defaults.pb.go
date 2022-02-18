// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/model/quota.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
)

// Set default value for message model.QuotaWorkspace
func (this *QuotaWorkspace) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QuotaStreamJob
func (this *QuotaStreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QuotaSyncJob
func (this *QuotaSyncJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QuotaDataSource
func (this *QuotaDataSource) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QuotaUDF
func (this *QuotaUDF) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QuotaFile
func (this *QuotaFile) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QuotaFlinkCluster
func (this *QuotaFlinkCluster) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QuotaNetwork
func (this *QuotaNetwork) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.UserQuota
func (this *UserQuota) SetDefaults() {
	if this == nil {
		return
	}
	if this.Workspace != nil {
		if dt, ok := interface{}(this.Workspace).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.StreamJob != nil {
		if dt, ok := interface{}(this.StreamJob).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.DataSource != nil {
		if dt, ok := interface{}(this.DataSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Udf != nil {
		if dt, ok := interface{}(this.Udf).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.File != nil {
		if dt, ok := interface{}(this.File).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.FlinkCluster != nil {
		if dt, ok := interface{}(this.FlinkCluster).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Network != nil {
		if dt, ok := interface{}(this.Network).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.SyncJob != nil {
		if dt, ok := interface{}(this.SyncJob).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}
