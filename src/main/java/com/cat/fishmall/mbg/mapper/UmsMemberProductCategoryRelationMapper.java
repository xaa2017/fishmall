package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberProductCategoryRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberProductCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberProductCategoryRelation record);

    int insertSelective(UmsMemberProductCategoryRelation record);

    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);
}