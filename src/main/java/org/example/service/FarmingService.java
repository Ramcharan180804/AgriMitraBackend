package org.example.service;

import org.example.entity.FarmingActivity;
import org.example.repository.FarmingActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmingService {

    private final FarmingActivityRepository farmingActivityRepository;

    public FarmingService(FarmingActivityRepository farmingActivityRepository) {
        this.farmingActivityRepository = farmingActivityRepository;
    }

    public FarmingActivity addActivity(FarmingActivity activity) {
        return farmingActivityRepository.save(activity);
    }

    public List<FarmingActivity> getActivitiesByFarm(Integer farmId) {
        return farmingActivityRepository.findByFarmId(farmId);
    }
}