package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.UmsMemberReceiveAddress;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface UmsMemberReceiveAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}