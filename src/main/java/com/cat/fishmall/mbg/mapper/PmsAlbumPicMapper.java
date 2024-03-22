package com.cat.fishmall.mbg.mapper;

import com.cat.fishmall.mbg.model.PmsAlbumPic;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
public interface PmsAlbumPicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbumPic record);

    int insertSelective(PmsAlbumPic record);

    PmsAlbumPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbumPic record);

    int updateByPrimaryKey(PmsAlbumPic record);
}