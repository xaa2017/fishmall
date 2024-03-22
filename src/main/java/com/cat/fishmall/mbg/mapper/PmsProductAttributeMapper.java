package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductAttribute;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductAttributeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute record);

    int insertSelective(PmsProductAttribute record);

    PmsProductAttribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttribute record);

    int updateByPrimaryKey(PmsProductAttribute record);
}