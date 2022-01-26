// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults v0.1
// source: proto/model.proto

package model

import (
	_ "github.com/DataWorkbench/gproto/pkg/datasourcepb"
	_ "github.com/DataWorkbench/gproto/pkg/flinkpb"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/gosqlpb"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/validatorpb"
)

// Set default value for message model.EmptyStruct
func (this *EmptyStruct) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.Error
func (this *Error) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.Workspace
func (this *Workspace) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.StreamJob
func (this *StreamJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.StreamJobProperty
func (this *StreamJobProperty) SetDefaults() {
	if this == nil {
		return
	}
	if this.Code != nil {
		if dt, ok := interface{}(this.Code).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Args != nil {
		if dt, ok := interface{}(this.Args).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Schedule != nil {
		if dt, ok := interface{}(this.Schedule).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message model.StreamJobCode
func (this *StreamJobCode) SetDefaults() {
	if this == nil {
		return
	}
	if this.Sql != nil {
		if dt, ok := interface{}(this.Sql).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Jar != nil {
		if dt, ok := interface{}(this.Jar).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Python != nil {
		if dt, ok := interface{}(this.Python).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Scala != nil {
		if dt, ok := interface{}(this.Scala).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message model.StreamJobArgs
func (this *StreamJobArgs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.StreamJobSchedule
func (this *StreamJobSchedule) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.StreamJobRelease
func (this *StreamJobRelease) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.JobInfo
func (this *JobInfo) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.StreamJobInst
func (this *StreamJobInst) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.Operation
func (this *Operation) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.Role
func (this *Role) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.Member
func (this *Member) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.MonitorRule
func (this *MonitorRule) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.QueueMessage
func (this *QueueMessage) SetDefaults() {
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

// Set default value for message model.InstanceStatusStat
func (this *InstanceStatusStat) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.InstanceRuntimeRankInfo
func (this *InstanceRuntimeRankInfo) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.InstanceErrorRankInfo
func (this *InstanceErrorRankInfo) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.DispatchTaskCountInfo
func (this *DispatchTaskCountInfo) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.InstanceTaskExecStat
func (this *InstanceTaskExecStat) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.DataSource
func (this *DataSource) SetDefaults() {
	if this == nil {
		return
	}
	if this.Url != nil {
		if dt, ok := interface{}(this.Url).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.LastConnection != nil {
		if dt, ok := interface{}(this.LastConnection).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message model.DataSource.URL
func (this *DataSource_URL) SetDefaults() {
	if this == nil {
		return
	}
	if this.Mysql != nil {
		if dt, ok := interface{}(this.Mysql).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Postgresql != nil {
		if dt, ok := interface{}(this.Postgresql).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Clickhouse != nil {
		if dt, ok := interface{}(this.Clickhouse).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Kafka != nil {
		if dt, ok := interface{}(this.Kafka).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.S3 != nil {
		if dt, ok := interface{}(this.S3).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Hbase != nil {
		if dt, ok := interface{}(this.Hbase).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Ftp != nil {
		if dt, ok := interface{}(this.Ftp).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Hdfs != nil {
		if dt, ok := interface{}(this.Hdfs).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message model.DataSourceConnection
func (this *DataSourceConnection) SetDefaults() {
	if this == nil {
		return
	}
	if this.NetworkInfo != nil {
		if dt, ok := interface{}(this.NetworkInfo).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message model.TableInfo
func (this *TableInfo) SetDefaults() {
	if this == nil {
		return
	}
	if this.TableSchema != nil {
		if dt, ok := interface{}(this.TableSchema).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message model.Resource
func (this *Resource) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.UDFInfo
func (this *UDFInfo) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.JobResources
func (this *JobResources) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.Network
func (this *Network) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.HostAliases
func (this *HostAliases) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.HostAliases.Item
func (this *HostAliases_Item) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.FlinkCluster
func (this *FlinkCluster) SetDefaults() {
	if this == nil {
		return
	}
	if this.HostAliases != nil {
		if dt, ok := interface{}(this.HostAliases).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Config != nil {
		if dt, ok := interface{}(this.Config).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.NetworkInfo != nil {
		if dt, ok := interface{}(this.NetworkInfo).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}
