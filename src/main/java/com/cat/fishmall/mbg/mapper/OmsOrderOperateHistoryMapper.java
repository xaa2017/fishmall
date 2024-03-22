package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsOrderOperateHistory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsOrderOperateHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);
}