package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsFlashPromotionProductRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsFlashPromotionProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    int insertSelective(SmsFlashPromotionProductRelation record);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);
}