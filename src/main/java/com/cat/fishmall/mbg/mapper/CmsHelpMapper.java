package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsHelp;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsHelpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelp record);

    int insertSelective(CmsHelp record);

    CmsHelp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelp record);

    int updateByPrimaryKeyWithBLOBs(CmsHelp record);

    int updateByPrimaryKey(CmsHelp record);
}