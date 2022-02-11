// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/cluster.proto

package pbmodel

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbflink"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
)

func (this *HostAliases) _xxx_xxx_Validator_Validate_items() error {
	for _, item := range this.Items {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message model.HostAliases
func (this *HostAliases) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_items(); err != nil {
		return err
	}
	return nil
}

func (this *HostAliases_Item) _xxx_xxx_Validator_Validate_ip() error {
	if !(protovalidator.StringIsIPv4(this.Ip)) {
		return protovalidator.FieldError1("HostAliases_Item", "the value of field 'ip' must be a valid IPv4 address", this.Ip)
	}
	return nil
}

func (this *HostAliases_Item) _xxx_xxx_Validator_Validate_hostname() error {
	if !(protovalidator.StringIsHostname(this.Hostname)) {
		return protovalidator.FieldError1("HostAliases_Item", "the value of field 'hostname' must be a valid hostname as defined by RFC 952", this.Hostname)
	}
	return nil
}

// Set default value for message model.HostAliases.Item
func (this *HostAliases_Item) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_ip(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_hostname(); err != nil {
		return err
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("FlinkCluster", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) == 20) {
		return protovalidator.FieldError1("FlinkCluster", "the byte length of field 'id' must be equal to '20'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_name() error {
	if !(len(this.Name) >= 2) {
		return protovalidator.FieldError1("FlinkCluster", "the byte length of field 'name' must be greater than or equal to '2'", protovalidator.StringByteLenToString(this.Name))
	}
	if !(len(this.Name) <= 128) {
		return protovalidator.FieldError1("FlinkCluster", "the byte length of field 'name' must be less than or equal to '128'", protovalidator.StringByteLenToString(this.Name))
	}
	return nil
}

var _xxx_xxx_Validator_FlinkCluster_In_Version = map[string]bool{"flink-1.12.3-scala_2.11": true}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_version() error {
	if !(_xxx_xxx_Validator_FlinkCluster_In_Version[this.Version]) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'version' must be one of '[flink-1.12.3-scala_2.11]'", this.Version)
	}
	return nil
}

var _xxx_xxx_Validator_FlinkCluster_InEnums_Status = map[FlinkCluster_Status]bool{0: true, 1: true, 2: true, 3: true, 4: true, 5: true, 6: true}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_status() error {
	if !(this.Status > 0) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'status' must be greater than '0'", protovalidator.Int32ToString(int32(this.Status)))
	}
	if !(_xxx_xxx_Validator_FlinkCluster_InEnums_Status[this.Status]) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'status' must in enums of '[0 1 2 3 4 5 6]'", protovalidator.Int32ToString(int32(this.Status)))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_task_num() error {
	if !(this.TaskNum > 0) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'task_num' must be greater than '0'", protovalidator.Int32ToString(this.TaskNum))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_job_cu() error {
	if !(this.JobCu >= 0.500000) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'job_cu' must be greater than or equal to '0.5'", protovalidator.Float32ToString(this.JobCu))
	}
	if !(this.JobCu <= 8.000000) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'job_cu' must be less than or equal to '8'", protovalidator.Float32ToString(this.JobCu))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_task_cu() error {
	if !(this.TaskCu >= 0.500000) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'task_cu' must be greater than or equal to '0.5'", protovalidator.Float32ToString(this.TaskCu))
	}
	if !(this.TaskCu <= 8.000000) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'task_cu' must be less than or equal to '8'", protovalidator.Float32ToString(this.TaskCu))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_host_aliases() error {
	if dt, ok := interface{}(this.HostAliases).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_config() error {
	if dt, ok := interface{}(this.Config).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_created_by() error {
	if !(len(this.CreatedBy) <= 64) {
		return protovalidator.FieldError1("FlinkCluster", "the byte length of field 'created_by' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.CreatedBy))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_updated() error {
	if !(this.Updated > 0) {
		return protovalidator.FieldError1("FlinkCluster", "the value of field 'updated' must be greater than '0'", protovalidator.Int64ToString(this.Updated))
	}
	return nil
}

func (this *FlinkCluster) _xxx_xxx_Validator_Validate_network_info() error {
	if dt, ok := interface{}(this.NetworkInfo).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message model.FlinkCluster
func (this *FlinkCluster) Validate() error {
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
	if err := this._xxx_xxx_Validator_Validate_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_status(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_task_num(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_job_cu(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_task_cu(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_host_aliases(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_config(); err != nil {
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
	if err := this._xxx_xxx_Validator_Validate_network_info(); err != nil {
		return err
	}
	return nil
}

func (this *FlinkClusterBinding) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("FlinkClusterBinding", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("FlinkClusterBinding", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *FlinkClusterBinding) _xxx_xxx_Validator_Validate_cluster_id() error {
	if !(len(this.ClusterId) == 20) {
		return protovalidator.FieldError1("FlinkClusterBinding", "the byte length of field 'cluster_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ClusterId))
	}
	if !(strings.HasPrefix(this.ClusterId, "net-")) {
		return protovalidator.FieldError1("FlinkClusterBinding", "the value of field 'cluster_id' must start with string 'net-'", this.ClusterId)
	}
	return nil
}

func (this *FlinkClusterBinding) _xxx_xxx_Validator_Validate_module_id() error {
	if !(len(this.ModuleId) == 20) {
		return protovalidator.FieldError1("FlinkClusterBinding", "the byte length of field 'module_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ModuleId))
	}
	return nil
}

func (this *FlinkClusterBinding) _xxx_xxx_Validator_Validate_version() error {
	if !(this.Version != "") {
		return protovalidator.FieldError1("FlinkClusterBinding", "the value of field 'version' must be not equal to ''", this.Version)
	}
	return nil
}

func (this *FlinkClusterBinding) _xxx_xxx_Validator_Validate_created() error {
	if !(this.Created > 0) {
		return protovalidator.FieldError1("FlinkClusterBinding", "the value of field 'created' must be greater than '0'", protovalidator.Int64ToString(this.Created))
	}
	return nil
}

// Set default value for message model.FlinkClusterBinding
func (this *FlinkClusterBinding) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_cluster_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_module_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_created(); err != nil {
		return err
	}
	return nil
}