package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsSubjectCategory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsSubjectCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectCategory record);

    int insertSelective(CmsSubjectCategory record);

    CmsSubjectCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    int updateByPrimaryKey(CmsSubjectCategory record);
}