package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductVertifyRecord;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductVertifyRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecord record);

    int insertSelective(PmsProductVertifyRecord record);

    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    int updateByPrimaryKey(PmsProductVertifyRecord record);
}