package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsPrefrenceArea;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsPrefrenceAreaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);
}