package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMember;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);
}