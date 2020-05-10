package com.song.p7.platform.mapper;

import com.song.p7.platform.pojo.Items;

public interface ItemsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKeyWithBLOBs(Items record);

    int updateByPrimaryKey(Items record);
}