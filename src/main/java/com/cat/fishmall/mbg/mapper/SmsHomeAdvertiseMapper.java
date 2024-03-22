package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsHomeAdvertise;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsHomeAdvertiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdvertise record);

    int insertSelective(SmsHomeAdvertise record);

    SmsHomeAdvertise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    int updateByPrimaryKey(SmsHomeAdvertise record);
}