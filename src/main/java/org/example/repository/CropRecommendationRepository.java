package org.example.repository;

import org.example.entity.CropRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CropRecommendationRepository
        extends JpaRepository<CropRecommendation, Integer> {

    List<CropRecommendation> findByFarmId(Integer farmId);
}