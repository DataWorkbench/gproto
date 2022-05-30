// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/request/apidashboard.proto

package pbrequest

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protovalidator "github.com/yu31/protoc-plugin/xgo/pkg/protovalidator"
	strconv "strconv"
)

func (this *RouteUriRewrite) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("RouteUriRewrite", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

func (this *RouteUriRewrite) _xxx_xxx_Validator_Validate_uri() error {
	if !(len(this.Uri) > 0) {
		return protovalidator.FieldError1("RouteUriRewrite", "the byte length of field 'uri' must be greater than '0'", protovalidator.StringByteLenToString(this.Uri))
	}
	return nil
}

// Set default value for message request.RouteUriRewrite
func (this *RouteUriRewrite) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_uri(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteRoute) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("DeleteRoute", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.DeleteRoute
func (this *DeleteRoute) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListRoutes) _xxx_xxx_Validator_Validate_uri() error {
	if !(len(this.Uri) > 0) {
		return protovalidator.FieldError1("ListRoutes", "the byte length of field 'uri' must be greater than '0'", protovalidator.StringByteLenToString(this.Uri))
	}
	return nil
}

func (this *ListRoutes) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListRoutes", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListRoutes", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListRoutes) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListRoutes", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListRoutes_In_SortBy = map[string]bool{"": true, "id": true, "name": true, "create_time": true, "update_time": true}

func (this *ListRoutes) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListRoutes_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListRoutes", "the value of field 'sort_by' must be one of '[ id name create_time update_time]'", this.SortBy)
	}
	return nil
}

func (this *ListRoutes) _xxx_xxx_Validator_Validate_ids() error {
	if !(len(this.Ids) >= 0) {
		return protovalidator.FieldError1("ListRoutes", "the length of field 'ids' must be greater than or equal to '0'", strconv.Itoa(len(this.Ids)))
	}
	if !(len(this.Ids) <= 100) {
		return protovalidator.FieldError1("ListRoutes", "the length of field 'ids' must be less than or equal to '100'", strconv.Itoa(len(this.Ids)))
	}
	return nil
}

// Set default value for message request.ListRoutes
func (this *ListRoutes) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_uri(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_ids(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteUpstream) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("DeleteUpstream", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.DeleteUpstream
func (this *DeleteUpstream) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListUpstreams) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListUpstreams", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListUpstreams", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListUpstreams) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListUpstreams", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListUpstreams_In_SortBy = map[string]bool{"": true, "id": true, "name": true, "create_time": true, "update_time": true}

func (this *ListUpstreams) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListUpstreams_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListUpstreams", "the value of field 'sort_by' must be one of '[ id name create_time update_time]'", this.SortBy)
	}
	return nil
}

func (this *ListUpstreams) _xxx_xxx_Validator_Validate_ids() error {
	if !(len(this.Ids) >= 0) {
		return protovalidator.FieldError1("ListUpstreams", "the length of field 'ids' must be greater than or equal to '0'", strconv.Itoa(len(this.Ids)))
	}
	if !(len(this.Ids) <= 100) {
		return protovalidator.FieldError1("ListUpstreams", "the length of field 'ids' must be less than or equal to '100'", strconv.Itoa(len(this.Ids)))
	}
	return nil
}

// Set default value for message request.ListUpstreams
func (this *ListUpstreams) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_ids(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteSSL) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("DeleteSSL", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.DeleteSSL
func (this *DeleteSSL) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListSSLs) _xxx_xxx_Validator_Validate_ids() error {
	if !(len(this.Ids) >= 0) {
		return protovalidator.FieldError1("ListSSLs", "the length of field 'ids' must be greater than or equal to '0'", strconv.Itoa(len(this.Ids)))
	}
	if !(len(this.Ids) <= 100) {
		return protovalidator.FieldError1("ListSSLs", "the length of field 'ids' must be less than or equal to '100'", strconv.Itoa(len(this.Ids)))
	}
	return nil
}

func (this *ListSSLs) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListSSLs", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListSSLs", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListSSLs) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListSSLs", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListSSLs_In_SortBy = map[string]bool{"": true, "id": true, "create_time": true, "update_time": true}

func (this *ListSSLs) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListSSLs_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListSSLs", "the value of field 'sort_by' must be one of '[ id create_time update_time]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListSSLs
func (this *ListSSLs) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_ids(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *CreateApiService) _xxx_xxx_Validator_Validate_user_id() error {
	if !(len(this.UserId) > 0) {
		return protovalidator.FieldError1("CreateApiService", "the byte length of field 'user_id' must be greater than '0'", protovalidator.StringByteLenToString(this.UserId))
	}
	return nil
}

// Set default value for message request.CreateApiService
func (this *CreateApiService) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_user_id(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteApiService) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("DeleteApiService", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.DeleteApiService
func (this *DeleteApiService) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateApiService) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("UpdateApiService", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.UpdateApiService
func (this *UpdateApiService) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListApiServices) _xxx_xxx_Validator_Validate_ids() error {
	if !(len(this.Ids) >= 0) {
		return protovalidator.FieldError1("ListApiServices", "the length of field 'ids' must be greater than or equal to '0'", strconv.Itoa(len(this.Ids)))
	}
	if !(len(this.Ids) <= 100) {
		return protovalidator.FieldError1("ListApiServices", "the length of field 'ids' must be less than or equal to '100'", strconv.Itoa(len(this.Ids)))
	}
	return nil
}

func (this *ListApiServices) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListApiServices", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListApiServices", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListApiServices) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListApiServices", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListApiServices_In_SortBy = map[string]bool{"": true, "id": true, "create_time": true, "update_time": true}

func (this *ListApiServices) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListApiServices_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListApiServices", "the value of field 'sort_by' must be one of '[ id create_time update_time]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListApiServices
func (this *ListApiServices) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_ids(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *AddSvcReqCount) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("AddSvcReqCount", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

func (this *AddSvcReqCount) _xxx_xxx_Validator_Validate_count() error {
	if !(this.Count > 0) {
		return protovalidator.FieldError1("AddSvcReqCount", "the value of field 'count' must be greater than '0'", protovalidator.Int32ToString(this.Count))
	}
	return nil
}

// Set default value for message request.AddSvcReqCount
func (this *AddSvcReqCount) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_count(); err != nil {
		return err
	}
	return nil
}

func (this *GetSvcReqCount) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("GetSvcReqCount", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.GetSvcReqCount
func (this *GetSvcReqCount) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *CreateAuthKey) _xxx_xxx_Validator_Validate_secret_key() error {
	if !(len(this.SecretKey) > 0) {
		return protovalidator.FieldError1("CreateAuthKey", "the byte length of field 'secret_key' must be greater than '0'", protovalidator.StringByteLenToString(this.SecretKey))
	}
	return nil
}

// Set default value for message request.CreateAuthKey
func (this *CreateAuthKey) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_secret_key(); err != nil {
		return err
	}
	return nil
}

func (this *DeleteAuthKey) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("DeleteAuthKey", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.DeleteAuthKey
func (this *DeleteAuthKey) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *UpdateAuthKey) _xxx_xxx_Validator_Validate_id() error {
	if !(len(this.Id) > 0) {
		return protovalidator.FieldError1("UpdateAuthKey", "the byte length of field 'id' must be greater than '0'", protovalidator.StringByteLenToString(this.Id))
	}
	return nil
}

// Set default value for message request.UpdateAuthKey
func (this *UpdateAuthKey) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_id(); err != nil {
		return err
	}
	return nil
}

func (this *ListAuthKeys) _xxx_xxx_Validator_Validate_ids() error {
	if !(len(this.Ids) >= 0) {
		return protovalidator.FieldError1("ListAuthKeys", "the length of field 'ids' must be greater than or equal to '0'", strconv.Itoa(len(this.Ids)))
	}
	if !(len(this.Ids) <= 100) {
		return protovalidator.FieldError1("ListAuthKeys", "the length of field 'ids' must be less than or equal to '100'", strconv.Itoa(len(this.Ids)))
	}
	return nil
}

func (this *ListAuthKeys) _xxx_xxx_Validator_Validate_limit() error {
	if !(this.Limit > 0) {
		return protovalidator.FieldError1("ListAuthKeys", "the value of field 'limit' must be greater than '0'", protovalidator.Int32ToString(this.Limit))
	}
	if !(this.Limit <= 100) {
		return protovalidator.FieldError1("ListAuthKeys", "the value of field 'limit' must be less than or equal to '100'", protovalidator.Int32ToString(this.Limit))
	}
	return nil
}

func (this *ListAuthKeys) _xxx_xxx_Validator_Validate_offset() error {
	if !(this.Offset >= 0) {
		return protovalidator.FieldError1("ListAuthKeys", "the value of field 'offset' must be greater than or equal to '0'", protovalidator.Int32ToString(this.Offset))
	}
	return nil
}

var _xxx_xxx_Validator_ListAuthKeys_In_SortBy = map[string]bool{"": true, "id": true, "create_time": true, "update_time": true}

func (this *ListAuthKeys) _xxx_xxx_Validator_Validate_sort_by() error {
	if !(_xxx_xxx_Validator_ListAuthKeys_In_SortBy[this.SortBy]) {
		return protovalidator.FieldError1("ListAuthKeys", "the value of field 'sort_by' must be one of '[ id create_time update_time]'", this.SortBy)
	}
	return nil
}

// Set default value for message request.ListAuthKeys
func (this *ListAuthKeys) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_ids(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_limit(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_offset(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_sort_by(); err != nil {
		return err
	}
	return nil
}

func (this *BindAuthKey) _xxx_xxx_Validator_Validate_auth_key_id() error {
	if !(len(this.AuthKeyId) > 0) {
		return protovalidator.FieldError1("BindAuthKey", "the byte length of field 'auth_key_id' must be greater than '0'", protovalidator.StringByteLenToString(this.AuthKeyId))
	}
	return nil
}

func (this *BindAuthKey) _xxx_xxx_Validator_Validate_api_service_id() error {
	if !(len(this.ApiServiceId) > 0) {
		return protovalidator.FieldError1("BindAuthKey", "the byte length of field 'api_service_id' must be greater than '0'", protovalidator.StringByteLenToString(this.ApiServiceId))
	}
	return nil
}

// Set default value for message request.BindAuthKey
func (this *BindAuthKey) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_auth_key_id(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_api_service_id(); err != nil {
		return err
	}
	return nil
}

func (this *UnbindAuthKey) _xxx_xxx_Validator_Validate_api_service_id() error {
	if !(len(this.ApiServiceId) > 0) {
		return protovalidator.FieldError1("UnbindAuthKey", "the byte length of field 'api_service_id' must be greater than '0'", protovalidator.StringByteLenToString(this.ApiServiceId))
	}
	return nil
}

// Set default value for message request.UnbindAuthKey
func (this *UnbindAuthKey) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_api_service_id(); err != nil {
		return err
	}
	return nil
}
