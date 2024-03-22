package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsCartItem;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsCartItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    int insertSelective(OmsCartItem record);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCartItem record);

    int updateByPrimaryKey(OmsCartItem record);
}