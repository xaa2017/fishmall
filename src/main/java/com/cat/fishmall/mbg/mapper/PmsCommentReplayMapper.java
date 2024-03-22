package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsCommentReplay;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsCommentReplayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    int insertSelective(PmsCommentReplay record);

    PmsCommentReplay selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsCommentReplay record);

    int updateByPrimaryKey(PmsCommentReplay record);
}