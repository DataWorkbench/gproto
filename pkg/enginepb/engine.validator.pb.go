// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: proto/engine.proto

package enginepb

import (
	fmt "fmt"
	_ "github.com/DataWorkbench/gproto/pkg/model"
	_ "github.com/mwitkow/go-proto-validators"
	github_com_mwitkow_go_proto_validators "github.com/mwitkow/go-proto-validators"
	proto "google.golang.org/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

func (this *FlinkEngine) Validate() error {
	if this.HbaseConf != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.HbaseConf); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("HbaseConf", err)
		}
	}
	if this.FlinkConf != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.FlinkConf); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("FlinkConf", err)
		}
	}
	return nil
}
func (this *CreateFlinkRequest) Validate() error {
	if this.Name == "" {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must not be an empty string`, this.Name))
	}
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.Name))
	}
	if !(len(this.Namespace) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Namespace", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Namespace))
	}
	if !(len(this.Namespace) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("Namespace", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.Namespace))
	}
	if this.Conf != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.Conf); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("Conf", err)
		}
	}
	return nil
}
func (this *CreateFlinkResponse) Validate() error {
	return nil
}
func (this *DeleteFlinkRequest) Validate() error {
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.Name))
	}
	return nil
}
func (this *DeleteFlinkResponse) Validate() error {
	return nil
}
func (this *DescribeFlinkRequest) Validate() error {
	if !(len(this.Name) > 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '1'`, this.Name))
	}
	if !(len(this.Name) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.Name))
	}
	return nil
}
func (this *DescribeFlinkResponse) Validate() error {
	if this.Engine != nil {
		if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(this.Engine); err != nil {
			return github_com_mwitkow_go_proto_validators.FieldError("Engine", err)
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
