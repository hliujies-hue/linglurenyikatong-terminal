package com.lingluren.yikatong.terminal.face;

/**
 * 百度离线人脸 SDK 适配层。
 *
 * 业务层只依赖此入口，避免直接绑定百度 SDK。
 *
 * 真实 SDK 对象在初始化阶段注入，正式 License 不进入仓库。
 */
public class FaceSdkAdapter {

    private boolean initialized;
    private Object sdkContext;

    /**
     * 初始化 SDK 运行环境。
     *
     * 接入百度 SDK 后在此完成：
     * - License 初始化
     * - 模型加载
     * - SDK Manager 初始化
     */
    public boolean initialize(Object context) {
        this.sdkContext = context;
        // TODO: 调用 FaceLicenseManager + FaceModelLoader 完成真实初始化。
        initialized = sdkContext != null;
        return initialized;
    }

    public boolean isInitialized() {
        return initialized;
    }

    /**
     * 根据特征执行本地 1:N 搜索。
     */
    public String search(byte[] feature) {
        if (!initialized || feature == null) {
            return null;
        }
        // TODO: 调用百度 FaceSearch.search。
        return null;
    }

    /**
     * 删除设备端失效会员人脸。
     */
    public boolean deleteFace(String memberId) {
        if (!initialized || memberId == null) {
            return false;
        }
        // TODO: 调用百度 SDK 删除接口。
        return true;
    }
}
