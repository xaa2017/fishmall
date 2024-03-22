package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsGrowthChangeHistory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsGrowthChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsGrowthChangeHistory record);

    int insertSelective(UmsGrowthChangeHistory record);

    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}