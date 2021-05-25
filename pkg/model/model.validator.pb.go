// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: proto/model.proto

package model

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/mwitkow/go-proto-validators"
	github_com_mwitkow_go_proto_validators "github.com/mwitkow/go-proto-validators"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

func (this *EmptyStruct) Validate() error {
	return nil
}
func (this *SpaceInfo) Validate() error {
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
	}
	if !(len(this.Owner) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Owner", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Owner))
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
func (this *FlowInfo) Validate() error {
	if !(len(this.SpaceId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SpaceId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SpaceId))
	}
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
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
	if !(this.Type > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Type", fmt.Errorf(`value '%v' must be greater than '0'`, this.Type))
	}
	if !(this.Created > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Created", fmt.Errorf(`value '%v' must be greater than '0'`, this.Created))
	}
	if !(this.Updated > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Updated", fmt.Errorf(`value '%v' must be greater than '0'`, this.Updated))
	}
	return nil
}
func (this *FlowEnvInfo) Validate() error {
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	return nil
}
func (this *FlowNodeInfo) Validate() error {
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	return nil
}
func (this *FlowSchInfo) Validate() error {
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	if !(this.Started > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Started", fmt.Errorf(`value '%v' must be greater than '0'`, this.Started))
	}
	if !(this.Ended > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Ended", fmt.Errorf(`value '%v' must be greater than '0'`, this.Ended))
	}
	if !(this.Priority > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Priority", fmt.Errorf(`value '%v' must be greater than '0'`, this.Priority))
	}
	if !(this.Priority < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("Priority", fmt.Errorf(`value '%v' must be less than '3'`, this.Priority))
	}
	if !(this.FailureStrategy > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("FailureStrategy", fmt.Errorf(`value '%v' must be greater than '0'`, this.FailureStrategy))
	}
	if !(this.FailureStrategy < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("FailureStrategy", fmt.Errorf(`value '%v' must be less than '3'`, this.FailureStrategy))
	}
	if !(this.DependStrategy > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("DependStrategy", fmt.Errorf(`value '%v' must be greater than '0'`, this.DependStrategy))
	}
	if !(this.DependStrategy < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("DependStrategy", fmt.Errorf(`value '%v' must be less than '3'`, this.DependStrategy))
	}
	if !(this.ScheduleStrategy > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("ScheduleStrategy", fmt.Errorf(`value '%v' must be greater than '0'`, this.ScheduleStrategy))
	}
	if !(this.ScheduleStrategy < 3) {
		return github_com_mwitkow_go_proto_validators.FieldError("ScheduleStrategy", fmt.Errorf(`value '%v' must be less than '3'`, this.ScheduleStrategy))
	}
	if !(this.ScheduleLimit > -1) {
		return github_com_mwitkow_go_proto_validators.FieldError("ScheduleLimit", fmt.Errorf(`value '%v' must be greater than '-1'`, this.ScheduleLimit))
	}
	return nil
}
func (this *FlowMeta) Validate() error {
	if nil == this.Flow {
		return github_com_mwitkow_go_proto_validators.FieldError("Flow", fmt.Errorf("message must exist"))
	}
	if this.Flow != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.Flow); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("Flow", err)
		}
	}
	if nil == this.Node {
		return github_com_mwitkow_go_proto_validators.FieldError("Node", fmt.Errorf("message must exist"))
	}
	if this.Node != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.Node); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("Node", err)
		}
	}
	if nil == this.Env {
		return github_com_mwitkow_go_proto_validators.FieldError("Env", fmt.Errorf("message must exist"))
	}
	if this.Env != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.Env); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("Env", err)
		}
	}
	if nil == this.Schedule {
		return github_com_mwitkow_go_proto_validators.FieldError("Schedule", fmt.Errorf("message must exist"))
	}
	if this.Schedule != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.Schedule); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("Schedule", err)
		}
	}
	return nil
}
func (this *ReleaseLatestInfo) Validate() error {
	if !(len(this.SpaceId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SpaceId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SpaceId))
	}
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
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
	if !(this.Type > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Type", fmt.Errorf(`value '%v' must be greater than '0'`, this.Type))
	}
	if !(len(this.Desc) < 1025) {
		return github_com_mwitkow_go_proto_validators.FieldError("Desc", fmt.Errorf(`value '%v' must have a length smaller than '1025'`, this.Desc))
	}
	if !(this.Created > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Created", fmt.Errorf(`value '%v' must be greater than '0'`, this.Created))
	}
	if !(this.Updated > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Updated", fmt.Errorf(`value '%v' must be greater than '0'`, this.Updated))
	}
	return nil
}
func (this *FlowInstInfo) Validate() error {
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	if !(this.Version > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Version", fmt.Errorf(`value '%v' must be greater than '0'`, this.Version))
	}
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
	}
	if !(this.State > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("State", fmt.Errorf(`value '%v' must be greater than '0'`, this.State))
	}
	if !(this.Created > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Created", fmt.Errorf(`value '%v' must be greater than '0'`, this.Created))
	}
	if !(this.Updated > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Updated", fmt.Errorf(`value '%v' must be greater than '0'`, this.Updated))
	}
	return nil
}
func (this *NodeInstInfo) Validate() error {
	if !(len(this.FlowInstId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowInstId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowInstId))
	}
	if !(len(this.FlowId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("FlowId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.FlowId))
	}
	if !(len(this.NodeId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("NodeId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.NodeId))
	}
	if !(this.Version > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Version", fmt.Errorf(`value '%v' must be greater than '0'`, this.Version))
	}
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
	}
	if !(this.State > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("State", fmt.Errorf(`value '%v' must be greater than '0'`, this.State))
	}
	if !(this.Created > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Created", fmt.Errorf(`value '%v' must be greater than '0'`, this.Created))
	}
	if !(this.Updated > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Updated", fmt.Errorf(`value '%v' must be greater than '0'`, this.Updated))
	}
	return nil
}
func (this *AuditInfo) Validate() error {
	if !(len(this.SpaceId) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SpaceId", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SpaceId))
	}
	if !(len(this.UserId) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("UserId", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.UserId))
	}
	if !(this.OpType > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("OpType", fmt.Errorf(`value '%v' must be greater than '0'`, this.OpType))
	}
	if !(this.Timed > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Timed", fmt.Errorf(`value '%v' must be greater than '0'`, this.Timed))
	}
	return nil
}
