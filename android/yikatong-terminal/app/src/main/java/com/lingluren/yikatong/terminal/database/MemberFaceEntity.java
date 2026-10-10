package com.lingluren.yikatong.terminal.database;

/**
 * 本地有效权益会员人脸数据模型。
 */
public class MemberFaceEntity {
    public String memberId;
    public String cardNo;
    public byte[] faceFeature;
    public String expireTime;
    public String status;
    public String scenicId;
    public long syncVersion;
}
