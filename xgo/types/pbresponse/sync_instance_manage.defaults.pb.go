// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/response/sync_instance_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

// Set default value for message response.ListSyncInstances
func (this *ListSyncInstances) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeSyncInstance
func (this *DescribeSyncInstance) SetDefaults() {
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
