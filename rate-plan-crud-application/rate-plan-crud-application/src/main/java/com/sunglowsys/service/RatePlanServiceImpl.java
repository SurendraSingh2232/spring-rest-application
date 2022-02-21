package com.sunglowsys.service;

import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.repository.RatePlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatePlanServiceImpl implements RatePlanService{

    private final RatePlanRepository ratePlanRepository;

    public RatePlanServiceImpl(RatePlanRepository ratePlanRepository) {
        this.ratePlanRepository = ratePlanRepository;
    }

    @Override
    public RatePlan save(RatePlan ratePlan) {
        return ratePlanRepository.save(ratePlan);
    }

    @Override
    public RatePlan updateById(RatePlan ratePlan, Integer id) {
        RatePlan result = ratePlanRepository.findById(id).get();
        result.setName(result.getName());
        result.setHotelId(result.getHotelId());
        result.setRoomTypeId(result.getRoomTypeId());
        return ratePlanRepository.save(result);
    }

    @Override
    public List<RatePlan> findAll() {
        return ratePlanRepository.findAll();
    }

    @Override
    public RatePlan findById(Integer id) {
        return ratePlanRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        ratePlanRepository.deleteById(id);

    }
}
