package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

    List<PmsBrand> listAll();
}