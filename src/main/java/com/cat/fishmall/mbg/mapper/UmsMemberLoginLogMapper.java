package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberLoginLog;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLog record);

    int insertSelective(UmsMemberLoginLog record);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    int updateByPrimaryKey(UmsMemberLoginLog record);
}