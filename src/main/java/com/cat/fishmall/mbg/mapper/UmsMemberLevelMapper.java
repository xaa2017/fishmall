package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberLevel;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);
}