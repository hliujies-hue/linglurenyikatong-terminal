package com.lingluren.yikatong.terminal.database;

/**
 * 设备信息实体。
 * 保存终端编号、景区绑定和同步状态。
 */
public class DeviceEntity {
    private String deviceId;
    private String scenicId;
    private String status;
    private long lastSyncTime;

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

    public long getLastSyncTime() {
        return lastSyncTime;
    }

    public void setLastSyncTime(long lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }
}
