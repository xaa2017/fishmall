package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsRole;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsRole record);

    int insertSelective(UmsRole record);

    UmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsRole record);

    int updateByPrimaryKey(UmsRole record);
}