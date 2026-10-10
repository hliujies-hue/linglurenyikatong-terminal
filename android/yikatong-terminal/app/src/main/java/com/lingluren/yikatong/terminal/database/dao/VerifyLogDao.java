package com.lingluren.yikatong.terminal.database.dao;

import com.lingluren.yikatong.terminal.database.model.VerifyLogEntity;

import java.util.List;

/**
 * 核验日志 DAO。
 */
public interface VerifyLogDao {

    void insert(VerifyLogEntity entity);

    List<VerifyLogEntity> latest(int limit);
}
