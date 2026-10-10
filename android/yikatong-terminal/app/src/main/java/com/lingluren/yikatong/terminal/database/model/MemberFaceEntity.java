package com.lingluren.yikatong.terminal.database.model;

/**
 * 一卡通设备端会员人脸数据模型。
 */
public class MemberFaceEntity {

    private String memberId;
    private String cardNo;
    private String faceFeature;
    private long expireTime;
    private String status;
    private String scenicId;
    private long syncVersion;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
