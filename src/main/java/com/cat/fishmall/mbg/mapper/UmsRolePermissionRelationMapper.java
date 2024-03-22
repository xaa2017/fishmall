package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsRolePermissionRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsRolePermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRolePermissionRelation record);

    int insertSelective(UmsRolePermissionRelation record);

    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    int updateByPrimaryKey(UmsRolePermissionRelation record);
}