// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/response/resource_meta.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message response.CreateFilePrepare
func (this *CreateFilePrepare) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ReCreateFilePrepare
func (this *ReCreateFilePrepare) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeFileMeta
func (this *DescribeFileMeta) SetDefaults() {
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

// Set default value for message response.ListFileMetas
func (this *ListFileMetas) SetDefaults() {
	if this == nil {
		return
	}
	return
}