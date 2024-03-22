package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductAttributeValue;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductAttributeValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeValue record);

    int insertSelective(PmsProductAttributeValue record);

    PmsProductAttributeValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    int updateByPrimaryKey(PmsProductAttributeValue record);
}