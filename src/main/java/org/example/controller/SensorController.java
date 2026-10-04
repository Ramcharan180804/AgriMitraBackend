package org.example.controller;

import org.example.entity.SensorData;
import org.example.service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @PostMapping
    public SensorData saveSensorData(@RequestBody SensorData sensorData) {
        return sensorService.saveSensorData(sensorData);
    }

    @GetMapping("/farm/{farmId}")
    public List<SensorData> getSensorDataByFarm(
            @PathVariable Integer farmId) {

        return sensorService.getSensorDataByFarm(farmId);
    }
}