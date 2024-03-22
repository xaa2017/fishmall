package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsAlbum;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsAlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    int insertSelective(PmsAlbum record);

    PmsAlbum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbum record);

    int updateByPrimaryKey(PmsAlbum record);
}