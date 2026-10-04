package org.example.ai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Map;

@Service
public class AiPredictionService {

    private final RestClient restClient;

    @Value("${ai.service.url}")
    private String aiServiceUrl;

    public AiPredictionService(RestClient restClient) {
        this.restClient = restClient;
    }

    public String predictCrop(Map<String, Object> sensorData) {

        return restClient.post()
                .uri(aiServiceUrl + "/predict")
                .body(sensorData)
                .retrieve()
                .body(String.class);
    }
}