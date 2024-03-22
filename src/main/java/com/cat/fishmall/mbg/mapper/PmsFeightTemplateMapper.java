package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsFeightTemplate;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsFeightTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    int insertSelective(PmsFeightTemplate record);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    int updateByPrimaryKey(PmsFeightTemplate record);
}