package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsTopicComment;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsTopicCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    int insertSelective(CmsTopicComment record);

    CmsTopicComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicComment record);

    int updateByPrimaryKey(CmsTopicComment record);
}