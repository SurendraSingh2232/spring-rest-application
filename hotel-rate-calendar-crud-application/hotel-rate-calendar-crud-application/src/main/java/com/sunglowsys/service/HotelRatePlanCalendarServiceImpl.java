package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRatePlanCalendar;
import com.sunglowsys.repository.HotelRatePlanCalendarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRatePlanCalendarServiceImpl implements HotelRatePlanCalendarService {


    private final HotelRatePlanCalendarRepository hotelRatePlanCalendarRepository;

    public HotelRatePlanCalendarServiceImpl(HotelRatePlanCalendarRepository hotelRatePlanCalendarRepository) {
        this.hotelRatePlanCalendarRepository = hotelRatePlanCalendarRepository;
    }

    @Override
    public HotelRatePlanCalendar save(HotelRatePlanCalendar hotelRatePlanCalendar) {
        return hotelRatePlanCalendarRepository.save(hotelRatePlanCalendar);
    }

    @Override
    public HotelRatePlanCalendar update(HotelRatePlanCalendar hotelRatePlanCalendar, Integer id) {
        HotelRatePlanCalendar result = hotelRatePlanCalendarRepository.findById(id).get();
        result.setSingleOccupancy(hotelRatePlanCalendar.getSingleOccupancy());
        result.setDoubleOccupancy(hotelRatePlanCalendar.getDoubleOccupancy());
        result.setExtraChildPrice(hotelRatePlanCalendar.getExtraChildPrice());
        result.setExtraAdultPrice(hotelRatePlanCalendar.getExtraAdultPrice());
        result.setApplicableDays(hotelRatePlanCalendar.getApplicableDays());
        result.setHotelId(hotelRatePlanCalendar.getHotelId());
        result.setHotelRoomType(hotelRatePlanCalendar.getHotelRoomType());
        return hotelRatePlanCalendarRepository.save(result);
    }

    @Override
    public List<HotelRatePlanCalendar> getAll() {
        return hotelRatePlanCalendarRepository.findAll();
    }

    @Override
    public HotelRatePlanCalendar find(Integer id) {
        return hotelRatePlanCalendarRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        hotelRatePlanCalendarRepository.deleteById(id);
    }
}
