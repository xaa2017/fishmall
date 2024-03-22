package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsHomeBrand;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsHomeBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeBrand record);

    int insertSelective(SmsHomeBrand record);

    SmsHomeBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeBrand record);

    int updateByPrimaryKey(SmsHomeBrand record);
}