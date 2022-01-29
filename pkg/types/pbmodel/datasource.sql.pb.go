// Code generated by protoc-gen-gosql. DO NOT EDIT.
// versions:
// 		protoc-gen-gosql v0.1
// source: proto/types/model/datasource.proto

package pbmodel

import (
	driver "database/sql/driver"
	json "encoding/json"
	_ "github.com/DataWorkbench/gproto/pkg/types/pbmodel/pbdatasource"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/gosqlpb"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/validatorpb"
)

// Scan for implements sql.Scanner (- database/sql).
func (t *DataSource_URL) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *DataSource_URL) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}
