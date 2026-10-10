package com.lingluren.yikatong.terminal.verify;

/**
 * 一卡通离线核验入口。
 *
 * 后续接入百度离线 SDK 后负责：
 * 1. 调用人脸识别流程
 * 2. 获取识别结果 memberId
 * 3. 调用本地权益校验
 */
public class VerifyManager {

    public VerifyResult verify(String memberId) {
        return new VerifyResult(memberId, false, "SDK integration pending");
    }
}
