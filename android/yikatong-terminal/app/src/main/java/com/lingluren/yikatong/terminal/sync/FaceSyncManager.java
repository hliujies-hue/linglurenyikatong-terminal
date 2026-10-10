package com.lingluren.yikatong.terminal.sync;

/**
 * 人脸增量同步入口。
 *
 * 规则：
 * - 仅同步有效权益会员
 * - 退款、过期、拉黑、禁用执行删除同步
 */
public class FaceSyncManager {

    public void sync() {
        // TODO connect yikatong backend API
        // TODO process ADD / UPDATE / DELETE events
    }

    public void deleteFace(String memberId, String reason) {
        // TODO remove local feature and SDK cache
    }
}
