package com.sunglowsys.resource;

import com.sunglowsys.domain.RoomType;
import com.sunglowsys.service.RoomTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomTypeResource {

    private final Logger log = LoggerFactory.getLogger(RoomTypeResource.class);

    private final RoomTypeService roomTypeService;

    public RoomTypeResource(RoomTypeService roomTypeService) {
        this.roomTypeService = roomTypeService;
    }

    @PostMapping("/room-types")
    public ResponseEntity<RoomType> createRoomType(@RequestBody RoomType roomType) throws URISyntaxException {
        log.debug("REST Request to save RoomType : {} ", roomType);
        RoomType result = roomTypeService.save(roomType);
        return ResponseEntity
                .created(new URI("/api/room-types" + result.getId()))
                .body(result);

        }

    @PutMapping("/roomTypes/{id}")
    public ResponseEntity<?> updateRoomType(@RequestBody RoomType roomType,Integer id){
        log.debug("REST Request to update RoomType : {} ", roomType);
        RoomType result = roomTypeService.update(roomType,id);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/roomTypes")
    public ResponseEntity<List<RoomType>> findAllRoomType(@RequestBody RoomType roomType){
        log.debug("REST Request to findAll RoomType : {}");
        List<RoomType> result = roomTypeService.getAll();
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/roomTypes/{id}")
    public ResponseEntity<?> findRoomTypeById(@PathVariable Integer id){
        log.debug("REST Request to findRoomTypeById : {} ", id);
        roomTypeService.findById(id);
        return ResponseEntity
                .ok()
                .body(id);
    }

    @DeleteMapping("/roomTypes/{id}")
    public ResponseEntity<?> deleteRoomTypeById(@PathVariable Integer id){
        log.debug("REST Request to delete RoomType : {} ", id);
        roomTypeService.delete(id);
        return ResponseEntity
                .ok()
                .body(id);
    }

}
