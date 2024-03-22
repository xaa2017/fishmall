package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberTag;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);
}