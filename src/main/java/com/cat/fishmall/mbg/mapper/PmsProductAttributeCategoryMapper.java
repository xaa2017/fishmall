package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductAttributeCategory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductAttributeCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory record);

    int insertSelective(PmsProductAttributeCategory record);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    int updateByPrimaryKey(PmsProductAttributeCategory record);
}