package com.lingluren.yikatong.terminal.device;

/**
 * 一卡通离线终端设备信息。
 */
public class DeviceInfo {
    private String deviceId;
    private String scenicId;
    private String status;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
