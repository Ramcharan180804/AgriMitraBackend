package org.example.controller;

import org.example.entity.FarmingActivity;
import org.example.service.FarmingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farming")
public class FarmingController {

    private final FarmingService farmingService;

    public FarmingController(FarmingService farmingService) {
        this.farmingService = farmingService;
    }

    @PostMapping
    public FarmingActivity addActivity(
            @RequestBody FarmingActivity activity) {

        return farmingService.addActivity(activity);
    }

    @GetMapping("/farm/{farmId}")
    public List<FarmingActivity> getActivitiesByFarm(
            @PathVariable Integer farmId) {

        return farmingService.getActivitiesByFarm(farmId);
    }
}