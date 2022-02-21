package com.sunglowsys.resource;

import com.sunglowsys.BadRequestException;
import com.sunglowsys.domain.HotelBooking;
import com.sunglowsys.service.HotelBookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelBookingResource {

    private final Logger log = LoggerFactory.getLogger(HotelBookingResource.class);

    private final HotelBookingService hotelBookingService;

    public HotelBookingResource(HotelBookingService hotelBookingService) {
        this.hotelBookingService = hotelBookingService;
    }

    @PostMapping("/hotel-bookings")
    public ResponseEntity<HotelBooking> createHotelBooking(@RequestBody HotelBooking hotelBooking) throws BadRequestException {
        log.debug("REST Request to save HotelBookings: {} ",hotelBooking);
        if (hotelBooking.getId() != null){
            throw new BadRequestException("Id should be null in create api call");
        }
        HotelBooking result = hotelBookingService.save(hotelBooking);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @PutMapping("/hotel-bookings/{id}")
    public ResponseEntity<?> updateHotelBooking(@RequestBody HotelBooking hotelBooking,@PathVariable("id") Long id) throws BadRequestException {
        log.debug("REST Request to update HotelBookings: {} ",hotelBooking);
        if (hotelBooking.getId() == null){
            throw new BadRequestException("Id should not be null in create api call");
        }
        HotelBooking result = hotelBookingService.save(hotelBooking);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/hotel-bookings")
    public ResponseEntity<List<HotelBooking>> findAllHotelBookings(@RequestBody Pageable pageable){
        log.debug("REST Request to getAll HotelBookings: {} ",pageable);
        Page<HotelBooking> result = hotelBookingService.getAll(pageable);
        return ResponseEntity
                .ok()
                .body(result.getContent());
    }

    @GetMapping("/hotel-bookings/{id}")
    public ResponseEntity<HotelBooking> findHotelBookingById(@PathVariable("id") Long id){
        log.debug("REST Request  to find HotelBooking ById: {} ",id);
        HotelBooking result = hotelBookingService.findById(id).get();
        return ResponseEntity
                .ok()
                .body(result);
    }

    @DeleteMapping("/hotel-bookings/{id}")
    public ResponseEntity<?> deleteHotelBookingById(@PathVariable("id") Long id){
        log.debug("REST Request to delete HotelBooking: {} ",id);
        hotelBookingService.delete(id);
        return ResponseEntity
                .ok()
                .build();
    }
}
