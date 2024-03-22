package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsSubject;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertSelective(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKeyWithBLOBs(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);
}