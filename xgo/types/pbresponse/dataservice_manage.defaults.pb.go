// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/response/dataservice_manage.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

// Set default value for message response.ListDataServiceClusters
func (this *ListDataServiceClusters) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CreateDataServiceCluster
func (this *CreateDataServiceCluster) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ListApiGroups
func (this *ListApiGroups) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CreateApiGroup
func (this *CreateApiGroup) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ListCustomerApis
func (this *ListCustomerApis) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeCustomerApi
func (this *DescribeCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	if this.ApiConfig != nil {
		if dt, ok := interface{}(this.ApiConfig).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.CreateCustomerApi
func (this *CreateCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeApiVersion
func (this *DescribeApiVersion) SetDefaults() {
	if this == nil {
		return
	}
	if this.ApiVersion != nil {
		if dt, ok := interface{}(this.ApiVersion).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.ListApiVersions
func (this *ListApiVersions) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.TestCustomerApi
func (this *TestCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	return
}
