package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsOrder;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);
}