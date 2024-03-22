package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsOrderItem;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);
}