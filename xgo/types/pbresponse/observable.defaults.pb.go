// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/response/observable.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

// Set default value for message response.DescribeWorkspaceOverview
func (this *DescribeWorkspaceOverview) SetDefaults() {
	if this == nil {
		return
	}
	if this.Overview != nil {
		if dt, ok := interface{}(this.Overview).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}
