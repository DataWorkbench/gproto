// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/request/table_manage.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbflink"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.CreateFlinkTable
func (this *CreateFlinkTable) SetDefaults() {
	if this == nil {
		return
	}
	if this.TableSchema != nil {
		if dt, ok := interface{}(this.TableSchema).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.UpdateFlinkTable
func (this *UpdateFlinkTable) SetDefaults() {
	if this == nil {
		return
	}
	if this.TableSchema != nil {
		if dt, ok := interface{}(this.TableSchema).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.DeleteFlinkTables
func (this *DeleteFlinkTables) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DescribeFlinkTable
func (this *DescribeFlinkTable) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ListFlinkTables
func (this *ListFlinkTables) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}
