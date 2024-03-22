package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsPrefrenceAreaProductRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsPrefrenceAreaProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    int insertSelective(CmsPrefrenceAreaProductRelation record);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}