// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/request/opaudit_manage.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.AddOpAudit
func (this *AddOpAudit) SetDefaults() {
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

// Set default value for message request.ListOpAudits
func (this *ListOpAudits) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}