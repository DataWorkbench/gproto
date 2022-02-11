// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/model/flink/flink_operator.proto

package pbflink

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
)

func (this *ColumnAs) _xxx_xxx_Validator_Validate_field() error {
	if !(len(this.Field) >= 0) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'field' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Field))
	}
	if !(len(this.Field) <= 64) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'field' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Field))
	}
	return nil
}

func (this *ColumnAs) _xxx_xxx_Validator_Validate_func() error {
	if !(len(this.Func) >= 0) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'func' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Func))
	}
	if !(len(this.Func) <= 64) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'func' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Func))
	}
	return nil
}

func (this *ColumnAs) _xxx_xxx_Validator_Validate_type() error {
	if !(len(this.Type) >= 0) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'type' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Type))
	}
	if !(len(this.Type) <= 256) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'type' must be less than or equal to '256'", protovalidator.StringByteLenToString(this.Type))
	}
	return nil
}

func (this *ColumnAs) _xxx_xxx_Validator_Validate_as() error {
	if !(len(this.As) >= 0) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'as' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.As))
	}
	if !(len(this.As) <= 64) {
		return protovalidator.FieldError1("ColumnAs", "the byte length of field 'as' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.As))
	}
	return nil
}

// Set default value for message flink.ColumnAs
func (this *ColumnAs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_field(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_func(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_as(); err != nil {
		return err
	}
	return nil
}

func (this *DestOperator) _xxx_xxx_Validator_Validate_columns() error {
	if !(len(this.Columns) > 0) {
		return protovalidator.FieldError1("DestOperator", "the length of field 'columns' must be greater than '0'", strconv.Itoa(len(this.Columns)))
	}
	if !(len(this.Columns) <= 20000) {
		return protovalidator.FieldError1("DestOperator", "the length of field 'columns' must be less than or equal to '20000'", strconv.Itoa(len(this.Columns)))
	}
	return nil
}

func (this *DestOperator) _xxx_xxx_Validator_Validate_table_id() error {
	if !(len(this.TableId) == 20) {
		return protovalidator.FieldError1("DestOperator", "the byte length of field 'table_id' must be equal to '20'", protovalidator.StringByteLenToString(this.TableId))
	}
	return nil
}

// Set default value for message flink.DestOperator
func (this *DestOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_columns(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_table_id(); err != nil {
		return err
	}
	return nil
}

func (this *ValuesOperator) _xxx_xxx_Validator_Validate_rows() error {
	if !(len(this.Rows) > 0) {
		return protovalidator.FieldError1("ValuesOperator", "the length of field 'rows' must be greater than '0'", strconv.Itoa(len(this.Rows)))
	}
	for _, item := range this.Rows {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message flink.ValuesOperator
func (this *ValuesOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_rows(); err != nil {
		return err
	}
	return nil
}

func (this *ValuesOperator_ValuesType) _xxx_xxx_Validator_Validate_values() error {
	if !(len(this.Values) > 0) {
		return protovalidator.FieldError1("ValuesOperator_ValuesType", "the length of field 'values' must be greater than '0'", strconv.Itoa(len(this.Values)))
	}
	return nil
}

// Set default value for message flink.ValuesOperator.ValuesType
func (this *ValuesOperator_ValuesType) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_values(); err != nil {
		return err
	}
	return nil
}

func (this *OrderByOperator) _xxx_xxx_Validator_Validate_column() error {
	if !(len(this.Column) > 0) {
		return protovalidator.FieldError1("OrderByOperator", "the length of field 'column' must be greater than '0'", strconv.Itoa(len(this.Column)))
	}
	if !(len(this.Column) <= 1025) {
		return protovalidator.FieldError1("OrderByOperator", "the length of field 'column' must be less than or equal to '1025'", strconv.Itoa(len(this.Column)))
	}
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message flink.OrderByOperator
func (this *OrderByOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	return nil
}

func (this *OrderByOperator_OrderByColumn) _xxx_xxx_Validator_Validate_field() error {
	if !(len(this.Field) >= 0) {
		return protovalidator.FieldError1("OrderByOperator_OrderByColumn", "the byte length of field 'field' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Field))
	}
	if !(len(this.Field) <= 64) {
		return protovalidator.FieldError1("OrderByOperator_OrderByColumn", "the byte length of field 'field' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Field))
	}
	return nil
}

func (this *OrderByOperator_OrderByColumn) _xxx_xxx_Validator_Validate_order() error {
	if !(len(this.Order) >= 0) {
		return protovalidator.FieldError1("OrderByOperator_OrderByColumn", "the byte length of field 'order' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Order))
	}
	if !(len(this.Order) <= 64) {
		return protovalidator.FieldError1("OrderByOperator_OrderByColumn", "the byte length of field 'order' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Order))
	}
	return nil
}

// Set default value for message flink.OrderByOperator.OrderByColumn
func (this *OrderByOperator_OrderByColumn) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_field(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_order(); err != nil {
		return err
	}
	return nil
}

func (this *LimitOperator) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("LimitOperator", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("LimitOperator", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

// Set default value for message flink.LimitOperator
func (this *LimitOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	return nil
}

func (this *OffsetOperator) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset > 0) {
		return protovalidator.FieldError1("OffsetOperator", "the value of field 'offset' must be greater than '0'", protovalidator.Int32ToString(this.Offset))
	}
	if !(this.Offset <= 100) {
		return protovalidator.FieldError1("OffsetOperator", "the value of field 'offset' must be less than or equal to '100'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

// Set default value for message flink.OffsetOperator
func (this *OffsetOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	return nil
}

func (this *FetchOperator) _xxx_xxx_Validator_Validate_fetch() error {
	if !(this.Fetch > 0) {
		return protovalidator.FieldError1("FetchOperator", "the value of field 'fetch' must be greater than '0'", protovalidator.Int32ToString(this.Fetch))
	}
	if !(this.Fetch <= 100) {
		return protovalidator.FieldError1("FetchOperator", "the value of field 'fetch' must be less than or equal to '100'", protovalidator.Int32ToString(this.Fetch))
	}
	return nil
}

// Set default value for message flink.FetchOperator
func (this *FetchOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_fetch(); err != nil {
		return err
	}
	return nil
}

// Set default value for message flink.UnionOperator
func (this *UnionOperator) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *GroupByOperator) _xxx_xxx_Validator_Validate_group_by() error {
	if !(len(this.GroupBy) > 0) {
		return protovalidator.FieldError1("GroupByOperator", "the length of field 'group_by' must be greater than '0'", strconv.Itoa(len(this.GroupBy)))
	}
	if !(len(this.GroupBy) <= 1024) {
		return protovalidator.FieldError1("GroupByOperator", "the length of field 'group_by' must be less than or equal to '1024'", strconv.Itoa(len(this.GroupBy)))
	}
	return nil
}

// Set default value for message flink.GroupByOperator
func (this *GroupByOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_group_by(); err != nil {
		return err
	}
	return nil
}

func (this *HavingOperator) _xxx_xxx_Validator_Validate_having() error {
	if !(len(this.Having) > 0) {
		return protovalidator.FieldError1("HavingOperator", "the byte length of field 'having' must be greater than '0'", protovalidator.StringByteLenToString(this.Having))
	}
	if !(len(this.Having) < 1024) {
		return protovalidator.FieldError1("HavingOperator", "the byte length of field 'having' must be less than '1024'", protovalidator.StringByteLenToString(this.Having))
	}
	return nil
}

// Set default value for message flink.HavingOperator
func (this *HavingOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_having(); err != nil {
		return err
	}
	return nil
}

func (this *ConstOperator) _xxx_xxx_Validator_Validate_table() error {
	if !(len(this.Table) >= 0) {
		return protovalidator.FieldError1("ConstOperator", "the byte length of field 'table' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Table))
	}
	if !(len(this.Table) <= 64) {
		return protovalidator.FieldError1("ConstOperator", "the byte length of field 'table' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Table))
	}
	return nil
}

func (this *ConstOperator) _xxx_xxx_Validator_Validate_column() error {
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message flink.ConstOperator
func (this *ConstOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_table(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	return nil
}

func (this *SourceOperator) _xxx_xxx_Validator_Validate_table_id() error {
	if !(len(this.TableId) == 20) {
		return protovalidator.FieldError1("SourceOperator", "the byte length of field 'table_id' must be equal to '20'", protovalidator.StringByteLenToString(this.TableId))
	}
	return nil
}

func (this *SourceOperator) _xxx_xxx_Validator_Validate_table_as() error {
	if !(len(this.TableAs) >= 0) {
		return protovalidator.FieldError1("SourceOperator", "the byte length of field 'table_as' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.TableAs))
	}
	if !(len(this.TableAs) <= 64) {
		return protovalidator.FieldError1("SourceOperator", "the byte length of field 'table_as' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.TableAs))
	}
	return nil
}

func (this *SourceOperator) _xxx_xxx_Validator_Validate_distinct() error {
	if !(len(this.Distinct) >= 0) {
		return protovalidator.FieldError1("SourceOperator", "the byte length of field 'distinct' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Distinct))
	}
	if !(len(this.Distinct) <= 64) {
		return protovalidator.FieldError1("SourceOperator", "the byte length of field 'distinct' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Distinct))
	}
	return nil
}

func (this *SourceOperator) _xxx_xxx_Validator_Validate_column() error {
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *SourceOperator) _xxx_xxx_Validator_Validate_custom_column() error {
	for _, item := range this.CustomColumn {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *SourceOperator) _xxx_xxx_Validator_Validate_time_column() error {
	for _, item := range this.TimeColumn {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message flink.SourceOperator
func (this *SourceOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_table_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_table_as(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_distinct(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_custom_column(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_time_column(); err != nil {
		return err
	}
	return nil
}

func (this *DimensionOperator) _xxx_xxx_Validator_Validate_table_id() error {
	if !(len(this.TableId) == 20) {
		return protovalidator.FieldError1("DimensionOperator", "the byte length of field 'table_id' must be equal to '20'", protovalidator.StringByteLenToString(this.TableId))
	}
	return nil
}

func (this *DimensionOperator) _xxx_xxx_Validator_Validate_table_as() error {
	if !(len(this.TableAs) >= 0) {
		return protovalidator.FieldError1("DimensionOperator", "the byte length of field 'table_as' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.TableAs))
	}
	if !(len(this.TableAs) <= 64) {
		return protovalidator.FieldError1("DimensionOperator", "the byte length of field 'table_as' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.TableAs))
	}
	return nil
}

func (this *DimensionOperator) _xxx_xxx_Validator_Validate_distinct() error {
	if !(len(this.Distinct) >= 0) {
		return protovalidator.FieldError1("DimensionOperator", "the byte length of field 'distinct' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Distinct))
	}
	if !(len(this.Distinct) <= 64) {
		return protovalidator.FieldError1("DimensionOperator", "the byte length of field 'distinct' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Distinct))
	}
	return nil
}

func (this *DimensionOperator) _xxx_xxx_Validator_Validate_column() error {
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *DimensionOperator) _xxx_xxx_Validator_Validate_custom_column() error {
	for _, item := range this.CustomColumn {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *DimensionOperator) _xxx_xxx_Validator_Validate_time_column() error {
	if dt, ok := interface{}(this.TimeColumn).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message flink.DimensionOperator
func (this *DimensionOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_table_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_table_as(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_distinct(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_custom_column(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_time_column(); err != nil {
		return err
	}
	return nil
}

// Set default value for message flink.ExceptOperator
func (this *ExceptOperator) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message flink.IntersectOperator
func (this *IntersectOperator) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *FilterOperator) _xxx_xxx_Validator_Validate_where() error {
	if !(len(this.Where) >= 0) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'where' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Where))
	}
	if !(len(this.Where) <= 1024) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'where' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.Where))
	}
	return nil
}

func (this *FilterOperator) _xxx_xxx_Validator_Validate_in() error {
	if !(len(this.In) >= 0) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'in' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.In))
	}
	if !(len(this.In) <= 1024) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'in' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.In))
	}
	return nil
}

func (this *FilterOperator) _xxx_xxx_Validator_Validate_exists() error {
	if !(len(this.Exists) >= 0) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'exists' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Exists))
	}
	if !(len(this.Exists) <= 1024) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'exists' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.Exists))
	}
	return nil
}

func (this *FilterOperator) _xxx_xxx_Validator_Validate_expression() error {
	if !(len(this.Expression) >= 0) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'expression' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Expression))
	}
	if !(len(this.Expression) <= 1024) {
		return protovalidator.FieldError1("FilterOperator", "the byte length of field 'expression' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.Expression))
	}
	return nil
}

// Set default value for message flink.FilterOperator
func (this *FilterOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_where(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_in(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_exists(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_expression(); err != nil {
		return err
	}
	return nil
}

var _xxx_xxx_Validator_JoinOperator_In_Join = map[string]bool{"JOIN": true, "LEFT JOIN": true, "RIGHT JOIN": true, "FULL OUTER JOIN": true, "CROSS JOIN": true, "INTERVAL JOIN": true}

func (this *JoinOperator) _xxx_xxx_Validator_Validate_join() error {
	if !(_xxx_xxx_Validator_JoinOperator_In_Join[this.Join]) {
		return protovalidator.FieldError1("JoinOperator", "the value of field 'join' must be one of '[JOIN LEFT JOIN RIGHT JOIN FULL OUTER JOIN CROSS JOIN INTERVAL JOIN]'", this.Join)
	}
	if !(len(this.Join) >= 0) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'join' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Join))
	}
	if !(len(this.Join) <= 64) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'join' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.Join))
	}
	return nil
}

func (this *JoinOperator) _xxx_xxx_Validator_Validate_expression() error {
	if !(len(this.Expression) >= 0) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'expression' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Expression))
	}
	if !(len(this.Expression) <= 1024) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'expression' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.Expression))
	}
	return nil
}

func (this *JoinOperator) _xxx_xxx_Validator_Validate_table_as() error {
	if !(len(this.TableAs) >= 0) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'table_as' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.TableAs))
	}
	if !(len(this.TableAs) <= 64) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'table_as' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.TableAs))
	}
	return nil
}

func (this *JoinOperator) _xxx_xxx_Validator_Validate_table_as_right() error {
	if !(len(this.TableAsRight) >= 0) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'table_as_right' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.TableAsRight))
	}
	if !(len(this.TableAsRight) <= 64) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'table_as_right' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.TableAsRight))
	}
	return nil
}

func (this *JoinOperator) _xxx_xxx_Validator_Validate_args() error {
	if !(len(this.Args) >= 0) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'args' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Args))
	}
	if !(len(this.Args) <= 1024) {
		return protovalidator.FieldError1("JoinOperator", "the byte length of field 'args' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.Args))
	}
	return nil
}

func (this *JoinOperator) _xxx_xxx_Validator_Validate_column() error {
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *JoinOperator) _xxx_xxx_Validator_Validate_generate_column() error {
	for _, item := range this.GenerateColumn {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message flink.JoinOperator
func (this *JoinOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_join(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_expression(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_table_as(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_table_as_right(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_args(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_generate_column(); err != nil {
		return err
	}
	return nil
}

func (this *UDTFOperator) _xxx_xxx_Validator_Validate_udf_id() error {
	if !(len(this.UdfId) == 20) {
		return protovalidator.FieldError1("UDTFOperator", "the byte length of field 'udf_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UdfId))
	}
	return nil
}

func (this *UDTFOperator) _xxx_xxx_Validator_Validate_args() error {
	if !(len(this.Args) >= 0) {
		return protovalidator.FieldError1("UDTFOperator", "the byte length of field 'args' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Args))
	}
	if !(len(this.Args) <= 1024) {
		return protovalidator.FieldError1("UDTFOperator", "the byte length of field 'args' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.Args))
	}
	return nil
}

func (this *UDTFOperator) _xxx_xxx_Validator_Validate_table_as() error {
	if !(len(this.TableAs) >= 0) {
		return protovalidator.FieldError1("UDTFOperator", "the byte length of field 'table_as' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.TableAs))
	}
	if !(len(this.TableAs) <= 64) {
		return protovalidator.FieldError1("UDTFOperator", "the byte length of field 'table_as' must be less than or equal to '64'", protovalidator.StringByteLenToString(this.TableAs))
	}
	return nil
}

func (this *UDTFOperator) _xxx_xxx_Validator_Validate_column() error {
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *UDTFOperator) _xxx_xxx_Validator_Validate_select_column() error {
	for _, item := range this.SelectColumn {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message flink.UDTFOperator
func (this *UDTFOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_udf_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_args(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_table_as(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_select_column(); err != nil {
		return err
	}
	return nil
}

func (this *UDTTFOperator) _xxx_xxx_Validator_Validate_udf_id() error {
	if !(len(this.UdfId) == 20) {
		return protovalidator.FieldError1("UDTTFOperator", "the byte length of field 'udf_id' must be equal to '20'", protovalidator.StringByteLenToString(this.UdfId))
	}
	return nil
}

func (this *UDTTFOperator) _xxx_xxx_Validator_Validate_args() error {
	if !(len(this.Args) >= 0) {
		return protovalidator.FieldError1("UDTTFOperator", "the byte length of field 'args' must be greater than or equal to '0'", protovalidator.StringByteLenToString(this.Args))
	}
	if !(len(this.Args) <= 1024) {
		return protovalidator.FieldError1("UDTTFOperator", "the byte length of field 'args' must be less than or equal to '1024'", protovalidator.StringByteLenToString(this.Args))
	}
	return nil
}

func (this *UDTTFOperator) _xxx_xxx_Validator_Validate_column() error {
	for _, item := range this.Column {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message flink.UDTTFOperator
func (this *UDTTFOperator) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_udf_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_args(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_column(); err != nil {
		return err
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_source() error {
	if dt, ok := interface{}(this.Source).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_dest() error {
	if dt, ok := interface{}(this.Dest).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_values() error {
	if dt, ok := interface{}(this.Values).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_order_by() error {
	if dt, ok := interface{}(this.OrderBy).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_limit() error {
	if dt, ok := interface{}(this.Limit).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_offset() error {
	if dt, ok := interface{}(this.Offset).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_fetch() error {
	if dt, ok := interface{}(this.Fetch).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_union() error {
	if dt, ok := interface{}(this.Union).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_group_by() error {
	if dt, ok := interface{}(this.GroupBy).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_having() error {
	if dt, ok := interface{}(this.Having).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_const() error {
	if dt, ok := interface{}(this.Const).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_dimension() error {
	if dt, ok := interface{}(this.Dimension).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_except() error {
	if dt, ok := interface{}(this.Except).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_intersect() error {
	if dt, ok := interface{}(this.Intersect).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_filter() error {
	if dt, ok := interface{}(this.Filter).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_udtf() error {
	if dt, ok := interface{}(this.Udtf).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_udttf() error {
	if dt, ok := interface{}(this.Udttf).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *OperatorProperty) _xxx_xxx_Validator_Validate_join() error {
	if dt, ok := interface{}(this.Join).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

// Set default value for message flink.OperatorProperty
func (this *OperatorProperty) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_source(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_dest(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_values(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_order_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_fetch(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_union(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_group_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_having(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_const(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_dimension(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_except(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_intersect(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_filter(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_udtf(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_udttf(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_join(); err != nil {
		return err
	}
	return nil
}