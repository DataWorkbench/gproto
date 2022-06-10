// Code generated by protoc-gen-govalidator. DO NOT EDIT.
// versions:
// 		protoc-gen-govalidator 0.0.1
// source: proto/types/response/dataservice_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

func (this *ListDataServiceClusters) _xxx_xxx_Validator_Validate_infos() error {
	for _, item := range this.Infos {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.ListDataServiceClusters
func (this *ListDataServiceClusters) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.CreateDataServiceCluster
func (this *CreateDataServiceCluster) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *ListApiGroups) _xxx_xxx_Validator_Validate_infos() error {
	for _, item := range this.Infos {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.ListApiGroups
func (this *ListApiGroups) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.CreateApiGroup
func (this *CreateApiGroup) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *ListCustomerApis) _xxx_xxx_Validator_Validate_infos() error {
	for _, item := range this.Infos {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.ListCustomerApis
func (this *ListCustomerApis) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

func (this *DescribeCustomerApi) _xxx_xxx_Validator_Validate_api_config() error {
	if dt, ok := interface{}(this.ApiConfig).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DescribeCustomerApi) _xxx_xxx_Validator_Validate_request_params() error {
	for _, item := range this.RequestParams {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *DescribeCustomerApi) _xxx_xxx_Validator_Validate_response_params() error {
	for _, item := range this.ResponseParams {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.DescribeCustomerApi
func (this *DescribeCustomerApi) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_api_config(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_request_params(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_response_params(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.CreateCustomerApi
func (this *CreateCustomerApi) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}

func (this *DescribeApiVersion) _xxx_xxx_Validator_Validate_api_version() error {
	if dt, ok := interface{}(this.ApiVersion).(interface{ Validate() error }); ok {
		if err := dt.Validate(); err != nil {
			return err
		}
	}
	return nil
}

func (this *DescribeApiVersion) _xxx_xxx_Validator_Validate_request_params() error {
	for _, item := range this.RequestParams {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

func (this *DescribeApiVersion) _xxx_xxx_Validator_Validate_response_params() error {
	for _, item := range this.ResponseParams {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.DescribeApiVersion
func (this *DescribeApiVersion) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_api_version(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_request_params(); err != nil {
		return err
	}
	if err := this._xxx_xxx_Validator_Validate_response_params(); err != nil {
		return err
	}
	return nil
}

func (this *ListApiVersions) _xxx_xxx_Validator_Validate_infos() error {
	for _, item := range this.Infos {
		_ = item // To avoid unused panics.
		if dt, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := dt.Validate(); err != nil {
				return err
			}
		}
	}
	return nil
}

// Set default value for message response.ListApiVersions
func (this *ListApiVersions) Validate() error {
	if this == nil {
		return nil
	}
	if err := this._xxx_xxx_Validator_Validate_infos(); err != nil {
		return err
	}
	return nil
}

// Set default value for message response.TestCustomerApi
func (this *TestCustomerApi) Validate() error {
	if this == nil {
		return nil
	}
	return nil
}
