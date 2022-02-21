package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRatePlanCalendar;

import java.util.List;

public interface HotelRatePlanCalendarService {

    HotelRatePlanCalendar save(HotelRatePlanCalendar hotelRatePlanCalendar);

    HotelRatePlanCalendar update(HotelRatePlanCalendar hotelRatePlanCalendar,Integer id);

    List<HotelRatePlanCalendar> getAll();

    HotelRatePlanCalendar find(Integer id);

    void delete(Integer id);
}
