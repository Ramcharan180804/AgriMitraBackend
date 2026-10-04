package org.example.repository;

import org.example.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {

    List<Evaluation> findByFarmId(Integer farmId);
}