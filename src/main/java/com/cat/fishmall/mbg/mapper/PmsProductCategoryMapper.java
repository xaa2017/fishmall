package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductCategory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategory record);

    int insertSelective(PmsProductCategory record);

    PmsProductCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductCategory record);

    int updateByPrimaryKeyWithBLOBs(PmsProductCategory record);

    int updateByPrimaryKey(PmsProductCategory record);
}