package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsAdmin;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);
}