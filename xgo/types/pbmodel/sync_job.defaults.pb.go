// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/model/sync_job.proto

package pbmodel

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message model.SyncJob
func (this *SyncJob) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.SyncJobProperty
func (this *SyncJobProperty) SetDefaults() {
	if this == nil {
		return
	}
	if this.Conf != nil {
		if dt, ok := interface{}(this.Conf).(interface{ SetDefaults() }); ok {
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

// Set default value for message model.SyncJobConf
func (this *SyncJobConf) SetDefaults() {
	if this == nil {
		return
	}
	if this.Parallelism == 0 {
		this.Parallelism = 1
	}
	if this.Percentage == 0 {
		this.Percentage = 0
	}
	if this.RecordNum == 0 {
		this.RecordNum = 0
	}
	if this.Bytes == 0 {
		this.Bytes = 0
	}
	if this.JobMode == 0 {
		this.JobMode = 0
	}
	if this.RelationaldbSource != nil {
		if dt, ok := interface{}(this.RelationaldbSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.RelationaldbTarget != nil {
		if dt, ok := interface{}(this.RelationaldbTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.MongodbSource != nil {
		if dt, ok := interface{}(this.MongodbSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.MongodbTarget != nil {
		if dt, ok := interface{}(this.MongodbTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.ElasticSearchSource != nil {
		if dt, ok := interface{}(this.ElasticSearchSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.ElasticSearchTarget != nil {
		if dt, ok := interface{}(this.ElasticSearchTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.HdfsSource != nil {
		if dt, ok := interface{}(this.HdfsSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.HdfsTarget != nil {
		if dt, ok := interface{}(this.HdfsTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.FtpSource != nil {
		if dt, ok := interface{}(this.FtpSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.FtpTarget != nil {
		if dt, ok := interface{}(this.FtpTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.HbaseSource != nil {
		if dt, ok := interface{}(this.HbaseSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.HbaseTarget != nil {
		if dt, ok := interface{}(this.HbaseTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.KafkaSource != nil {
		if dt, ok := interface{}(this.KafkaSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.KafkaTarget != nil {
		if dt, ok := interface{}(this.KafkaTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.BinlogSource != nil {
		if dt, ok := interface{}(this.BinlogSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.PgWalSource != nil {
		if dt, ok := interface{}(this.PgWalSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.SqlServerCdcSource != nil {
		if dt, ok := interface{}(this.SqlServerCdcSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.LogMinerSource != nil {
		if dt, ok := interface{}(this.LogMinerSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.RedisTarget != nil {
		if dt, ok := interface{}(this.RedisTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.HiveTarget != nil {
		if dt, ok := interface{}(this.HiveTarget).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message model.SyncJobSchedule
func (this *SyncJobSchedule) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message model.SyncJobRelease
func (this *SyncJobRelease) SetDefaults() {
	if this == nil {
		return
	}
	return
}
