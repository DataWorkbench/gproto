# 项目结构和设计思路

## 项目结构
```
- docs: 文档
- scripts: 维护项目用的脚本. 一般是通过 make 调用.
- pkg: 生成 Golang 代码的目标目录. 勿手动修改.
- src:
    - main/java: 生成 Java 代码的目标目录. 勿手动修改.
    - python: 保留. 生成 Python 代码的目标目录. 勿手动修改.
- proto: protobuf 代码的根目录.
    - service: 定义 rpc 接口的代码
    - types: 定义数据结构的代码.
```

## proto 结构和规则
```
- service: 所有 rpc 接口的定义都放在 service 下, 这个目录下只定义 rpc 接口, 不要定义任何数据结构(包括 request 和 response 的参数);
- types: 所有数据结构的定义都在 types 下, 同样, 这个目录下只定义数据结构. 
```

### service 结构和规则
#### 目录结构和命名规则
``` 
- 每个服务(实际部署运行的) 创建一个单独的目录, 目录名与服务名相同. 如 spacemanager. account.
- 一个服务(目录)下可以包含多个 RPC Service. 
- 每个 RPC Service 都定义在一个单独的 proto 文件中. 即每个 prot 文件中只包含一个 RPC Service.
```

#### proto 文件结构和命名规则
``` 
- 文件名需与 RPC Service 名字相同, 但采用 `小写下划线命名` 风格)
```

#### RPC Service 定义和命名规则
```
- 每个 RPC service 代表一个功能模块.
- RPC Service 采用 `大驼峰` 风格的命名.
- Service 名应能表达出其用途. 如 SpaceManage, EngineMange.
```

#### 命名空间
``` 
- 所有 `go_package` 模块路径都在 `github.com/DataWorkbench/gproto/pkg/service/*` 下.
- 所有 `java_package` 模块路径都在 `com.dataomnis.gproto.service.*` 下.
```

#### package 命名规则
``` 
- `package` 名称与目录名相同. 一个服务目录下的所有文件的 `package` name 相同. 
  备注: 这个主要考虑的因素是跟 protobuf 生成的 method name 有关, 
  比如 `/spacemanager.DataSourceManage/ListDataSources`, 即 `package name` + `service name` + `method name`.
```

#### go_package 命名规则
```
- 每个 `go_package` 的包名都以 `pbsvc` 开头. 如 spacemanger 的 `pbsvcspace`, enginemanager 的 `pbsvcengine`.
  备注: 这里考虑的主要因素是 `go_package` 的名字就是之后我们要 import 的包名. 这样容易区分, 也避免与其他项目冲突.
```

#### java_package 和 java_outer_classname 命名规则
``` 
- `java_package` 的命名与 `go_package` 相同
```
~ 待补充

### types 结构和规则
#### 目录结构
```
- model: 定义所有功能模块的数据结构. 包括对 Table Schema 的定义和对某个 "资源" 的描述. 如果某个功能模块需要定一个结构特别, 可以单独用一个
         目录进行组织. 比如 flink 和 datasource.
- request: 定义所有请求参数的数据结构. 包括 GRPC 和 HTTP.
- response: 定义所有响应参数的数据结构. 包括 GRPC 和 HTTP.
```

#### 命名空间
``` 
- 所有 `go_package` 模块路径都在 `github.com/DataWorkbench/gproto/pkg/types/*` 下.
- 所有 `java_package` 模块路径都在 `com.dataomnis.gproto.types.*` 下.
```

#### 命名规则
```
- 每个目标代表一个 `包`, 每个目录下的所有文件的 `package`, `go_package`, `java_package` 的命名相同
- 名称以 'pb' 开头. 如 'pbmodel', 'pbrequest'
```

*注意* 每个目录下所有文件的的 `package`, `go_package`, `java_package` 的命名应该相同. 

#### model
```
- 每个功能模块或某种同类用途的数据结构(message) 单独放到一个文件内, 即一个文件可以包含多个 message. 文件名应与相应功能模块对应.
```

#### request
```
- 每个 `RPC Service` 的请求参数都放到一个单独的文件中. 文件名应与与 `RPC Service` 所在文件名相同.
- 文件每个 `message` 的命名应与其对应的 `method` 名相同.
```

#### response
```
- 每个 `RPC Service` 的响应参数都放到一个单独的文件中. 文件名应与与 `RPC Service` 所在文件名相同.
- 文件每个 `message` 的命名应与其对应的 `method` 名相同.
```

## 引用和依赖规则
### service
```
- service 下的所有文件不能被任何其他文件引用. 
- service 下的文件可以引用 types 下的所有文件.
```

### types/model
``` 
- types/model 不能引用除自身及其子目录以外的目录下的文件.
- types/model 的子目录下的文件不能引用其他目录的文件.
```

### types/request
``` 
- types/request 可以引用 types/model 下所有的文件. 
- types/request 只能被 `service` 下的文件引用.
```

### types/response
``` 
- types/response 可以引用 types/model 下所有的文件. 
- types/response 只能被 `service` 下的文件引用.
```
