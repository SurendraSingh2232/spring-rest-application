package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalendar;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HotelInventoryCalendarService {

    HotelInventoryCalendar save(HotelInventoryCalendar hotelInventoryCalendar);

    HotelInventoryCalendar update(HotelInventoryCalendar hotelInventoryCalendar,Integer id);

    List<HotelInventoryCalendar> findAll(Pageable pageable);

    HotelInventoryCalendar findById(Integer id);

    void deleteById(Integer id);
}
