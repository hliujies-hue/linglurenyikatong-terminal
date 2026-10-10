package com.lingluren.yikatong.terminal.database;

import com.lingluren.yikatong.terminal.database.model.MemberFaceEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 本地人脸库仓储层。
 *
 * 后续连接 SQLite，将会员特征同步到设备本地。
 */
public class LocalFaceRepository {

    private final List<MemberFaceEntity> cache = new ArrayList<>();

    public void save(MemberFaceEntity entity) {
        cache.add(entity);
    }

    public List<MemberFaceEntity> findAll() {
        return cache;
    }
}
