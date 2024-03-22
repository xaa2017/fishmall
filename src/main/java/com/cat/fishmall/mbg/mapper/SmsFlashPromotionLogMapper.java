package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsFlashPromotionLog;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsFlashPromotionLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);
}