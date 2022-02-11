// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/resource_manage.proto

package pbrequest

import (
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
	strings "strings"
)

// Set default value for message request.UploadFileRequest
func (this *UploadFileRequest) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

// Set default value for message request.ReUploadFileRequest
func (this *ReUploadFileRequest) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *DownloadFile) _xxx_xxx_Validator_Validate_resource_id() error {
	if !(len(this.ResourceId) == 20) {
		return protovalidator.FieldError1("DownloadFile", "the byte length of field 'resource_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ResourceId))
	}
	return nil
}

// Set default value for message request.DownloadFile
func (this *DownloadFile) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_resource_id(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeFile) _xxx_xxx_Validator_Validate_resource_id() error {
	if !(len(this.ResourceId) == 20) {
		return protovalidator.FieldError1("DescribeFile", "the byte length of field 'resource_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ResourceId))
	}
	return nil
}

// Set default value for message request.DescribeFile
func (this *DescribeFile) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_resource_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListResources) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("ListResources", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("ListResources", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *ListResources) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListResources", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListResources", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListResources) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListResources", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

func (this *ListResources) _xxx_xxx_Validator_Validate_resource_type() error {
	if !(this.ResourceType >= 0) {
		return protovalidator.FieldError1("ListResources", "the value of field 'resource_type' must be greater than or equal to '0'", protovalidator.Int32ToString(this.ResourceType))
	}
	if !(this.ResourceType <= 3) {
		return protovalidator.FieldError1("ListResources", "the value of field 'resource_type' must be less than or equal to '3'", protovalidator.Int32ToString(this.ResourceType))
	}
	return nil
}

func (this *ListResources) _xxx_xxx_Validator_Validate_search() error {
	if !(len(this.Search) <= 500) {
		return protovalidator.FieldError1("ListResources", "the byte length of field 'search' must be less than or equal to '500'", protovalidator.StringByteLenToString(this.Search))
	}
	return nil
}

var _xxx_xxx_Validator_ListResources_In_SortBy = map[string]bool{"": true, "id": true, "created": true, "updated": true, "name": true, "size": true}

func (this *ListResources) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListResources_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListResources", "the value of field 'sort_by' must be one of '[ id created updated name size]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListResources
func (this *ListResources) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_resource_type(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_search(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateResource) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("UpdateResource", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("UpdateResource", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *UpdateResource) _xxx_xxx_Validator_Validate_resource_id() error {
	if !(len(this.ResourceId) == 20) {
		return protovalidator.FieldError1("UpdateResource", "the byte length of field 'resource_id' must be equal to '20'", protovalidator.StringByteLenToString(this.ResourceId))
	}
	return nil
}

func (this *UpdateResource) _xxx_xxx_Validator_Validate_resource_name() error {
	if !(len(this.ResourceName) <= 500) {
		return protovalidator.FieldError1("UpdateResource", "the byte length of field 'resource_name' must be less than or equal to '500'", protovalidator.StringByteLenToString(this.ResourceName))
	}
	return nil
}

var _xxx_xxx_Validator_UpdateResource_InEnums_ResourceType = map[pbmodel.Resource_Type]bool{0: true, 1: true, 2: true, 3: true}

func (this *UpdateResource) _xxx_xxx_Validator_Validate_resource_type() error {
	if !(this.ResourceType > 0) {
		return protovalidator.FieldError1("UpdateResource", "the value of field 'resource_type' must be greater than '0'", protovalidator.Int32ToString(int32(this.ResourceType)))
	}
	if !(_xxx_xxx_Validator_UpdateResource_InEnums_ResourceType[this.ResourceType]) {
		return protovalidator.FieldError1("UpdateResource", "the value of field 'resource_type' must in enums of '[0 1 2 3]'", protovalidator.Int32ToString(int32(this.ResourceType)))
	}
	return nil
}

// Set default value for message request.UpdateResource
func (this *UpdateResource) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_resource_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_resource_name(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_resource_type(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteResources) _xxx_xxx_Validator_Validate_space_id() error {
	if !(len(this.SpaceId) == 20) {
		return protovalidator.FieldError1("DeleteResources", "the byte length of field 'space_id' must be equal to '20'", protovalidator.StringByteLenToString(this.SpaceId))
	}
	if !(strings.HasPrefix(this.SpaceId, "wks-")) {
		return protovalidator.FieldError1("DeleteResources", "the value of field 'space_id' must start with string 'wks-'", this.SpaceId)
	}
	return nil
}

func (this *DeleteResources) _xxx_xxx_Validator_Validate_resource_ids() error {
	if !(len(this.ResourceIds) > 0) {
		return protovalidator.FieldError1("DeleteResources", "the length of field 'resource_ids' must be greater than '0'", strconv.Itoa(len(this.ResourceIds)))
	}
	if !(len(this.ResourceIds) <= 100) {
		return protovalidator.FieldError1("DeleteResources", "the length of field 'resource_ids' must be less than or equal to '100'", strconv.Itoa(len(this.ResourceIds)))
	}
	return nil
}

// Set default value for message request.DeleteResources
func (this *DeleteResources) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_space_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_resource_ids(); err != nil {
		return err
	}
	return nil
}

func (this *RenameFlinkStatePath) _xxx_xxx_Validator_Validate_src_path() error {
	if !(len(this.SrcPath) >= 1) {
		return protovalidator.FieldError1("RenameFlinkStatePath", "the byte length of field 'src_path' must be greater than or equal to '1'", protovalidator.StringByteLenToString(this.SrcPath))
	}
	if !(len(this.SrcPath) <= 100) {
		return protovalidator.FieldError1("RenameFlinkStatePath", "the byte length of field 'src_path' must be less than or equal to '100'", protovalidator.StringByteLenToString(this.SrcPath))
	}
	return nil
}

func (this *RenameFlinkStatePath) _xxx_xxx_Validator_Validate_dst_path() error {
	if !(len(this.DstPath) >= 1) {
		return protovalidator.FieldError1("RenameFlinkStatePath", "the byte length of field 'dst_path' must be greater than or equal to '1'", protovalidator.StringByteLenToString(this.DstPath))
	}
	if !(len(this.DstPath) <= 100) {
		return protovalidator.FieldError1("RenameFlinkStatePath", "the byte length of field 'dst_path' must be less than or equal to '100'", protovalidator.StringByteLenToString(this.DstPath))
	}
	return nil
}

// Set default value for message request.RenameFlinkStatePath
func (this *RenameFlinkStatePath) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_src_path(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_dst_path(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteFlinkState) _xxx_xxx_Validator_Validate_delete_path() error {
	if !(len(this.DeletePath) >= 1) {
		return protovalidator.FieldError1("DeleteFlinkState", "the byte length of field 'delete_path' must be greater than or equal to '1'", protovalidator.StringByteLenToString(this.DeletePath))
	}
	if !(len(this.DeletePath) <= 100) {
		return protovalidator.FieldError1("DeleteFlinkState", "the byte length of field 'delete_path' must be less than or equal to '100'", protovalidator.StringByteLenToString(this.DeletePath))
	}
	return nil
}

// Set default value for message request.DeleteFlinkState
func (this *DeleteFlinkState) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_delete_path(); err != nil {
		return err
	}
	return nil
}