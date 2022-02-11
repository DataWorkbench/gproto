// Code generated by protoc-gen-godefaults. DO NOT EDIT.
// versions:
// 		protoc-gen-godefaults 0.0.1
// source: proto/types/model/flink/flink_config.proto

package pbflink

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
)

// Set default value for message flink.FlinkConfig
func (this *FlinkConfig) SetDefaults() {
	if this == nil {
		return
	}
	if this.RestartStrategy != nil {
		if dt, ok := interface{}(this.RestartStrategy).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	if this.Logger != nil {
		if dt, ok := interface{}(this.Logger).(interface{ SetDefaults() }); ok {
			dt.SetDefaults()
		}
	}
	return
}

// Set default value for message flink.FlinkConfig.Item
func (this *FlinkConfig_Item) SetDefaults() {
	if this == nil {
		return
	}
	return
}

// Set default value for message flink.FlinkConfig.RestartStrategy
func (this *FlinkConfig_RestartStrategy) SetDefaults() {
	if this == nil {
		return
	}
	if this.FixedDelayAttempts == 0 {
		this.FixedDelayAttempts = 1
	}
	if this.FixedDelayDelay == 0 {
		this.FixedDelayDelay = 1
	}
	if this.FailureRateMaxFailuresPerInterval == 0 {
		this.FailureRateMaxFailuresPerInterval = 1
	}
	if this.FailureRateDelay == 0 {
		this.FailureRateDelay = 1
	}
	if this.FailureRateFailureRateInterval == 0 {
		this.FailureRateFailureRateInterval = 3
	}
	return
}

// Set default value for message flink.FlinkConfig.Logger
func (this *FlinkConfig_Logger) SetDefaults() {
	if this == nil {
		return
	}
	if this.RootLogLevel == "" {
		this.RootLogLevel = "INFO"
	}
	return
}