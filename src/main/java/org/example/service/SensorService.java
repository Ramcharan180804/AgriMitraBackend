package org.example.service;

import org.example.entity.SensorData;
import org.example.repository.SensorDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorDataRepository sensorDataRepository;

    public SensorService(SensorDataRepository sensorDataRepository) {
        this.sensorDataRepository = sensorDataRepository;
    }

    public SensorData saveSensorData(SensorData sensorData) {
        return sensorDataRepository.save(sensorData);
    }

    public List<SensorData> getSensorDataByFarm(Integer farmId) {
        return sensorDataRepository.findByFarmId(farmId);
    }
}