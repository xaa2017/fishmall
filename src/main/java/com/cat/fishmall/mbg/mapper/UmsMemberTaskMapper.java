package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberTask;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask record);

    int insertSelective(UmsMemberTask record);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTask record);

    int updateByPrimaryKey(UmsMemberTask record);
}