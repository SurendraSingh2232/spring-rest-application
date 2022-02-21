package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelRatePlanCalendar;
import com.sunglowsys.service.HotelRatePlanCalendarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelRatePlanCalendarResource {

    private final HotelRatePlanCalendarService hotelRatePlanCalendarService;

    public HotelRatePlanCalendarResource(HotelRatePlanCalendarService hotelRatePlanCalendarService) {
        this.hotelRatePlanCalendarService = hotelRatePlanCalendarService;
    }

    @PostMapping("/hotel-rate-plan-calendars")
    public ResponseEntity<?> createHotelRatePlanCalendar(@RequestBody HotelRatePlanCalendar hotelRatePlanCalendar){
        HotelRatePlanCalendar result = hotelRatePlanCalendarService.save(hotelRatePlanCalendar);
        return ResponseEntity.ok().body(result);
    }
    @PutMapping("/hotel-rate-plan-calendars/{id}")
    public ResponseEntity<?> updateHotelRatePlanCalendar(@RequestBody HotelRatePlanCalendar hotelRatePlanCalendar, @PathVariable("id") Integer id){
        HotelRatePlanCalendar result = hotelRatePlanCalendarService.update(hotelRatePlanCalendar,id);
        return ResponseEntity.ok().body(result);

    }
    @GetMapping("/hotel-rate-plan-calendars")
    public ResponseEntity<List<HotelRatePlanCalendar>> findAllHotelRatePlanCalendar(){
        List<HotelRatePlanCalendar> result = hotelRatePlanCalendarService.getAll();
        return ResponseEntity.ok().body(result);
    }
    @GetMapping("/hotel-rate-plan-calendars/{id}")
    public ResponseEntity<?> findHotelRatePlanCalendarById(@PathVariable("id") Integer id){
        HotelRatePlanCalendar result = hotelRatePlanCalendarService.find(id);
        return ResponseEntity.ok().body(result);
    }
    @DeleteMapping("/hotel-rate-plan-calendars/{id}")
    public ResponseEntity<?> deleteHotelRatePlanCalendarById(@PathVariable("id") Integer id){
        hotelRatePlanCalendarService.delete(id);
        return ResponseEntity.ok().body(id);
    }

}
