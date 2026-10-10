package com.lingluren.yikatong.terminal.face;

import android.content.Context;

/**
 * 百度离线人脸 SDK 模型加载入口。
 *
 * 统一管理检测、活体、特征、识别模型初始化。
 */
public class FaceModelLoader {

    private boolean initialized;

    public void init(Context context) {
        // TODO: 接入 FaceSDKManager.initModel()
        // TODO: 加载 assets/face-sdk-models
        initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }
}
