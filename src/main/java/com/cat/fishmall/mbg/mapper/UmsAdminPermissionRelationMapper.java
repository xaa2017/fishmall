package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsAdminPermissionRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsAdminPermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    int insertSelective(UmsAdminPermissionRelation record);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    int updateByPrimaryKey(UmsAdminPermissionRelation record);
}