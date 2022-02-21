package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HotelInventoryService {

    HotelInventory saveHotelInventory(HotelInventory hotelInventory);

    HotelInventory updateHotelInventory(HotelInventory hotelInventory,Integer id);

    Page<HotelInventory> findAll(Pageable pageable);

    Optional<HotelInventory> findById(Integer id);

    void deleteById(Integer id);
}
