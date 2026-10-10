package com.lingluren.yikatong.terminal.face;

/**
 * 百度离线人脸 SDK 运行配置。
 * 正式 License 不进入仓库，通过部署配置注入。
 */
public class FaceSdkRuntimeConfig {

    private String licensePath;
    private String modelPath = "face-sdk-models";

    public String getLicensePath() {
        return licensePath;
    }

    public void setLicensePath(String licensePath) {
        this.licensePath = licensePath;
    }

    public String getModelPath() {
        return modelPath;
    }
}
