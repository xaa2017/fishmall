package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.SmsFlashPromotionSession;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface SmsFlashPromotionSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionSession record);

    int insertSelective(SmsFlashPromotionSession record);

    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    int updateByPrimaryKey(SmsFlashPromotionSession record);
}