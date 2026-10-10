package com.lingluren.yikatong.terminal.face;

/**
 * 百度离线人脸 SDK 模型配置。
 *
 * 正式接入 SDK 后，在此统一管理模型路径和初始化参数。
 */
public class FaceModelConfig {

    private FaceModelConfig() {
    }

    public static String getModelDirectory() {
        return "face-sdk-models";
    }
}
