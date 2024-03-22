package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsHomeRecommendProduct;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsHomeRecommendProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    int insertSelective(SmsHomeRecommendProduct record);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}