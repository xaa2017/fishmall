package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsHelpCategory;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsHelpCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);
}