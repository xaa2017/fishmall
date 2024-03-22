package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsSubjectComment;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsSubjectCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectComment record);

    int insertSelective(CmsSubjectComment record);

    CmsSubjectComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectComment record);

    int updateByPrimaryKey(CmsSubjectComment record);
}