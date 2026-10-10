package com.lingluren.yikatong.terminal.verify;

import com.lingluren.yikatong.terminal.database.MemberFaceEntity;

/**
 * 一卡通本地权益校验。
 *
 * 人脸识别成功后，不直接放行，必须校验会员权益状态。
 */
public class PermissionChecker {

    public boolean check(MemberFaceEntity member) {
        if (member == null) {
            return false;
        }
        return "ACTIVE".equals(member.getStatus());
    }
}
