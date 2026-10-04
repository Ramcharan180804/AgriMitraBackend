package org.example.repository;

import org.example.entity.FarmingActivity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FarmingActivityRepository extends JpaRepository<FarmingActivity, Integer> {

    List<FarmingActivity> findByFarmId(Integer farmId);
}