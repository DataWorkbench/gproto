// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/response/table_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

// Set default value for message response.DescribeFlinkTable
func (this *DescribeFlinkTable) SetDefaults() {
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

// Set default value for message response.ListFlinkTables
func (this *ListFlinkTables) SetDefaults() {
	if this == nil {
		return
	}
	return
}
