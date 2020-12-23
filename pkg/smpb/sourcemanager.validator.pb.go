// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: proto/sourcemanager.proto

package smpb

import (
	fmt "fmt"
	math "math"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/mwitkow/go-proto-validators"
	github_com_mwitkow_go_proto_validators "github.com/mwitkow/go-proto-validators"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

func (this *EngingMapRequest) Validate() error {
	if !(len(this.EngineType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.EngineType))
	}
	if !(len(this.EngineType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.EngineType))
	}
	return nil
}
func (this *EngineMapReply) Validate() error {
	if !(len(this.EngineType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.EngineType))
	}
	if !(len(this.EngineType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.EngineType))
	}
	if !(len(this.SourceType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.SourceType))
	}
	if !(len(this.SourceType) < 257) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length smaller than '257'`, this.SourceType))
	}
	return nil
}
func (this *InfoReply) Validate() error {
	if !(len(this.ID) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.ID))
	}
	if !(len(this.SpaceID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SpaceID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SpaceID))
	}
	if !(len(this.SourceType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.SourceType))
	}
	if !(len(this.SourceType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.SourceType))
	}
	if !(len(this.Name) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Name))
	}
	if !(len(this.Name) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Name))
	}
	if !(len(this.Comment) < 257) {
		return github_com_mwitkow_go_proto_validators.FieldError("Comment", fmt.Errorf(`value '%v' must have a length smaller than '257'`, this.Comment))
	}
	if !(len(this.Creator) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Creator", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Creator))
	}
	if !(len(this.Creator) < 17) {
		return github_com_mwitkow_go_proto_validators.FieldError("Creator", fmt.Errorf(`value '%v' must have a length smaller than '17'`, this.Creator))
	}
	if !(len(this.Url) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Url))
	}
	if !(len(this.Url) < 2001) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length smaller than '2001'`, this.Url))
	}
	if !(len(this.CreateTime) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("CreateTime", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.CreateTime))
	}
	if !(len(this.UpdateTime) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("UpdateTime", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.UpdateTime))
	}
	if !(len(this.EngineType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.EngineType))
	}
	if !(len(this.EngineType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.EngineType))
	}
	return nil
}
func (this *CreateRequest) Validate() error {
	if !(len(this.ID) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.ID))
	}
	if !(len(this.SpaceID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SpaceID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SpaceID))
	}
	if !(len(this.SourceType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.SourceType))
	}
	if !(len(this.SourceType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.SourceType))
	}
	if !(len(this.Name) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Name))
	}
	if !(len(this.Name) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Name))
	}
	if !(len(this.Comment) < 257) {
		return github_com_mwitkow_go_proto_validators.FieldError("Comment", fmt.Errorf(`value '%v' must have a length smaller than '257'`, this.Comment))
	}
	if !(len(this.Creator) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Creator", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Creator))
	}
	if !(len(this.Creator) < 17) {
		return github_com_mwitkow_go_proto_validators.FieldError("Creator", fmt.Errorf(`value '%v' must have a length smaller than '17'`, this.Creator))
	}
	if !(len(this.Url) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Url))
	}
	if !(len(this.Url) < 2001) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length smaller than '2001'`, this.Url))
	}
	if !(len(this.EngineType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.EngineType))
	}
	if !(len(this.EngineType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.EngineType))
	}
	return nil
}
func (this *UpdateRequest) Validate() error {
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	if !(len(this.SourceType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.SourceType))
	}
	if !(len(this.SourceType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.SourceType))
	}
	if !(len(this.Name) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Name))
	}
	if !(len(this.Name) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Name))
	}
	if !(len(this.Comment) < 257) {
		return github_com_mwitkow_go_proto_validators.FieldError("Comment", fmt.Errorf(`value '%v' must have a length smaller than '257'`, this.Comment))
	}
	if !(len(this.Url) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Url))
	}
	if !(len(this.Url) < 2001) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length smaller than '2001'`, this.Url))
	}
	return nil
}
func (this *DeleteRequest) Validate() error {
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	return nil
}
func (this *EmptyReply) Validate() error {
	return nil
}
func (this *ListsRequest) Validate() error {
	if !(this.Limit > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be greater than '0'`, this.Limit))
	}
	if !(this.Limit < 101) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be less than '101'`, this.Limit))
	}
	return nil
}
func (this *ListsReply) Validate() error {
	for _, item := range this.Infos {
		if item != nil {
			if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(item); err != nil {
				return github_com_mwitkow_go_proto_validators.FieldError("Infos", err)
			}
		}
	}
	return nil
}
func (this *DescribeRequest) Validate() error {
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	return nil
}
func (this *PingSourceRequest) Validate() error {
	if !(len(this.SourceType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.SourceType))
	}
	if !(len(this.SourceType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.SourceType))
	}
	if !(len(this.Url) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Url))
	}
	if !(len(this.Url) < 2001) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length smaller than '2001'`, this.Url))
	}
	if !(len(this.EngineType) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.EngineType))
	}
	if !(len(this.EngineType) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("EngineType", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.EngineType))
	}
	return nil
}
func (this *SotInfoReply) Validate() error {
	if !(len(this.ID) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.ID))
	}
	if !(len(this.SourceID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SourceID))
	}
	if !(len(this.TabType) == 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("TabType", fmt.Errorf(`value '%v' must have a length equal to '1'`, this.TabType))
	}
	if !(len(this.Name) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Name))
	}
	if !(len(this.Name) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Name))
	}
	if !(len(this.Comment) < 257) {
		return github_com_mwitkow_go_proto_validators.FieldError("Comment", fmt.Errorf(`value '%v' must have a length smaller than '257'`, this.Comment))
	}
	if !(len(this.Url) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Url))
	}
	if !(len(this.Url) < 2001) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length smaller than '2001'`, this.Url))
	}
	if !(len(this.CreateTime) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("CreateTime", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.CreateTime))
	}
	if !(len(this.UpdateTime) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("UpdateTime", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.UpdateTime))
	}
	return nil
}
func (this *SotCreateRequest) Validate() error {
	if !(len(this.ID) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.ID))
	}
	if !(len(this.SourceID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SourceID))
	}
	if !(len(this.Name) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Name))
	}
	if !(len(this.Name) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Name))
	}
	if !(len(this.Comment) < 257) {
		return github_com_mwitkow_go_proto_validators.FieldError("Comment", fmt.Errorf(`value '%v' must have a length smaller than '257'`, this.Comment))
	}
	if !(len(this.Url) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Url))
	}
	if !(len(this.Url) < 2001) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length smaller than '2001'`, this.Url))
	}
	if !(len(this.TabType) == 1) {
		return github_com_mwitkow_go_proto_validators.FieldError("TabType", fmt.Errorf(`value '%v' must have a length equal to '1'`, this.TabType))
	}
	return nil
}
func (this *SotUpdateRequest) Validate() error {
	if !(len(this.ID) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.ID))
	}
	if !(len(this.Name) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Name))
	}
	if !(len(this.Name) < 65) {
		return github_com_mwitkow_go_proto_validators.FieldError("Name", fmt.Errorf(`value '%v' must have a length smaller than '65'`, this.Name))
	}
	if !(len(this.Comment) < 257) {
		return github_com_mwitkow_go_proto_validators.FieldError("Comment", fmt.Errorf(`value '%v' must have a length smaller than '257'`, this.Comment))
	}
	if !(len(this.Url) > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length greater than '0'`, this.Url))
	}
	if !(len(this.Url) < 2001) {
		return github_com_mwitkow_go_proto_validators.FieldError("Url", fmt.Errorf(`value '%v' must have a length smaller than '2001'`, this.Url))
	}
	return nil
}
func (this *SotDeleteRequest) Validate() error {
	if !(len(this.ID) < 21) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length smaller than '21'`, this.ID))
	}
	return nil
}
func (this *SotListsReply) Validate() error {
	for _, item := range this.Infos {
		if item != nil {
			if err := github_com_mwitkow_go_proto_validators.CallValidatorIfExists(item); err != nil {
				return github_com_mwitkow_go_proto_validators.FieldError("Infos", err)
			}
		}
	}
	return nil
}
func (this *SotListsRequest) Validate() error {
	if !(len(this.SourceID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("SourceID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.SourceID))
	}
	if !(this.Limit > 0) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be greater than '0'`, this.Limit))
	}
	if !(this.Limit < 101) {
		return github_com_mwitkow_go_proto_validators.FieldError("Limit", fmt.Errorf(`value '%v' must be less than '101'`, this.Limit))
	}
	return nil
}
func (this *SotDescribeRequest) Validate() error {
	if !(len(this.ID) == 20) {
		return github_com_mwitkow_go_proto_validators.FieldError("ID", fmt.Errorf(`value '%v' must have a length equal to '20'`, this.ID))
	}
	return nil
}