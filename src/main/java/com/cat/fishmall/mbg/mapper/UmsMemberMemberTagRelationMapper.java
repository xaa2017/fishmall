package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberMemberTagRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberMemberTagRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    int insertSelective(UmsMemberMemberTagRelation record);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}