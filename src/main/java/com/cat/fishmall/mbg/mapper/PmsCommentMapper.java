package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsComment;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    int insertSelective(PmsComment record);

    PmsComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsComment record);

    int updateByPrimaryKeyWithBLOBs(PmsComment record);

    int updateByPrimaryKey(PmsComment record);
}