// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/request/file_meta_manage.proto

package pbrequest

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.CreateFilePrepare
func (this *CreateFilePrepare) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.CreateFileMeta
func (this *CreateFileMeta) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ReCreateFilePrepare
func (this *ReCreateFilePrepare) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ReCreateFileMeta
func (this *ReCreateFileMeta) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DescribeFileMeta
func (this *DescribeFileMeta) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.UpdateFileMeta
func (this *UpdateFileMeta) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ListFileMetas
func (this *ListFileMetas) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.DeleteFileMetas
func (this *DeleteFileMetas) SetDefaults() {
	if this == nil {
		return
	}
	return
}
