package com.lingluren.yikatong.terminal.database.dao;

import com.lingluren.yikatong.terminal.database.model.MemberFaceEntity;

import java.util.List;

/**
 * 本地会员人脸 DAO。
 *
 * 负责 SQLite 与百度本地人脸库之间的数据桥接。
 */
public interface MemberFaceDao {

    List<MemberFaceEntity> findActiveMembers();

    MemberFaceEntity findByMemberId(String memberId);

    void insert(MemberFaceEntity entity);

    void update(MemberFaceEntity entity);

    void deleteByMemberId(String memberId);
}
