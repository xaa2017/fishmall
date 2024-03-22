package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProduct;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKeyWithBLOBs(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);
}