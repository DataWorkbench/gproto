// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: proto/engine.proto

package enginepb

import (
	fmt "fmt"
	_ "github.com/mwitkow/go-proto-validators"
	github_com_mwitkow_go_proto_validators "github.com/mwitkow/go-proto-validators"
	proto "google.golang.org/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

func (this *Engine) Validate() error {
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
	}
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 128) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '128'`, this.Name))
	}
	if !(len(this.Owner) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Owner", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Owner))
	}
	return nil
}
func (this *EngineInBuildInfo) Validate() error {
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
	}
	return nil
}
func (this *CreateRequest) Validate() error {
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 128) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '128'`, this.Name))
	}
	if !(len(this.Owner) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Owner", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Owner))
	}
	return nil
}
func (this *CreateResponse) Validate() error {
	return nil
}
func (this *DescribeRequest) Validate() error {
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
	}
	if this.Owner == "" {
		return github_com_mwitkow_go_proto_validators.FieldError("Owner", fmt.Errorf(`value '%v' must not be an empty string`, this.Owner))
	}
	if !(this.Limit > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be greater than '0'`, this.Limit))
	}
	if !(this.Limit < 101) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be less than '101'`, this.Limit))
	}
	return nil
}
func (this *DescribeResponse) Validate() error {
	for _, item := range this.Engines {
		if item != nil {
			if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(item); err != nil {
				return github_com_mwitkow_go_proto_validators.FieldError("Engines", err)
			}
		}
	}
	return nil
}
func (this *RegisterRequest) Validate() error {
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 128) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '128'`, this.Name))
	}
	if !(len(this.Owner) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Owner", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Owner))
	}
	return nil
}
func (this *RegisterResponse) Validate() error {
	return nil
}
func (this *DeregisterRequest) Validate() error {
	if !(len(this.Id) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Id))
	}
	if !(len(this.Id) < 128) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length smaller than '128'`, this.Id))
	}
	return nil
}
func (this *DeregisterResponse) Validate() error {
	return nil
}
func (this *ModifyRequest) Validate() error {
	if !(len(this.Id) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.Id))
	}
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 128) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '128'`, this.Name))
	}
	return nil
}
func (this *ModifyResponse) Validate() error {
	return nil
}
func (this *DeleteRequest) Validate() error {
	for _, item := range this.Id {
		if !(len(item) == 20) {
			return github_com_mwitkow_go_proto_validators.FieldError("Id", fmt.Errorf(`value '%v' must have a length equal to '20'`, item))
		}
	}
	return nil
}
func (this *DeleteResponse) Validate() error {
	return nil
}
