package org.example.controller;

import org.example.entity.CropRecommendation;
import org.example.service.RecommendationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(
            RecommendationService recommendationService) {

        this.recommendationService = recommendationService;
    }

    @PostMapping("/predict")
    public CropRecommendation saveRecommendation(
            @RequestBody CropRecommendation recommendation) {

        return recommendationService.saveRecommendation(recommendation);
    }

    @GetMapping("/farm/{farmId}")
    public List<CropRecommendation> getRecommendationsByFarm(
            @PathVariable Integer farmId) {

        return recommendationService
                .getRecommendationsByFarm(farmId);
    }
}