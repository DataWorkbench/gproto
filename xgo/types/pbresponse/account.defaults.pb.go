// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.2
// source: proto/types/response/account.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
)

// Set default value for message response.DescribeAccessKey
func (this *DescribeAccessKey) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.DescribeUsers
func (this *DescribeUsers) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CreateUser
func (this *CreateUser) SetDefaults() {
	if this == nil {
		return
	}
	if this.User != nil {
		if dt, ok := interface{}(this.User).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.UpdateUser
func (this *UpdateUser) SetDefaults() {
	if this == nil {
		return
	}
	if this.User != nil {
		if dt, ok := interface{}(this.User).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.DeleteUser
func (this *DeleteUser) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CheckSession
func (this *CheckSession) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CreateSession
func (this *CreateSession) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.GetUserRole
func (this *GetUserRole) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CheckUserExists
func (this *CheckUserExists) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message response.CreateNotification
func (this *CreateNotification) SetDefaults() {
	if this == nil {
		return
	}
	if this.Notification != nil {
		if dt, ok := interface{}(this.Notification).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.UpdateNotification
func (this *UpdateNotification) SetDefaults() {
	if this == nil {
		return
	}
	if this.Notification != nil {
		if dt, ok := interface{}(this.Notification).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.DeleteNotification
func (this *DeleteNotification) SetDefaults() {
	if this == nil {
		return
	}
	if this.Notification != nil {
		if dt, ok := interface{}(this.Notification).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message response.GetNotifications
func (this *GetNotifications) SetDefaults() {
	if this == nil {
		return
	}
	return
}
