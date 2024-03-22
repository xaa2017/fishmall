package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsCouponProductCategoryRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsCouponProductCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelation record);

    int insertSelective(SmsCouponProductCategoryRelation record);

    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);
}