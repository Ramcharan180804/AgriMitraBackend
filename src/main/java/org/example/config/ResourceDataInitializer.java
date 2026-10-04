package org.example.config;

import org.example.entity.Resource;
import org.example.repository.ResourceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceDataInitializer {

    @Bean
    CommandLineRunner initializeResources(
            ResourceRepository resourceRepository) {

        return args -> {

            // =========================
            // SEEDS
            // =========================

            createResource(
                    resourceRepository,
                    "Rice Seeds",
                    "Seeds",
                    "High quality rice seeds suitable for cultivation.",
                    850.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Cotton Seeds",
                    "Seeds",
                    "High quality cotton seeds for cotton cultivation.",
                    1200.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Maize Seeds",
                    "Seeds",
                    "Hybrid maize seeds suitable for good yield.",
                    950.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Groundnut Seeds",
                    "Seeds",
                    "Quality groundnut seeds for farming.",
                    750.0,
                    true
            );


            // =========================
            // FERTILIZERS
            // =========================

            createResource(
                    resourceRepository,
                    "Urea",
                    "Fertilizer",
                    "Nitrogen fertilizer commonly used for crop growth.",
                    300.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "DAP",
                    "Fertilizer",
                    "Phosphorus and nitrogen fertilizer for crop development.",
                    1350.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "NPK Fertilizer",
                    "Fertilizer",
                    "Balanced fertilizer containing nitrogen, phosphorus and potassium.",
                    1100.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Organic Fertilizer",
                    "Fertilizer",
                    "Natural fertilizer suitable for organic farming.",
                    600.0,
                    true
            );


            // =========================
            // PESTICIDES
            // =========================

            createResource(
                    resourceRepository,
                    "Insecticide",
                    "Pesticide",
                    "Used for controlling harmful insects affecting crops.",
                    450.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Fungicide",
                    "Pesticide",
                    "Used to control fungal diseases in crops.",
                    500.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Herbicide",
                    "Pesticide",
                    "Used for controlling unwanted weeds.",
                    400.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Crop Sprayer",
                    "Pesticide",
                    "Agricultural sprayer for applying crop protection products.",
                    2500.0,
                    true
            );


            // =========================
            // FARM EQUIPMENT
            // =========================

            createResource(
                    resourceRepository,
                    "Tractor",
                    "Equipment",
                    "Multi-purpose tractor for agricultural operations.",
                    1500.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Cultivator",
                    "Equipment",
                    "Equipment used for preparing and loosening soil.",
                    900.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Plough",
                    "Equipment",
                    "Agricultural equipment used for soil preparation.",
                    700.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Rotavator",
                    "Equipment",
                    "Equipment used for soil tillage and seedbed preparation.",
                    1200.0,
                    true
            );


            // =========================
            // IRRIGATION
            // =========================

            createResource(
                    resourceRepository,
                    "Drip Irrigation Kit",
                    "Irrigation",
                    "Water efficient drip irrigation system for farms.",
                    3500.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Sprinkler System",
                    "Irrigation",
                    "Sprinkler system for efficient field irrigation.",
                    2800.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Water Pump",
                    "Irrigation",
                    "Water pump for agricultural irrigation.",
                    4500.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Irrigation Pipes",
                    "Irrigation",
                    "Pipes used for transporting water to agricultural fields.",
                    1500.0,
                    true
            );


            // =========================
            // HARVESTING
            // =========================

            createResource(
                    resourceRepository,
                    "Crop Harvester",
                    "Harvesting",
                    "Agricultural machine used for harvesting crops.",
                    5000.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Thresher",
                    "Harvesting",
                    "Machine used for separating grains from harvested crops.",
                    3200.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Seed Drill",
                    "Harvesting",
                    "Equipment used for accurate seed placement.",
                    2200.0,
                    true
            );

            createResource(
                    resourceRepository,
                    "Reaper",
                    "Harvesting",
                    "Agricultural machine used for cutting crops.",
                    4000.0,
                    true
            );


            System.out.println(
                    "======================================"
            );

            System.out.println(
                    "24 resources initialized using JPA/Hibernate"
            );

            System.out.println(
                    "======================================"
            );
        };
    }


    private void createResource(
            ResourceRepository resourceRepository,
            String name,
            String type,
            String description,
            Double price,
            Boolean available) {

        Resource resource = new Resource();

        resource.setName(name);
        resource.setType(type);
        resource.setDescription(description);
        resource.setPrice(price);
        resource.setAvailable(available);

        resourceRepository.save(resource);

        System.out.println(
                "Inserted resource: "
                        + name
                        + " | "
                        + type
                        + " | ₹"
                        + price
        );
    }
}