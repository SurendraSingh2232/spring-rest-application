package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.repository.HotelBookingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotelBookingServiceImpl implements HotelBookingService{

    private final Logger log = LoggerFactory.getLogger(HotelBookingServiceImpl.class);

    private final HotelBookingRepository hotelBookingRepository;

    public HotelBookingServiceImpl(HotelBookingRepository hotelBookingRepository) {
        this.hotelBookingRepository = hotelBookingRepository;
    }

    @Override
    public HotelBooking save(HotelBooking hotelBooking) {
        log.debug("Request to save HotelBookings: {} ",hotelBooking);
        return hotelBookingRepository.save(hotelBooking);
    }

    @Override
    public HotelBooking update(HotelBooking hotelBooking, Long id) {
        log.debug("Request to update HotelBooking: {}",hotelBooking);
          return hotelBookingRepository.save(hotelBooking);
    }

    @Override
    public Page<HotelBooking> getAll(Pageable pageable) {
        log.debug("Request to getAll HotelBookings: {} ",pageable);
        return hotelBookingRepository.findAll(pageable);
    }


    @Override
    public Optional<HotelBooking> findById(Long id) {
        log.debug("Request to find HotelBooking ById: {} ",id);
        return hotelBookingRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete HotelBooking: {} ",id);
        hotelBookingRepository.deleteById(id);

    }
}
