// Code generated by protoc-gen-gosql. DO NOT EDIT.
// versions:
// 		protoc-gen-gosql 0.0.1
// source: proto/types/model/quota.proto

package pbmodel

import (
	driver "database/sql/driver"
	json "encoding/json"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetWorkspace) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetWorkspace) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetMember) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetMember) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetCustomRole) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetCustomRole) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetStreamJob) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetStreamJob) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetSyncJob) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetSyncJob) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetDataSource) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetDataSource) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetUDF) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetUDF) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetFile) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetFile) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetFlinkCluster) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetFlinkCluster) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}

// Scan for implements sql.Scanner (- database/sql).
func (t *QuotaSetNetwork) Scan(val interface{}) error {
	return json.Unmarshal(val.([]byte), t)
}

// Value for implements driver.Valuer (- database/sql/driver)
func (t *QuotaSetNetwork) Value() (driver.Value, error) {
	if t == nil {
		return nil, nil
	}
	return json.Marshal(t)
}
