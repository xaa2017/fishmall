package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.OmsCompanyAddress;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface OmsCompanyAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsCompanyAddress record);

    int insertSelective(OmsCompanyAddress record);

    OmsCompanyAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    int updateByPrimaryKey(OmsCompanyAddress record);
}