// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/request/observer.proto

package pbrequest

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.PTasksStatusStat
func (this *PTasksStatusStat) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.PTasksExecStat
func (this *PTasksExecStat) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.PTaskRuntimeRanking
func (this *PTaskRuntimeRanking) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.PTaskErrorRanking
func (this *PTaskErrorRanking) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.PTaskDispatchCount
func (this *PTaskDispatchCount) SetDefaults() {
	if this == nil {
		return
	}
	return
}
