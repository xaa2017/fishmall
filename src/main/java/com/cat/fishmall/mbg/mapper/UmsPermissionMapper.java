package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsPermission;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    int insertSelective(UmsPermission record);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsPermission record);

    int updateByPrimaryKey(UmsPermission record);
}