package org.example.service;

import org.example.entity.Farm;
import org.example.repository.FarmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmService {

    private final FarmRepository farmRepository;

    public FarmService(FarmRepository farmRepository) {
        this.farmRepository = farmRepository;
    }

    public Farm saveFarm(Farm farm) {
        return farmRepository.save(farm);
    }

    public List<Farm> getFarmsByUser(Integer userId) {
        return farmRepository.findByUserId(userId);
    }
}