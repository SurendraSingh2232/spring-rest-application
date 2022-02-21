package com.sunglowsys.service;

import com.sunglowsys.domain.RatePlan;

import java.util.List;

public interface RatePlanService {

    RatePlan save(RatePlan ratePlan);

    RatePlan updateById(RatePlan ratePlan,Integer id);

    List<RatePlan> findAll();

    RatePlan findById(Integer id);

    void deleteById(Integer id);
}
