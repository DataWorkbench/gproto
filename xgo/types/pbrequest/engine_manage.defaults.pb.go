// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/request/engine_manage.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.CreateFlinkClusterInK8s
func (this *CreateFlinkClusterInK8S) SetDefaults() {
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

// Set default value for message request.StartFlinkClusterInK8s
func (this *StartFlinkClusterInK8S) SetDefaults() {
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

// Set default value for message request.StopFlinkClusterInK8s
func (this *StopFlinkClusterInK8S) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.CreateNetworkBrokerInK8s
func (this *CreateNetworkBrokerInK8S) SetDefaults() {
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

// Set default value for message request.DeleteNetworkBrokerInK8s
func (this *DeleteNetworkBrokerInK8S) SetDefaults() {
	if this == nil {
		return
	}
	return
}