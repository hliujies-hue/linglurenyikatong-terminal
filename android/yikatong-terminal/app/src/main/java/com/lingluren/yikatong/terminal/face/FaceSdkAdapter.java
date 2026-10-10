package com.lingluren.yikatong.terminal.face;

/**
 * 百度离线人脸 SDK 适配层。
 *
 * 业务代码不直接依赖百度 SDK，统一通过此入口调用。
 */
public class FaceSdkAdapter {

    private boolean initialized;

    public void initialize() {
        // TODO: 初始化百度 SDK License、模型
        initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public String search(byte[] feature) {
        // TODO: 调用 FaceSearch 1:N 识别
        return null;
    }

    public void deleteFace(String memberId) {
        // TODO: 调用百度 SDK 删除本地特征
    }
}
