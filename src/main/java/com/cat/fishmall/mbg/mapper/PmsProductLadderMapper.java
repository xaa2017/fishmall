package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProductLadder;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsProductLadderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductLadder record);

    int insertSelective(PmsProductLadder record);

    PmsProductLadder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductLadder record);

    int updateByPrimaryKey(PmsProductLadder record);
}