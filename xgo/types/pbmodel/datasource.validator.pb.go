// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/datasource.proto

package pbmodel

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbdatasource"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
	utf8 "unicode/utf8"
)

func (this *DataSource) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DataSource", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DataSource", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("DataSource", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	if !(strings.HasPrefix(this.Id, "som-")) {
		return protovalidator.FieldError1("DataSource", "the value of field 'id' must start with string 'som-'", this.Id)
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) >= 2) {
		return protovalidator.FieldError1("DataSource", "the byte length of field 'name' must be greater than or equal to '2'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 64) {
		return protovalidator.FieldError1("DataSource", "the byte length of field 'name' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_desc() error {
	if !(utf8.RuneCountInString(this.Desc) <= 256) {
		return protovalidator.FieldError1("DataSource", "the character length of field 'desc' must be less than or equal to '256'", protovalidator.StringCharsetLenToString(this.Desc))
	}
	return nil
}

var _xxx_xxx_Validator_DataSource_InEnums_Type = map[DataSource_Type]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true, 6: true, 7: true, 8: true}

func (this *DataSource) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type > 0) {
		return protovalidator.FieldError1("DataSource", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_DataSource_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("DataSource", "the value of field 'type' must in enums of '[0 1 2 3 4 5 6 7 8]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_url() error {
	if !(this.Url != nil) {
		return protovalidator.FieldError2("DataSource", "the value of field 'url' cannot be null")
	}
	return nil
}

var _xxx_xxx_Validator_DataSource_InEnums_Status = map[DataSource_Status]bool{0: true, 1: true, 2: true, 3: true}

func (this *DataSource) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 1) {
		return protovalidator.FieldError1("DataSource", "the value of field 'status' must be greater than '1'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_DataSource_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("DataSource", "the value of field 'status' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) <= 64) {
		return protovalidator.FieldError1("DataSource", "the byte length of field 'created_by' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("DataSource", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("DataSource", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

func (this *DataSource) _xxx_xxx_Validator_Validate_last_connection() error {
	if dt, ok := interface{}(this.LastConnection).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.DataSource
func (this *DataSource) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
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
	if err := this._xxx_xxx_Validator_Validate_url(); err != nil {
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
	if err := this._xxx_xxx_Validator_Validate_last_connection(); err != nil {
		return err
	}
	return nil
}

var _xxx_xxx_Validator_DataSource_URL_InEnums_Type = map[DataSource_Type]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true, 6: true, 7: true, 8: true}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_type() error {
	if !(this.Type > 0) {
		return protovalidator.FieldError1("DataSource_URL", "the value of field 'type' must be greater than '0'", protovalidator.Int32ToString(int32(this.Type)))
	}
	if !(_xxx_xxx_Validator_DataSource_URL_InEnums_Type[this.Type]) {
		return protovalidator.FieldError1("DataSource_URL", "the value of field 'type' must in enums of '[0 1 2 3 4 5 6 7 8]'", protovalidator.Int32ToString(int32(this.Type)))
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_mysql() bool {
	if !(this.Type == 1) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_mysql() error {
	if !this._xxx_xxx_Validator_CheckIf_mysql() {
		return nil
	}
	if !(this.Mysql != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 'mysql' cannot be null")
	}
	if dt, ok := interface{}(this.Mysql).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_postgresql() bool {
	if !(this.Type == 2) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_postgresql() error {
	if !this._xxx_xxx_Validator_CheckIf_postgresql() {
		return nil
	}
	if !(this.Postgresql != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 'postgresql' cannot be null")
	}
	if dt, ok := interface{}(this.Postgresql).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_kafka() bool {
	if !(this.Type == 3) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_kafka() error {
	if !this._xxx_xxx_Validator_CheckIf_kafka() {
		return nil
	}
	if !(this.Kafka != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 'kafka' cannot be null")
	}
	if dt, ok := interface{}(this.Kafka).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_s3() bool {
	if !(this.Type == 4) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_s3() error {
	if !this._xxx_xxx_Validator_CheckIf_s3() {
		return nil
	}
	if !(this.S3 != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 's3' cannot be null")
	}
	if dt, ok := interface{}(this.S3).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_clickhouse() bool {
	if !(this.Type == 5) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_clickhouse() error {
	if !this._xxx_xxx_Validator_CheckIf_clickhouse() {
		return nil
	}
	if !(this.Clickhouse != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 'clickhouse' cannot be null")
	}
	if dt, ok := interface{}(this.Clickhouse).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_hbase() bool {
	if !(this.Type == 6) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_hbase() error {
	if !this._xxx_xxx_Validator_CheckIf_hbase() {
		return nil
	}
	if !(this.Hbase != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 'hbase' cannot be null")
	}
	if dt, ok := interface{}(this.Hbase).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_ftp() bool {
	if !(this.Type == 7) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_ftp() error {
	if !this._xxx_xxx_Validator_CheckIf_ftp() {
		return nil
	}
	if !(this.Ftp != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 'ftp' cannot be null")
	}
	if dt, ok := interface{}(this.Ftp).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DataSource_URL) _xxx_xxx_Validator_CheckIf_hdfs() bool {
	if !(this.Type == 8) {
		return false
	}
	return true
}

func (this *DataSource_URL) _xxx_xxx_Validator_Validate_hdfs() error {
	if !this._xxx_xxx_Validator_CheckIf_hdfs() {
		return nil
	}
	if !(this.Hdfs != nil) {
		return protovalidator.FieldError2("DataSource_URL", "the value of field 'hdfs' cannot be null")
	}
	if dt, ok := interface{}(this.Hdfs).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.DataSource.URL
func (this *DataSource_URL) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_mysql(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_postgresql(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_kafka(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_s3(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_clickhouse(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hbase(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_ftp(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hdfs(); err != nil {
		return err
	}
	return nil
}

func (this *DataSourceConnection) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DataSourceConnection", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DataSourceConnection) _xxx_xxx_Validator_Validate_source_id() error {
	if !(len(this.SourceId) == 20) {
		return protovalidator.FieldError1("DataSourceConnection", "the byte length of field 'source_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SourceId))
	}
	if !(strings.HasPrefix(this.SourceId, "som-")) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'source_id' must start with string 'som-'", this.SourceId)
	}
	return nil
}

func (this *DataSourceConnection) _xxx_xxx_Validator_Validate_network_id() error {
	if !(len(this.NetworkId) == 20) {
		return protovalidator.FieldError1("DataSourceConnection", "the byte length of field 'network_id' must be equal to '20'", protovalidator.StringByteLenToString(this.NetworkId))
	}
	if !(strings.HasPrefix(this.NetworkId, "net-")) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'network_id' must start with string 'net-'", this.NetworkId)
	}
	return nil
}

var _xxx_xxx_Validator_DataSourceConnection_InEnums_Status = map[DataSourceConnection_Status]bool{0: true, 1: true, 2: true}

func (this *DataSourceConnection) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 1) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'status' must be greater than '1'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_DataSourceConnection_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'status' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

var _xxx_xxx_Validator_DataSourceConnection_InEnums_Result = map[DataSourceConnection_Result]bool{0: true, 1: true, 2: true}

func (this *DataSourceConnection) _xxx_xxx_Validator_Validate_result() error {
	if !(this.Result > 0) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'result' must be greater than '0'", protovalidator.Int32ToString(int32(this.Result)))
	}
	if !(_xxx_xxx_Validator_DataSourceConnection_InEnums_Result[this.Result]) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'result' must in enums of '[0 1 2]'", protovalidator.Int32ToString(int32(this.Result)))
	}
	return nil
}

func (this *DataSourceConnection) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("DataSourceConnection", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *DataSourceConnection) _xxx_xxx_Validator_Validate_network_info() error {
	if dt, ok := interface{}(this.NetworkInfo).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.DataSourceConnection
func (this *DataSourceConnection) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_source_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_network_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_result(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_network_info(); err != nil {
		return err
	}
	return nil
}

// Set default value for message model.DataSourceKind
func (this *DataSourceKind) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}
