# linglurenyikatong-terminal

邯郸旅游惠民一卡通离线核验终端 Android 项目。

## 项目定位

基于百度离线人脸识别 Android SDK 通用版进行二次开发，用于景区手持终端/Android设备本地人脸核验。

## 固定信息

- Application ID: `com.lingluren.yikatong.terminal`
- 平台: Android
- 人脸算法: 百度离线人脸识别 SDK

## 模块规划

```
android/
  app/
  face-sdk/
  device/
  sync/
  verify/
  database/
  log/

docs/
```

## 业务原则

- 设备端只同步有效通行权益用户
- 退款、过期、拉黑、禁用触发设备侧人脸删除
- 设备保存人脸特征用于离线核验
- 与一卡通后台系统独立维护

## 开发状态

初始化阶段。