// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/response/account_proxy.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

// Set default value for message response.DescribeAccessKeyByProxy
func (this *DescribeAccessKeyByProxy) SetDefaults() {
	if this == nil {
		return
	}
	if this.KeySet != nil {
		if dt, ok := interface{}(this.KeySet).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.ListUsersByProxy
func (this *ListUsersByProxy) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ListNotificationsByProxy
func (this *ListNotificationsByProxy) SetDefaults() {
	if this == nil {
		return
	}
	return
}