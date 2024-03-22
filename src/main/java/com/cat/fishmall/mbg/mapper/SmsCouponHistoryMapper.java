package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsCouponHistory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsCouponHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    int insertSelective(SmsCouponHistory record);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponHistory record);

    int updateByPrimaryKey(SmsCouponHistory record);
}