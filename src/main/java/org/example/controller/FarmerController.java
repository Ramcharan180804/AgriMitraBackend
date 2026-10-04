package org.example.controller;

import org.example.entity.User;
import org.example.service.FarmerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {

    private final FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    // Get all farmers
    @GetMapping
    public List<User> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    // Get farmer by ID
    @GetMapping("/{id}")
    public User getFarmerById(@PathVariable Integer id) {
        return farmerService.getFarmerById(id);
    }
}