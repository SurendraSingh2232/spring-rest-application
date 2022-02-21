package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.service.HotelInventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelInventoryResource {

    private final Logger log = LoggerFactory.getLogger(HotelInventoryResource.class);

    private final HotelInventoryService hotelInventoryService;

    public HotelInventoryResource(HotelInventoryService hotelInventoryService) {
        this.hotelInventoryService = hotelInventoryService;
    }

    @PostMapping("/hotelInventories")
    public ResponseEntity<HotelInventory> createHotelInventories(@RequestBody HotelInventory hotelInventory) {
        log.debug("REST Request to save HotelInventories: {}",hotelInventory);
        HotelInventory result = hotelInventoryService.saveHotelInventory(hotelInventory);
        return ResponseEntity.ok().body(result);
    }

    @PutMapping("/hotelInventories/{id}")
    public ResponseEntity<HotelInventory> updateHotelInventory(@RequestBody HotelInventory hotelInventory, @PathVariable("id") Integer id) {
        log.debug("REST Request to update HotelInventories: {}",hotelInventory);
        hotelInventoryService.updateHotelInventory(hotelInventory, id);
        return ResponseEntity.ok().body(hotelInventory);
    }

    @GetMapping("/hotelInventories")
    public ResponseEntity<List<HotelInventory>> findAllHotelInventories(@RequestBody Pageable pageable) {
        log.debug("REST Request to getAll HotelInventories: {}",pageable);
        Page<HotelInventory> result = hotelInventoryService.findAll(pageable);
        return ResponseEntity.ok().body(result.getContent());
    }

    @GetMapping("/hotelInventories/{id}")
    public ResponseEntity<HotelInventory> findById(@PathVariable("id") Integer id) {
        HotelInventory result = hotelInventoryService.findById(id);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/hotelInventories/{id}")
    public ResponseEntity<?> deleteByid(@PathVariable("id") Integer id) {
        hotelInventoryService.deleteById(id);
        return ResponseEntity.ok().body(id);

    }
}


