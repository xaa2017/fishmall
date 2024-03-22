package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsAdminLoginLog;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsAdminLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);
}