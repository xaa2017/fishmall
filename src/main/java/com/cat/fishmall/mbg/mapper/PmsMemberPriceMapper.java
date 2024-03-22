package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsMemberPrice;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsMemberPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice record);

    int insertSelective(PmsMemberPrice record);

    PmsMemberPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsMemberPrice record);

    int updateByPrimaryKey(PmsMemberPrice record);
}