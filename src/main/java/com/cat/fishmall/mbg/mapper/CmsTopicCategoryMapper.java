package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsTopicCategory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsTopicCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategory record);

    int insertSelective(CmsTopicCategory record);

    CmsTopicCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicCategory record);

    int updateByPrimaryKey(CmsTopicCategory record);
}