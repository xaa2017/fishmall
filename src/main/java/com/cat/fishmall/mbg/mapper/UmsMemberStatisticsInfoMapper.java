package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberStatisticsInfo;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberStatisticsInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    int insertSelective(UmsMemberStatisticsInfo record);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}