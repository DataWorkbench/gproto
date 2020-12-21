// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: proto/node.proto

package wnpb

import (
	fmt "fmt"
	math "math"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/DataWorkbench/gproto/pkg/types"
	_ "github.com/mwitkow/go-proto-validators"
	github_com_mwitkow_go_proto_validators "github.com/mwitkow/go-proto-validators"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

func (this *Info) Validate() error {
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 129) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '129'`, this.Name))
	}
	if !(len(this.Desc) < 1025) {
		return github_com_mwitkow_go_proto_validators.FieldError("Desc", fmt.Errorf(`value '%v' must have a length smaller than '1025'`, this.Desc))
	}
	if !(this.Status > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be greater than '0'`, this.Status))
	}
	if !(this.Status < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be less than '3'`, this.Status))
	}
	if !(this.Created > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Created", fmt.Errorf(`value '%v' must be greater than '0'`, this.Created))
	}
	if !(this.Updated > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Updated", fmt.Errorf(`value '%v' must be greater than '0'`, this.Updated))
	}
	return nil
}
func (this *VersionInfo) Validate() error {
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	if !(this.Version > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Version", fmt.Errorf(`value '%v' must be greater than '0'`, this.Version))
	}
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 129) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '129'`, this.Name))
	}
	if !(len(this.Desc) < 1025) {
		return github_com_mwitkow_go_proto_validators.FieldError("Desc", fmt.Errorf(`value '%v' must have a length smaller than '1025'`, this.Desc))
	}
	if !(this.Status > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be greater than '0'`, this.Status))
	}
	if !(this.Status < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be less than '3'`, this.Status))
	}
	if !(this.Created > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Created", fmt.Errorf(`value '%v' must be greater than '0'`, this.Created))
	}
	if !(this.Updated > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Updated", fmt.Errorf(`value '%v' must be greater than '0'`, this.Updated))
	}
	return nil
}
func (this *ListVersionsRequest) Validate() error {
	if !(len(this.NodeId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("NodeId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.NodeId))
	}
	if !(this.Limit > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be greater than '0'`, this.Limit))
	}
	if !(this.Limit < 101) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be less than '101'`, this.Limit))
	}
	if !(this.Offset > -1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Offset", fmt.Errorf(`value '%v' must be greater than '-1'`, this.Offset))
	}
	return nil
}
func (this *ListVersionsReply) Validate() error {
	for _, item := range this.Infos {
		if item != nil {
			if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(item); err != nil {
				return github_com_mwitkow_go_proto_validators.FieldError("Infos", err)
			}
		}
	}
	return nil
}
func (this *CreateRequest) Validate() error {
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 129) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '129'`, this.Name))
	}
	if !(len(this.Desc) < 1025) {
		return github_com_mwitkow_go_proto_validators.FieldError("Desc", fmt.Errorf(`value '%v' must have a length smaller than '1025'`, this.Desc))
	}
	if !(this.Status > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be greater than '0'`, this.Status))
	}
	if !(this.Status < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be less than '3'`, this.Status))
	}
	return nil
}
func (this *DeleteRequest) Validate() error {
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	return nil
}
func (this *UpdateRequest) Validate() error {
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	if !(len(this.Name) < 129) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '129'`, this.Name))
	}
	if !(len(this.Desc) < 1025) {
		return github_com_mwitkow_go_proto_validators.FieldError("Desc", fmt.Errorf(`value '%v' must have a length smaller than '1025'`, this.Desc))
	}
	if !(this.Status > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be greater than '0'`, this.Status))
	}
	if !(this.Status < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("Status", fmt.Errorf(`value '%v' must be less than '3'`, this.Status))
	}
	return nil
}
func (this *DescribeRequest) Validate() error {
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	return nil
}
func (this *DescribeReply) Validate() error {
	if this.Info != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.Info); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("Info", err)
		}
	}
	return nil
}
