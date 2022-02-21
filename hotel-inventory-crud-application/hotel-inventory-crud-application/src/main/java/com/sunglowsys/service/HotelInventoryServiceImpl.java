package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventory;
import com.sunglowsys.repository.HotelInventoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotelInventoryServiceImpl implements HotelInventoryService{
    private final Logger log = LoggerFactory.getLogger(HotelInventoryServiceImpl.class);

    private final HotelInventoryRepository hotelInventoryRepository;

    public HotelInventoryServiceImpl(HotelInventoryRepository hotelInventoryRepository) {
        this.hotelInventoryRepository = hotelInventoryRepository;
    }

    @Override
    public HotelInventory saveHotelInventory(HotelInventory hotelInventory) {
        log.debug("Request to save HotelInventory: {} ",hotelInventory);
        return hotelInventoryRepository.save(hotelInventory);
    }

    @Override
    public HotelInventory updateHotelInventory(HotelInventory hotelInventory, Integer id) {
        log.debug("Request to update HotelInventory: {}  ",hotelInventory);
        HotelInventory result = hotelInventoryRepository.getById(id);
        return hotelInventoryRepository.save(result);
    }

    @Override
    public Page<HotelInventory> findAll(Pageable pageable) {
        log.debug("Request to getAll HotelInventories: {}",pageable);
        return hotelInventoryRepository.findAll(pageable);
    }

    @Override
    public Optional<HotelInventory> findById(Integer id) {
        log.debug("Request to find HotelInventory ById: {}",id);
        return hotelInventoryRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        log.debug("Request to delete HotelInventory: {} ",id);
        hotelInventoryRepository.deleteById(id);
    }
}
