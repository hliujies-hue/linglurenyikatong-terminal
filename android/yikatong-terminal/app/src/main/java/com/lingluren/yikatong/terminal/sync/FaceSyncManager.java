package com.lingluren.yikatong.terminal.sync;

/**
 * 人脸特征同步管理。
 *
 * 后续接入一卡通后台增量同步接口。
 * 设备仅同步有效权益会员。
 */
public class FaceSyncManager {

    public void sync() {
        // TODO: 拉取新增、更新、删除事件
    }

    public void deleteFace(String memberId) {
        // TODO: 删除退款、过期、拉黑会员的人脸特征
    }
}
