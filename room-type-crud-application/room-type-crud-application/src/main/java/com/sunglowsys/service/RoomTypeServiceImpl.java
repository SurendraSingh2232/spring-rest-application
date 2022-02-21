package com.sunglowsys.service;

import com.sunglowsys.domain.RoomType;
import com.sunglowsys.repository.RoomTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class
RoomTypeServiceImpl implements RoomTypeService{

    private final Logger log = LoggerFactory.getLogger(RoomTypeService.class);

    private final RoomTypeRepository roomTypeRepository;

    public RoomTypeServiceImpl(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    @Override
    public RoomType save(RoomType roomType) {
        log.debug("Request to save RoomType : {}", roomType);
        return roomTypeRepository.save(roomType);
    }

    @Override
    public RoomType update(RoomType roomType, Integer id) {
        log.debug("Request to save roomType : {}", roomType);
        RoomType result = roomTypeRepository.findById(id).get();
        result.setName(roomType.getName());
        return roomTypeRepository.save(roomType);
    }

    @Override
    public List<RoomType> getAll() {
        log.debug("Request to getAllRoomType : {} ");
        return roomTypeRepository.findAll();
    }

    @Override
    public RoomType findById(Integer id) {
        log.debug("Request to findRoomTypeById: {} ", id);
        return roomTypeRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        log.debug("Request to deleteRoomTypeById: {}", id);
        roomTypeRepository.deleteById(id);

    }
}
