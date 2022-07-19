// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/engine_manage.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strings "strings"
)

func (this *CreateFlinkClusterInK8S) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("CreateFlinkClusterInK8S", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.CreateFlinkClusterInK8s
func (this *CreateFlinkClusterInK8S) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteFlinkClusterInK8S) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("DeleteFlinkClusterInK8S", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.DeleteFlinkClusterInK8s
func (this *DeleteFlinkClusterInK8S) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}

func (this *CreateNetworkBrokerInK8S) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("CreateNetworkBrokerInK8S", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.CreateNetworkBrokerInK8s
func (this *CreateNetworkBrokerInK8S) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteNetworkBrokerInK8S) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("DeleteNetworkBrokerInK8S", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.DeleteNetworkBrokerInK8s
func (this *DeleteNetworkBrokerInK8S) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteNamespacesInK8S) _xxx_xxx_Validator_Validate_space_ids() error {
	if !(protovalidator.SliceIsUniqueString(this.SpaceIds)) {
		return protovalidator.FieldError2("DeleteNamespacesInK8S", "the array elements in field 'space_ids' must be unique")
	}
	for _, item := range this.SpaceIds {
		_ = item // To avoid unused panics.
		if !(len(item) == 20) {
			return protovalidator.FieldError1("DeleteNamespacesInK8S", "the byte length of array item where in field 'space_ids' must be equal to '20'", protovalidator.StringByteLenToString(item))
		}
		if !(strings.HasPrefix(item, "wks-")) {
			return protovalidator.FieldError1("DeleteNamespacesInK8S", "the value of array item where in field 'space_ids' must start with string 'wks-'", item)
		}
	}
	return nil
}

// Set default value for message request.DeleteNamespacesInK8s
func (this *DeleteNamespacesInK8S) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_ids(); err != nil {
		return err
	}
	return nil
}

func (this *CreateFlinkClusterInK8SV2) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("CreateFlinkClusterInK8SV2", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.CreateFlinkClusterInK8sV2
func (this *CreateFlinkClusterInK8SV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteFlinkClusterInK8SV2) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DeleteFlinkClusterInK8SV2", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DeleteFlinkClusterInK8SV2", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DeleteFlinkClusterInK8SV2) _xxx_xxx_Validator_Validate_cluster_id() error {
	if !(len(this.ClusterId) == 20) {
		return protovalidator.FieldError1("DeleteFlinkClusterInK8SV2", "the byte length of field 'cluster_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ClusterId))
	}
	if !(strings.HasPrefix(this.ClusterId, "cfi-")) {
		return protovalidator.FieldError1("DeleteFlinkClusterInK8SV2", "the value of field 'cluster_id' must start with string 'cfi-'", this.ClusterId)
	}
	return nil
}

func (this *DeleteFlinkClusterInK8SV2) _xxx_xxx_Validator_CheckIf_vxnet_id() bool {
	if !(this.VxnetId != "") {
		return false
	}
	return true
}

func (this *DeleteFlinkClusterInK8SV2) _xxx_xxx_Validator_Validate_vxnet_id() error {
	if !this._xxx_xxx_Validator_CheckIf_vxnet_id() {
		return nil
	}
	if !(strings.HasPrefix(this.VxnetId, "vxnet-")) {
		return protovalidator.FieldError1("DeleteFlinkClusterInK8SV2", "the value of field 'vxnet_id' must start with string 'vxnet-'", this.VxnetId)
	}
	return nil
}

// Set default value for message request.DeleteFlinkClusterInK8sV2
func (this *DeleteFlinkClusterInK8SV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_cluster_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_vxnet_id(); err != nil {
		return err
	}
	return nil
}

func (this *RestartFlinkClusterInK8S) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("RestartFlinkClusterInK8S", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("RestartFlinkClusterInK8S", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *RestartFlinkClusterInK8S) _xxx_xxx_Validator_Validate_cluster_id() error {
	if !(len(this.ClusterId) == 20) {
		return protovalidator.FieldError1("RestartFlinkClusterInK8S", "the byte length of field 'cluster_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ClusterId))
	}
	if !(strings.HasPrefix(this.ClusterId, "cfi-")) {
		return protovalidator.FieldError1("RestartFlinkClusterInK8S", "the value of field 'cluster_id' must start with string 'cfi-'", this.ClusterId)
	}
	return nil
}

// Set default value for message request.RestartFlinkClusterInK8s
func (this *RestartFlinkClusterInK8S) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_cluster_id(); err != nil {
		return err
	}
	return nil
}

func (this *CreateNetworkBrokerInK8SV2) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("CreateNetworkBrokerInK8SV2", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("CreateNetworkBrokerInK8SV2", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *CreateNetworkBrokerInK8SV2) _xxx_xxx_Validator_Validate_router_id() error {
	if !(strings.HasPrefix(this.RouterId, "rtr-")) {
		return protovalidator.FieldError1("CreateNetworkBrokerInK8SV2", "the value of field 'router_id' must start with string 'rtr-'", this.RouterId)
	}
	return nil
}

func (this *CreateNetworkBrokerInK8SV2) _xxx_xxx_Validator_Validate_vxnet_id() error {
	if !(strings.HasPrefix(this.VxnetId, "vxnet-")) {
		return protovalidator.FieldError1("CreateNetworkBrokerInK8SV2", "the value of field 'vxnet_id' must start with string 'vxnet-'", this.VxnetId)
	}
	return nil
}

// Set default value for message request.CreateNetworkBrokerInK8sV2
func (this *CreateNetworkBrokerInK8SV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_router_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_vxnet_id(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteNetworkBrokerInK8SV2) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DeleteNetworkBrokerInK8SV2", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DeleteNetworkBrokerInK8SV2", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DeleteNetworkBrokerInK8SV2) _xxx_xxx_Validator_Validate_router_id() error {
	if !(strings.HasPrefix(this.RouterId, "rtr-")) {
		return protovalidator.FieldError1("DeleteNetworkBrokerInK8SV2", "the value of field 'router_id' must start with string 'rtr-'", this.RouterId)
	}
	return nil
}

func (this *DeleteNetworkBrokerInK8SV2) _xxx_xxx_Validator_Validate_vxnet_id() error {
	if !(strings.HasPrefix(this.VxnetId, "vxnet-")) {
		return protovalidator.FieldError1("DeleteNetworkBrokerInK8SV2", "the value of field 'vxnet_id' must start with string 'vxnet-'", this.VxnetId)
	}
	return nil
}

// Set default value for message request.DeleteNetworkBrokerInK8sV2
func (this *DeleteNetworkBrokerInK8SV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_router_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_vxnet_id(); err != nil {
		return err
	}
	return nil
}

func (this *CreateDataServiceClusterInK8SV2) _xxx_xxx_Validator_Validate_info() error {
	if !(this.Info != nil) {
		return protovalidator.FieldError2("CreateDataServiceClusterInK8SV2", "the value of field 'info' cannot be null")
	}
	if dt, ok := interface{}(this.Info).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message request.CreateDataServiceClusterInK8sV2
func (this *CreateDataServiceClusterInK8SV2) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_info(); err != nil {
		return err
	}
	return nil
}
