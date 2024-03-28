package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsProduct;
import com.cat.fishmall.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
@Mapper
public interface PmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKeyWithBLOBs(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);

    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}