package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsCoupon;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsCouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCoupon record);

    int insertSelective(SmsCoupon record);

    SmsCoupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCoupon record);

    int updateByPrimaryKey(SmsCoupon record);
}