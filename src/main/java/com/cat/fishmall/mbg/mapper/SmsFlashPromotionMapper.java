package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsFlashPromotion;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsFlashPromotionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotion record);

    int insertSelective(SmsFlashPromotion record);

    SmsFlashPromotion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    int updateByPrimaryKey(SmsFlashPromotion record);
}