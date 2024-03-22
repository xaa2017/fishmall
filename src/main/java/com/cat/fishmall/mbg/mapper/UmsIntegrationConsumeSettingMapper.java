package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsIntegrationConsumeSetting;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsIntegrationConsumeSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    int insertSelective(UmsIntegrationConsumeSetting record);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}