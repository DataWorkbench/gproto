// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/request/network_manage.proto

package pbrequest

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.ListNetworks
func (this *ListNetworks) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.DeleteNetworks
func (this *DeleteNetworks) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.CreateNetwork
func (this *CreateNetwork) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.UpdateNetwork
func (this *UpdateNetwork) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DescribeNetwork
func (this *DescribeNetwork) SetDefaults() {
	if this == nil {
		return
	}
	return
}
