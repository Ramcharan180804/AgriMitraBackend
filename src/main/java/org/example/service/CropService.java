package org.example.service;

import org.example.entity.Crop;
import org.example.repository.CropRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropService {

    private final CropRepository cropRepository;

    public CropService(CropRepository cropRepository) {
        this.cropRepository = cropRepository;
    }

    public Crop saveCrop(Crop crop) {
        return cropRepository.save(crop);
    }

    public List<Crop> getAllCrops() {
        return cropRepository.findAll();
    }

    public Crop getCropById(Integer id) {
        return cropRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Crop not found with id: " + id));
    }
}