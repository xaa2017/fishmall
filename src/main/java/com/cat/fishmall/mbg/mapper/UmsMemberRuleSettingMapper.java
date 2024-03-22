package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberRuleSetting;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberRuleSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    int insertSelective(UmsMemberRuleSetting record);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    int updateByPrimaryKey(UmsMemberRuleSetting record);
}