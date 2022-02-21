package com.sunglowsys.service;

import com.sunglowsys.domain.RoomType;

import java.util.List;

public interface RoomTypeService {

    RoomType save(RoomType roomType);

    RoomType update(RoomType roomType,Integer id);

    List<RoomType> getAll();

    RoomType findById(Integer id);

    void delete(Integer id);

}
