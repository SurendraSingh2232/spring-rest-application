package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalendar;
import com.sunglowsys.repository.HotelInventoryCalendarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelInventoryCalendarServiceImpl implements HotelInventoryCalendarService{

    private  final Logger log = LoggerFactory.getLogger(HotelInventoryCalendarServiceImpl.class);

    private final HotelInventoryCalendarRepository hotelInventoryCalendarRepository;

    public HotelInventoryCalendarServiceImpl(HotelInventoryCalendarRepository hotelInventoryCalendarRepository) {
        this.hotelInventoryCalendarRepository = hotelInventoryCalendarRepository;
    }

    @Override
    public HotelInventoryCalendar save(HotelInventoryCalendar hotelInventoryCalendar) {
        log.debug("Request to create HotelInventoryCalendar : {}", hotelInventoryCalendar);
        return hotelInventoryCalendarRepository.save(hotelInventoryCalendar);
    }

    @Override
    public HotelInventoryCalendar update(HotelInventoryCalendar hotelInventoryCalendar, Integer id) {
        log.debug("Request to update HotelInventoryCalendar : {}", hotelInventoryCalendar);
        return hotelInventoryCalendarRepository.save(hotelInventoryCalendar);
    }

    @Override
    public List<HotelInventoryCalendar> findAll(Pageable pageable) {
        log.debug("Request to getAll HotelInventoryCalendars : {}", pageable);
        return hotelInventoryCalendarRepository.findAll();
    }

    @Override
    public HotelInventoryCalendar findById(Integer id) {
        log.debug("Request to get HotelInventoryCalendar : {}", id);
        return hotelInventoryCalendarRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        log.debug("Request to delete HotelInventoryCalendar : {}", id);
        hotelInventoryCalendarRepository.deleteById(id);

    }
}
