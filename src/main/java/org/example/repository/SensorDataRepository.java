package org.example.repository;

import org.example.entity.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorDataRepository extends JpaRepository<SensorData, Integer> {

    List<SensorData> findByFarmId(Integer farmId);
}