package com.sunglowsys.service;

import com.sunglowsys.domain.HotelBooking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HotelBookingService {

    HotelBooking save(HotelBooking hotelBooking);

    HotelBooking update(HotelBooking hotelBooking,Long id);

    Page<HotelBooking> getAll(Pageable pageable);

    Optional<HotelBooking> findById(Long id);

    void delete(Long id);
}
