package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsCouponProductRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsCouponProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductRelation record);

    int insertSelective(SmsCouponProductRelation record);

    SmsCouponProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductRelation record);

    int updateByPrimaryKey(SmsCouponProductRelation record);
}