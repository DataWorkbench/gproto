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

// Set default value for message response.DescribeDataServiceCluster
func (this *DescribeDataServiceCluster) SetDefaults() {
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

// Set default value for message response.ListApiConfigs
func (this *ListApiConfigs) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeApiConfig
func (this *DescribeApiConfig) SetDefaults() {
	if this == nil {
		return
	}
	if this.ApiConfig != nil {
		if dt, ok := interface{}(this.ApiConfig).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.ApiGroup != nil {
		if dt, ok := interface{}(this.ApiGroup).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.DataSource != nil {
		if dt, ok := interface{}(this.DataSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.ServiceCluster != nil {
		if dt, ok := interface{}(this.ServiceCluster).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.CreateApiConfig
func (this *CreateApiConfig) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeDataServiceApiVersion
func (this *DescribeDataServiceApiVersion) SetDefaults() {
	if this == nil {
		return
	}
	if this.ApiConfig != nil {
		if dt, ok := interface{}(this.ApiConfig).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.ApiGroup != nil {
		if dt, ok := interface{}(this.ApiGroup).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.DataSource != nil {
		if dt, ok := interface{}(this.DataSource).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.ServiceCluster != nil {
		if dt, ok := interface{}(this.ServiceCluster).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.ListDataServiceApiVersions
func (this *ListDataServiceApiVersions) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ListPublishedApiVersionsByClusterId
func (this *ListPublishedApiVersionsByClusterId) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.ApiVersionGroupInfo
func (this *ApiVersionGroupInfo) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.TestDataServiceApi
func (this *TestDataServiceApi) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribePublishedApiHttpDetails
func (this *DescribePublishedApiHttpDetails) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeServiceDataSourceKinds
func (this *DescribeServiceDataSourceKinds) SetDefaults() {
	if this == nil {
		return
	}
	return
}
