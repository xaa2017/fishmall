package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsSkuStock;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsSkuStockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuStock record);

    int insertSelective(PmsSkuStock record);

    PmsSkuStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsSkuStock record);

    int updateByPrimaryKey(PmsSkuStock record);
}