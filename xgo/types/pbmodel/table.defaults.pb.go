// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/model/table.proto

package pbmodel

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbflink"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message model.FlinkTable
func (this *FlinkTable) SetDefaults() {
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
