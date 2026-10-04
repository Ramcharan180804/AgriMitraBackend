package org.example.controller;

import org.example.entity.Evaluation;
import org.example.service.EvaluationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluations")
public class EvaluationController {

    private final EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @PostMapping
    public Evaluation saveEvaluation(
            @RequestBody Evaluation evaluation) {

        return evaluationService.saveEvaluation(evaluation);
    }

    @GetMapping("/farm/{farmId}")
    public List<Evaluation> getEvaluationsByFarm(
            @PathVariable Integer farmId) {

        return evaluationService.getEvaluationsByFarm(farmId);
    }
}