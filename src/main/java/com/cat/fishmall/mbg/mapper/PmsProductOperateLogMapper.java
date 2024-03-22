package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductOperateLog;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductOperateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductOperateLog record);

    int insertSelective(PmsProductOperateLog record);

    PmsProductOperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductOperateLog record);

    int updateByPrimaryKey(PmsProductOperateLog record);
}