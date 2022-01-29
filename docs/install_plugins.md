# 项目依赖及安装

## 依赖的工具和插件列表
- 代码生成工具
```bash
- protoc 3.19.3
- proto-gen-go v1.27.1
- protoc-gen-go-grpc v1.2.0
- proto-gen-grpc-java v1.43.2
```
- 生成 python 代码的依赖 见 [requirements.pip](../scripts/requirements.pip)

- 其他
```bash
- staticcheck 2021.1.1 (v0.2.1): 静态代码检测和分析工具.
```

## 注意
代码生成用的工具和插件必须与文档中描述的`版本保持一致`. 
其他的也尽量保持一致.

## 安装 protoc 3.19.3
### 下载
- [Linux x64](https://github.com/protocolbuffers/protobuf/releases/download/v3.19.3/protoc-3.19.3-linux-x86_64.zip)
- [MacOS](https://github.com/protocolbuffers/protobuf/releases/download/v3.19.3/protoc-3.19.3-osx-x86_64.zip)
- [Windows 64](https://github.com/protocolbuffers/protobuf/releases/download/v3.19.3/protoc-3.19.3-win64.zip)

如用其他系统直接从 [protobuf github](https://github.com/protocolbuffers/protobuf/releases) 上找到对应版本和对应系统的二进制包即可

### 安装
以安装 protoc-3.19.3-osx-x86_64.zip 为例.
1. 解压
 - 可以把 "$HOME" 替换其他目录 
 - 注意: 一定要把 zip 的所有目录和目录都保留并保持其目录结构. 生成代码时加载 google 提供的 proto 文件会用到.
```shell
mkdir $HOME/protoc-3.19.3
mv protoc-3.13.0-osx-x86_64.zip $HOME/protoc-3.19.3
cd $HOME/protoc-3.19.3
unzip protoc-3.19.3-osx-x86_64.zip
```
2. 设置环境变量
解压后设置全局环境变量, 可以放到 `/etc/profile` 或 `~/.bash_profile` 或 `~/.bash_rc` 或 `~/.zsh_rc` 中自动加载
```shell
export PATH="$HOME/protoc-3.19.3/bin:$PATH"
```

## 安装 proto-gen-go v1.27.1
### 下载
- [MacOS](https://github.com/protocolbuffers/protobuf-go/releases/download/v1.27.1/protoc-gen-go.v1.27.1.darwin.amd64.tar.gz)
- [Linux x64](https://github.com/protocolbuffers/protobuf-go/releases/download/v1.27.1/protoc-gen-go.v1.27.1.linux.amd64.tar.gz)
- [Windows x64](https://github.com/protocolbuffers/protobuf-go/releases/download/v1.27.1/protoc-gen-go.v1.27.1.windows.amd64.zip)

如用其他系统直接从 [官网](https://github.com/protocolbuffers/protobuf-go/releases) 上找到对应版本和对应系统的二进制包下载即可.

### 安装
安装过程与 `安装 protoc` 相同. 不过只保留二进制文件即可.

## 安装 protoc-gen-go-grpc v1.2.0
### 下载
- [MacOS](https://github.com/grpc/grpc-go/releases/download/cmd%2Fprotoc-gen-go-grpc%2Fv1.2.0/protoc-gen-go-grpc.v1.2.0.darwin.amd64.tar.gz)
- [Linux x64](https://github.com/grpc/grpc-go/releases/download/cmd%2Fprotoc-gen-go-grpc%2Fv1.2.0/protoc-gen-go-grpc.v1.2.0.linux.amd64.tar.gz)
- [Windows x64](https://github.com/grpc/grpc-go/releases/download/cmd%2Fprotoc-gen-go-grpc%2Fv1.2.0/protoc-gen-go-grpc.v1.2.0.windows.amd64.tar.gz)

如用其他系统直接从 [官网](https://github.com/grpc/grpc-go/releases) 上找到对应版本和对应系统的二进制包下载即可.

### 安装
安装过程与 `安装 protoc` 相同. 不过只保留二进制文件即可.

## 安装 proto-gen-grpc-java v1.43.2
### 下载
- [MacOS](https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.43.2/protoc-gen-grpc-java-1.43.2-osx-x86_64.exe)
- [Window x64](https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.43.2/protoc-gen-grpc-java-1.43.2-windows-x86_64.exe)
- [Linux x64](https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.43.2/protoc-gen-grpc-java-1.43.2-linux-x86_64.exe)

其他系统从 [Maven](https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.43.2/) 上找到对应版本和对应系统的二进制包下载即可.

### 安装
java 的 grpc gen 是从 maven 上下载的二进制. 下载之后需要将其改名, 并赋予执行权限. 然后放到 shell 的 $PATH 中(任意位置, 能找到命令即可).
如 `protoc-gen-grpc-java-1.43.2-osx-x86_64.exe` 
```shell
cp protoc-gen-grpc-java-1.43.2-osx-x86_64.exe protoc-gen-grpc-java
chmod + protoc-gen-grpc-java
cp protoc-gen-grpc-java /usr/local/bin/
```

注意: 如果是 MacOS 并开启了安全性策略. 第一次运行这个命令可能会有安全性提示.
先手动执行一下 `protoc-gen-grpc-java -v`, 然后到 `安全设置里` 点一下 `open annway`.
正常情况下执行输出如下, 能看到这个输出就说明插件可以用了.
```shell
protoc-gen-grpc-java: Unknown option: -v
```

## 安装 staticcheck 2021.1.1 (v0.2.1)
### 下载
- [Windows x64](https://github.com/dominikh/go-tools/releases/download/2021.1.1/staticcheck_windows_amd64.tar.gz)
- [MacOS](https://github.com/dominikh/go-tools/releases/download/2021.1.1/staticcheck_darwin_amd64.tar.gz)
- [Linux x64](https://github.com/dominikh/go-tools/releases/download/2021.1.1/staticcheck_linux_arm64.tar.gz)

如用其他系统直接从 [官网](https://github.com/dominikh/go-tools/releases) 上找到对应版本和对应系统的二进制包下载即可.

### 安装
解压后放到 shell 的 $PATH 中(任意位置, 能找到命令即可).
