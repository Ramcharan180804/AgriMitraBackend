package org.example.service;

import org.example.entity.Evaluation;
import org.example.repository.EvaluationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;

    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    public Evaluation saveEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    public List<Evaluation> getEvaluationsByFarm(Integer farmId) {
        return evaluationRepository.findByFarmId(farmId);
    }
}