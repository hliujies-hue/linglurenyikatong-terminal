package com.lingluren.yikatong.terminal.face;

/**
 * 百度离线 SDK 授权管理入口。
 *
 * 正式 License 不提交 Git。
 * 部署时通过设备授权配置加载。
 */
public class FaceLicenseManager {

    private boolean initialized;

    public boolean initializeOffline(String licensePath) {
        // TODO 接入百度 FaceAuth.initLicenseOffLine
        initialized = licensePath != null && !licensePath.isEmpty();
        return initialized;
    }

    public boolean initializeOnline(String licenseKey) {
        // TODO 接入百度 FaceAuth.initLicenseOnLine
        initialized = licenseKey != null && !licenseKey.isEmpty();
        return initialized;
    }

    public boolean isInitialized() {
        return initialized;
    }
}
