package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsSubjectProductRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsSubjectProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectProductRelation record);

    int insertSelective(CmsSubjectProductRelation record);

    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    int updateByPrimaryKey(CmsSubjectProductRelation record);
}