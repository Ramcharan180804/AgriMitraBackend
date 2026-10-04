package org.example.controller;

import org.example.entity.Farm;
import org.example.service.FarmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farms")
public class FarmController {

    private final FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @PostMapping
    public Farm createFarm(@RequestBody Farm farm) {
        return farmService.saveFarm(farm);
    }

    @GetMapping("/user/{userId}")
    public List<Farm> getFarmsByUser(@PathVariable Integer userId) {
        return farmService.getFarmsByUser(userId);
    }
}