package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsHomeNewProduct;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsHomeNewProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct record);

    int insertSelective(SmsHomeNewProduct record);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    int updateByPrimaryKey(SmsHomeNewProduct record);
}