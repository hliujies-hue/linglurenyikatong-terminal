package com.lingluren.yikatong.terminal.face;

import java.util.List;

/**
 * 百度 FaceSearch 适配层。
 *
 * 负责：
 * - 注册设备端有效会员特征
 * - 批量同步人脸特征
 * - 删除失效权益会员
 * - 执行 1:N 搜索
 */
public class FaceSearchAdapter {

    public void registerFeatureList(List<byte[]> features) {
        // TODO 调用百度 SDK pushPersonFeatureList
    }

    public void deleteFeature(String memberId) {
        // TODO 调用百度 SDK 删除人脸特征
    }

    public String search(byte[] feature) {
        // TODO 调用百度 SDK 1:N search
        return null;
    }
}
