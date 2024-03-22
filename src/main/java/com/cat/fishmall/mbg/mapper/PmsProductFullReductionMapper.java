package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductFullReduction;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductFullReductionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductFullReduction record);

    int insertSelective(PmsProductFullReduction record);

    PmsProductFullReduction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    int updateByPrimaryKey(PmsProductFullReduction record);
}