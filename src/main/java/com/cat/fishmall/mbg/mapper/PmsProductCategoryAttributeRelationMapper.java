package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductCategoryAttributeRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductCategoryAttributeRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelation record);

    int insertSelective(PmsProductCategoryAttributeRelation record);

    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation record);

    int updateByPrimaryKey(PmsProductCategoryAttributeRelation record);
}