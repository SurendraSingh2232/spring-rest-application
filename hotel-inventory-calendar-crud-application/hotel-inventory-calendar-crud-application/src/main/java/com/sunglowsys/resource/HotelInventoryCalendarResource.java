package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelInventoryCalendar;
import com.sunglowsys.resource.util.BadRequestException;
import com.sunglowsys.service.HotelInventoryCalendarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelInventoryCalendarResource {

    private final Logger log = LoggerFactory.getLogger(HotelInventoryCalendarResource.class);

    private final HotelInventoryCalendarService hotelInventoryCalendarService;

    public HotelInventoryCalendarResource(HotelInventoryCalendarService hotelInventoryCalendarService) {
        this.hotelInventoryCalendarService = hotelInventoryCalendarService;
    }

    @PostMapping("/hotel-inventory-calendars")
    public ResponseEntity<?> createHotelInventoryCalendars(@RequestBody HotelInventoryCalendar hotelInventoryCalendar) throws URISyntaxException{
        log.debug("REST request to create HotelInventoryCalendars : {}", hotelInventoryCalendar);
        if (hotelInventoryCalendar.getId() != null){
            throw new BadRequestException("Id should be null in create api call ");
        }
        HotelInventoryCalendar result = hotelInventoryCalendarService.save(hotelInventoryCalendar);
        return ResponseEntity
                .ok()
                .body(result);
    }
    @PutMapping("/hotel-inventory-calendars/{id}")
    public ResponseEntity<?> updateHotelInventoryCalendars(@RequestBody HotelInventoryCalendar hotelInventoryCalendar,@PathVariable("id") Integer id) throws URISyntaxException {
        log.debug("REST request to update HotelInventoryCalendar : {}",hotelInventoryCalendar);
        if (hotelInventoryCalendar.getId() == null){
            throw new BadRequestException("Id should not be null in update api call");
        }
        hotelInventoryCalendarService.update(hotelInventoryCalendar,id);
        return ResponseEntity
                .ok()
                .body(hotelInventoryCalendar);
    }
    @GetMapping("/hotel-inventory-calendars")
    public ResponseEntity<List<HotelInventoryCalendar>> findAllHotelInventoryCalendars(@RequestBody Pageable pageable){
        log.debug("REST request to getAll HotelInventoryCalendars : {}", pageable.toString());
        List<HotelInventoryCalendar> result = hotelInventoryCalendarService.findAll(pageable);
        return ResponseEntity
                .ok()
                .body(result);
    }
    @GetMapping("/hotel-inventory-calendar/{id}")
    public ResponseEntity<?> findHotelInventoryCalendarById(@PathVariable("id") Integer id){
        log.debug("REST request to get HotelInventoryCalendar : {}",id);
        HotelInventoryCalendar result = hotelInventoryCalendarService.findById(id);
        return ResponseEntity
                .ok()
                .body(result);
    }
    @DeleteMapping("/hotel-inventory-calendar/{id}")
    public ResponseEntity<Void> deleteHotelInventoryCalendarById(@PathVariable("id") Integer id){
        log.debug("REST request to delete HotelInventoryCalendar: {}",id);
        hotelInventoryCalendarService.deleteById(id);
        return ResponseEntity
                .ok()
                .build();
    }
}
