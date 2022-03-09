// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/sync_job.proto

package pbmodel

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
	utf8 "unicode/utf8"
)

func (this *SyncJob) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SyncJob", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_CheckIf_pid() bool {
	if !(this.Pid != "") {
		return false
	}
	return true
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_pid() error {
	if !this._xxx_xxx_Validator_CheckIf_pid() {
		return nil
	}
	if !(len(this.Pid) == 20) {
		return protovalidator.FieldError1("SyncJob", "the byte length of field 'pid' must be equal to '20'", protovalidator.StringByteLenToString(this.Pid))
	}
	if !(strings.HasPrefix(this.Pid, "stj-")) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'pid' must start with string 'stj-'", this.Pid)
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("SyncJob", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "stj-")) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'id' must start with string 'stj-'", this.Id)
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_version() error {
	if !(len(this.Version) == 16) {
		return protovalidator.FieldError1("SyncJob", "the byte length of field 'version' must be equal to '16'", protovalidator.StringByteLenToString(this.Version))
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) > 1) {
		return protovalidator.FieldError1("SyncJob", "the byte length of field 'name' must be greater than '1'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 128) {
		return protovalidator.FieldError1("SyncJob", "the byte length of field 'name' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_desc() error {
	if !(utf8.RuneCountInString(this.Desc) <= 1024) {
		return protovalidator.FieldError1("SyncJob", "the character length of field 'desc' must be less than or equal to '1024'", protovalidator.StringCharsetLenToString(this.Desc))
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_CheckIf_type() bool {
	if !(this.IsDirectory == false) {
		return false
	}
	return true
}

var _xxx_xxx_Validator_SyncJob_InEnums_Type = map[SyncJob_Type]bool{0: true, 1: true, 2: true, 3: true}

func (this *SyncJob) _xxx_xxx_Validator_Validate_type() error {
	if !this._xxx_xxx_Validator_CheckIf_type() {
		return nil
	}
	if !(this.Type > 0) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_SyncJob_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'type' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

var _xxx_xxx_Validator_SyncJob_InEnums_Status = map[SyncJob_Status]bool{0: true, 1: true, 2: true}

func (this *SyncJob) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_SyncJob_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'status' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) <= 64) {
		return protovalidator.FieldError1("SyncJob", "the byte length of field 'created_by' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *SyncJob) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("SyncJob", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

// Set default value for message model.SyncJob
func (this *SyncJob) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_pid(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_desc(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_updated(); err != nil {
		return err
	}
	return nil
}

func (this *SyncJobProperty) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SyncJobProperty", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SyncJobProperty", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *SyncJobProperty) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("SyncJobProperty", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "syj-")) {
		return protovalidator.FieldError1("SyncJobProperty", "the value of field 'id' must start with string 'syj-'", this.Id)
	}
	return nil
}

func (this *SyncJobProperty) _xxx_xxx_Validator_Validate_version() error {
	if !(len(this.Version) == 16) {
		return protovalidator.FieldError1("SyncJobProperty", "the byte length of field 'version' must be equal to '16'", protovalidator.StringByteLenToString(this.Version))
	}
	return nil
}

func (this *SyncJobProperty) _xxx_xxx_Validator_Validate_conf() error {
	if dt, ok := interface{}(this.Conf).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobProperty) _xxx_xxx_Validator_Validate_schedule() error {
	if dt, ok := interface{}(this.Schedule).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.SyncJobProperty
func (this *SyncJobProperty) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_conf(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_schedule(); err != nil {
		return err
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_source_id() error {
	if !(len(this.SourceId) == 20) {
		return protovalidator.FieldError1("SyncJobConf", "the byte length of field 'source_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SourceId))
	}
	if !(strings.HasPrefix(this.SourceId, "som-")) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'source_id' must start with string 'som-'", this.SourceId)
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_target_id() error {
	if !(len(this.TargetId) == 20) {
		return protovalidator.FieldError1("SyncJobConf", "the byte length of field 'target_id' must be equal to '20'", protovalidator.StringByteLenToString(this.TargetId))
	}
	if !(strings.HasPrefix(this.TargetId, "som-")) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'target_id' must start with string 'som-'", this.TargetId)
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_parallelism() error {
	if !(this.Parallelism > 0) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'parallelism' must be greater than '0'", protovalidator.Int32ToString(this.Parallelism))
	}
	if !(this.Parallelism <= 100) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'parallelism' must be less than or equal to '100'", protovalidator.Int32ToString(this.Parallelism))
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_percentage() error {
	if !(this.Percentage >= 0) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'percentage' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Percentage))
	}
	if !(this.Percentage <= 100) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'percentage' must be less than or equal to '100'", protovalidator.Int32ToString(this.Percentage))
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_record_num() error {
	if !(this.RecordNum >= 0) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'record_num' must be greater than or equal to '0'", protovalidator.Int32ToString(this.RecordNum))
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_bytes() error {
	if !(this.Bytes >= 0) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'bytes' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Bytes))
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_job_mode() error {
	if !(this.JobMode >= 0) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'job_mode' must be greater than or equal to '0'", protovalidator.Int32ToString(int32(this.JobMode)))
	}
	if !(this.JobMode <= 1) {
		return protovalidator.FieldError1("SyncJobConf", "the value of field 'job_mode' must be less than or equal to '1'", protovalidator.Int32ToString(int32(this.JobMode)))
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_relationaldb_source() error {
	if dt, ok := interface{}(this.RelationaldbSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_relationaldb_target() error {
	if dt, ok := interface{}(this.RelationaldbTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_mongodb_source() error {
	if dt, ok := interface{}(this.MongodbSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_mongodb_target() error {
	if dt, ok := interface{}(this.MongodbTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_elastic_search_source() error {
	if dt, ok := interface{}(this.ElasticSearchSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_elastic_search_target() error {
	if dt, ok := interface{}(this.ElasticSearchTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_hdfs_source() error {
	if dt, ok := interface{}(this.HdfsSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_hdfs_target() error {
	if dt, ok := interface{}(this.HdfsTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_ftp_source() error {
	if dt, ok := interface{}(this.FtpSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_ftp_target() error {
	if dt, ok := interface{}(this.FtpTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_hbase_source() error {
	if dt, ok := interface{}(this.HbaseSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_hbase_target() error {
	if dt, ok := interface{}(this.HbaseTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_kafka_source() error {
	if dt, ok := interface{}(this.KafkaSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_kafka_target() error {
	if dt, ok := interface{}(this.KafkaTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_binlog_source() error {
	if dt, ok := interface{}(this.BinlogSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_pg_wal_source() error {
	if dt, ok := interface{}(this.PgWalSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_sql_server_cdc_source() error {
	if dt, ok := interface{}(this.SqlServerCdcSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_log_miner_source() error {
	if dt, ok := interface{}(this.LogMinerSource).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_redis_target() error {
	if dt, ok := interface{}(this.RedisTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *SyncJobConf) _xxx_xxx_Validator_Validate_hive_target() error {
	if dt, ok := interface{}(this.HiveTarget).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.SyncJobConf
func (this *SyncJobConf) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_source_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_target_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_parallelism(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_percentage(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_record_num(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_bytes(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_mode(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_relationaldb_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_relationaldb_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_mongodb_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_mongodb_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_elastic_search_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_elastic_search_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hdfs_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hdfs_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_ftp_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_ftp_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hbase_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hbase_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_kafka_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_kafka_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_binlog_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_pg_wal_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sql_server_cdc_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_log_miner_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_redis_target(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hive_target(); err != nil {
		return err
	}
	return nil
}

var _xxx_xxx_Validator_SyncJobSchedule_InEnums_SchedulePolicy = map[SyncJobSchedule_SchedulePolicy]bool{0: true, 1: true, 2: true, 3: true}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_schedule_policy() error {
	if !(this.SchedulePolicy > 0) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'schedule_policy' must be greater than '0'", protovalidator.Int32ToString(int32(this.SchedulePolicy)))
	}
	if !(_xxx_xxx_Validator_SyncJobSchedule_InEnums_SchedulePolicy[this.SchedulePolicy]) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'schedule_policy' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.SchedulePolicy)))
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_CheckIf_executed() bool {
	if !(this.SchedulePolicy == 2) {
		return false
	}
	return true
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_executed() error {
	if !this._xxx_xxx_Validator_CheckIf_executed() {
		return nil
	}
	if !(this.Executed >= 31507200) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'executed' must be greater than or equal to '31507200'", protovalidator.Int64ToString(this.Executed))
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_started() error {
	if !(this.Started >= 0) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'started' must be greater than or equal to '0'", protovalidator.Int64ToString(this.Started))
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_ended() error {
	if !(this.Ended >= 0) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'ended' must be greater than or equal to '0'", protovalidator.Int64ToString(this.Ended))
	}
	return nil
}

var _xxx_xxx_Validator_SyncJobSchedule_InEnums_ConcurrencyPolicy = map[SyncJobSchedule_ConcurrencyPolicy]bool{0: true, 1: true, 2: true, 3: true}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_concurrency_policy() error {
	if !(this.ConcurrencyPolicy > 0) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'concurrency_policy' must be greater than '0'", protovalidator.Int32ToString(int32(this.ConcurrencyPolicy)))
	}
	if !(_xxx_xxx_Validator_SyncJobSchedule_InEnums_ConcurrencyPolicy[this.ConcurrencyPolicy]) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'concurrency_policy' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.ConcurrencyPolicy)))
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_CheckIf_period_type() bool {
	if !(this.SchedulePolicy == 1) {
		return false
	}
	return true
}

var _xxx_xxx_Validator_SyncJobSchedule_In_PeriodType = map[string]bool{"minute": true, "hour": true, "day": true, "week": true, "month": true, "year": true}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_period_type() error {
	if !this._xxx_xxx_Validator_CheckIf_period_type() {
		return nil
	}
	if !(_xxx_xxx_Validator_SyncJobSchedule_In_PeriodType[this.PeriodType]) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'period_type' must be one of '[minute hour day week month year]'", this.PeriodType)
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_CheckIf_express() bool {
	if !(this.SchedulePolicy == 1) {
		return false
	}
	return true
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_express() error {
	if !this._xxx_xxx_Validator_CheckIf_express() {
		return nil
	}
	if !(protovalidator.StringIsUnixCron(this.Express)) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'express' must be a valid standard UNIX-Style crontab expression", this.Express)
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_timeout() error {
	if !(this.Timeout >= 0) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'timeout' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Timeout))
	}
	if !(this.Timeout <= 100) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'timeout' must be less than or equal to '100'", protovalidator.Int32ToString(this.Timeout))
	}
	return nil
}

var _xxx_xxx_Validator_SyncJobSchedule_InEnums_RetryPolicy = map[SyncJobSchedule_RetryPolicy]bool{0: true, 1: true, 2: true}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_retry_policy() error {
	if !(this.RetryPolicy > 0) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'retry_policy' must be greater than '0'", protovalidator.Int32ToString(int32(this.RetryPolicy)))
	}
	if !(_xxx_xxx_Validator_SyncJobSchedule_InEnums_RetryPolicy[this.RetryPolicy]) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'retry_policy' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.RetryPolicy)))
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_CheckIf_retry_limit() bool {
	if !(this.RetryPolicy == 2) {
		return false
	}
	return true
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_retry_limit() error {
	if !this._xxx_xxx_Validator_CheckIf_retry_limit() {
		return nil
	}
	if !(this.RetryLimit >= 0) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'retry_limit' must be greater than or equal to '0'", protovalidator.Int32ToString(this.RetryLimit))
	}
	if !(this.RetryLimit <= 100) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'retry_limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.RetryLimit))
	}
	return nil
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_CheckIf_retry_interval() bool {
	if !(this.RetryPolicy == 2) {
		return false
	}
	return true
}

func (this *SyncJobSchedule) _xxx_xxx_Validator_Validate_retry_interval() error {
	if !this._xxx_xxx_Validator_CheckIf_retry_interval() {
		return nil
	}
	if !(this.RetryInterval >= 1) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'retry_interval' must be greater than or equal to '1'", protovalidator.Int32ToString(this.RetryInterval))
	}
	if !(this.RetryInterval <= 30) {
		return protovalidator.FieldError1("SyncJobSchedule", "the value of field 'retry_interval' must be less than or equal to '30'", protovalidator.Int32ToString(this.RetryInterval))
	}
	return nil
}

// Set default value for message model.SyncJobSchedule
func (this *SyncJobSchedule) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_schedule_policy(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_executed(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_started(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_ended(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_concurrency_policy(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_period_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_express(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_timeout(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_retry_policy(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_retry_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_retry_interval(); err != nil {
		return err
	}
	return nil
}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("SyncJobRelease", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("SyncJobRelease", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("SyncJobRelease", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "stj-")) {
		return protovalidator.FieldError1("SyncJobRelease", "the value of field 'id' must start with string 'stj-'", this.Id)
	}
	return nil
}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_version() error {
	if !(len(this.Version) == 16) {
		return protovalidator.FieldError1("SyncJobRelease", "the byte length of field 'version' must be equal to '16'", protovalidator.StringByteLenToString(this.Version))
	}
	return nil
}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) >= 2) {
		return protovalidator.FieldError1("SyncJobRelease", "the byte length of field 'name' must be greater than or equal to '2'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 128) {
		return protovalidator.FieldError1("SyncJobRelease", "the byte length of field 'name' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

var _xxx_xxx_Validator_SyncJobRelease_InEnums_Type = map[SyncJob_Type]bool{0: true, 1: true, 2: true, 3: true}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type > 0) {
		return protovalidator.FieldError1("SyncJobRelease", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_SyncJobRelease_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("SyncJobRelease", "the value of field 'type' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) <= 64) {
		return protovalidator.FieldError1("SyncJobRelease", "the byte length of field 'created_by' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("SyncJobRelease", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *SyncJobRelease) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("SyncJobRelease", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

// Set default value for message model.SyncJobRelease
func (this *SyncJobRelease) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_updated(); err != nil {
		return err
	}
	return nil
}
