package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsIntegrationChangeHistory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsIntegrationChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory record);

    int insertSelective(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}