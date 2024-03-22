package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsAdminRoleRelation;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsAdminRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation record);

    int insertSelective(UmsAdminRoleRelation record);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    int updateByPrimaryKey(UmsAdminRoleRelation record);
}