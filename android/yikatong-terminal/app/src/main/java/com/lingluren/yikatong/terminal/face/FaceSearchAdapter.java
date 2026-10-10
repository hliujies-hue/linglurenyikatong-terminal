package com.lingluren.yikatong.terminal.face;

import java.util.List;

/**
 * 百度 FaceSearch 适配层。
 *
 * 负责连接一卡通本地权益库与百度本地人脸检索能力。
 */
public class FaceSearchAdapter {

    private boolean ready;

    public void initialize() {
        // TODO: 初始化百度 FaceSearch 本地库。
        ready = true;
    }

    /**
     * 批量注册有效权益会员特征。
     */
    public boolean registerFeatureList(List<byte[]> features) {
        if (!ready || features == null) {
            return false;
        }
        // TODO: 调用百度 SDK pushPersonFeatureList。
        return true;
    }

    /**
     * 删除退款、过期、拉黑、禁用会员。
     */
    public boolean deleteFeature(String memberId) {
        if (!ready || memberId == null) {
            return false;
        }
        // TODO: 调用百度 SDK delPersonById。
        return true;
    }

    /**
     * 执行本地 1:N 搜索。
     */
    public String search(byte[] feature) {
        if (!ready || feature == null) {
            return null;
        }
        // TODO: 调用百度 SDK search。
        return null;
    }
}
