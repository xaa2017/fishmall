package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.CmsMemberReport;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface CmsMemberReportMapper {
    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);
}