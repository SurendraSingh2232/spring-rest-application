package com.sunglowsys.resource;
import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.service.RatePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RatePlanResource {

    @Autowired
    private RatePlanService ratePlanService;

    @PostMapping("/rate-plans")
    public ResponseEntity<?> create(@RequestBody RatePlan ratePlan){
        RatePlan result = ratePlanService.save(ratePlan);
        return  ResponseEntity.ok().body(result);
    }

    @PutMapping("/rate-plans/{id}")
    public ResponseEntity<?> update(@RequestBody RatePlan ratePlan,@PathVariable("id") Integer id){
        RatePlan result = ratePlanService.findById(id);
        return ResponseEntity.ok().body(result);
    }
    @GetMapping("/rate-plans")
    public ResponseEntity<List<RatePlan>> findAll(@RequestBody RatePlan ratePlan){
        List<RatePlan> result = ratePlanService.findAll();
        return ResponseEntity.ok().body(result);
    }
    @GetMapping("/rate-plans/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        RatePlan ratePlan = ratePlanService.findById(id);
        return ResponseEntity.ok().body(id);

    }
    @DeleteMapping("/rate-plans/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Integer id){
        ratePlanService.deleteById(id);
        return ResponseEntity.ok().body(id);
    }


}
