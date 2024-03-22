package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsOrderSetting;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsOrderSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderSetting record);

    int insertSelective(OmsOrderSetting record);

    OmsOrderSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderSetting record);

    int updateByPrimaryKey(OmsOrderSetting record);
}