package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsTopic;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsTopicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopic record);

    int insertSelective(CmsTopic record);

    CmsTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopic record);

    int updateByPrimaryKeyWithBLOBs(CmsTopic record);

    int updateByPrimaryKey(CmsTopic record);
}