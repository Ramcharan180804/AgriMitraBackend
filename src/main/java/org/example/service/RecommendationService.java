package org.example.service;

import org.example.entity.CropRecommendation;
import org.example.repository.CropRecommendationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    private final CropRecommendationRepository repository;

    public RecommendationService(CropRecommendationRepository repository) {
        this.repository = repository;
    }

    public CropRecommendation saveRecommendation(
            CropRecommendation recommendation) {

        return repository.save(recommendation);
    }

    public List<CropRecommendation> getRecommendationsByFarm(
            Integer farmId) {

        return repository.findByFarmId(farmId);
    }
}