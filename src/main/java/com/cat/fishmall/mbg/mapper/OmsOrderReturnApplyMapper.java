package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsOrderReturnApply;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsOrderReturnApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);
}