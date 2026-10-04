package org.example.controller;

import org.example.entity.Resource;
import org.example.service.ResourceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    // Create resource
    @PostMapping
    public Resource createResource(@RequestBody Resource resource) {
        return resourceService.saveResource(resource);
    }

    // Get all resources
    @GetMapping
    public List<Resource> getAllResources() {
        return resourceService.getAllResources();
    }

    // Get resource by ID
    @GetMapping("/{id}")
    public Resource getResourceById(
            @PathVariable Integer id) {

        return resourceService.getResourceById(id);
    }
}