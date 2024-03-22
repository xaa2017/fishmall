package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsOrderReturnReason;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsOrderReturnReasonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnReason record);

    int insertSelective(OmsOrderReturnReason record);

    OmsOrderReturnReason selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    int updateByPrimaryKey(OmsOrderReturnReason record);
}