// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/request/dataservice_manage.proto

package pbrequest

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message request.ListDataServiceClusters
func (this *ListDataServiceClusters) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.DescribeDataServiceCluster
func (this *DescribeDataServiceCluster) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.UpdateDataServiceCluster
func (this *UpdateDataServiceCluster) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.CreateDataServiceCluster
func (this *CreateDataServiceCluster) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteDataServiceClusters
func (this *DeleteDataServiceClusters) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ListApiGroups
func (this *ListApiGroups) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.CreateApiGroup
func (this *CreateApiGroup) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteApiGroups
func (this *DeleteApiGroups) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ListCustomerApis
func (this *ListCustomerApis) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.UpdateCustomerApi
func (this *UpdateCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	if this.WizardDetails != nil {
		if dt, ok := interface{}(this.WizardDetails).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.DescribeCustomerApi
func (this *DescribeCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.DeleteCustomerApis
func (this *DeleteCustomerApis) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.CreateCustomerApi
func (this *CreateCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	if this.WizardDetails != nil {
		if dt, ok := interface{}(this.WizardDetails).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message request.WizardDetails
func (this *WizardDetails) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.WizardRequestParameters
func (this *WizardRequestParameters) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.WizardResponseParameters
func (this *WizardResponseParameters) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.ListApiVersions
func (this *ListApiVersions) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.ListPublishedApis
func (this *ListPublishedApis) SetDefaults() {
	if this == nil {
		return
	}
	if this.Limit == 0 {
		this.Limit = 100
	}
	return
}

// Set default value for message request.DescribeApiVersion
func (this *DescribeApiVersion) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.PublishCustomerApi
func (this *PublishCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.AbolishCustomerApis
func (this *AbolishCustomerApis) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message request.TestCustomerApi
func (this *TestCustomerApi) SetDefaults() {
	if this == nil {
		return
	}
	return
}
