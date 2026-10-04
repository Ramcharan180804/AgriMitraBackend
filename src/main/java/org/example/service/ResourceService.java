package org.example.service;

import org.example.entity.Resource;
import org.example.repository.ResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    // Create resource
    public Resource saveResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    // Get all resources
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    // Get resource by ID
    public Resource getResourceById(Integer id) {
        return resourceRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Resource not found with id: " + id
                        )
                );
    }
}