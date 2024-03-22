package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsHomeRecommendSubject;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsHomeRecommendSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendSubject record);

    int insertSelective(SmsHomeRecommendSubject record);

    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    int updateByPrimaryKey(SmsHomeRecommendSubject record);
}