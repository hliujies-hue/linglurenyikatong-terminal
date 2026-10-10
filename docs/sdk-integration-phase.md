# 百度离线人脸 SDK 实际接入阶段

## 目标

基于 `com.lingluren.yikatong.terminal` 实现邯郸旅游惠民一卡通离线核验终端。

## 接入范围

- FaceSDKAndroid 通用工程
- faceaar SDK 核心库
- datalibrary 摄像头/数据库封装
- facelibrary 模型资源
- gatelibrary 1:N识别流程

## 业务流程

服务器有效权益会员同步 -> SQLite本地库 -> 百度人脸库缓存 -> 离线识别 -> 权益校验 -> 核验日志。

## 当前开发顺序

1. 导入 Android 工程模块
2. 配置 Gradle 依赖
3. 配置模型与 native 文件
4. 完成 License 初始化
5. 完成模型初始化
6. 完成 1:N 搜索链路
7. 完成终端页面
8. 构建 debug APK
