package org.example.config;

import org.example.entity.Crop;
import org.example.repository.CropRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initializeCrops(CropRepository cropRepository) {

        return args -> {

            // Create crops using JPA/Hibernate
            createCrop(
                    cropRepository,
                    "Cotton",
                    "Kharif",
                    "Black Soil",
                    "Cotton grows well in deep black soil."
            );

            createCrop(
                    cropRepository,
                    "Chickpea",
                    "Rabi",
                    "Black Soil",
                    "Chickpea grows well in well-drained black soil."
            );

            createCrop(
                    cropRepository,
                    "Sunflower",
                    "Summer",
                    "Black Soil",
                    "Sunflower can be cultivated in black soil."
            );

            createCrop(
                    cropRepository,
                    "Groundnut",
                    "Kharif",
                    "Red Soil",
                    "Groundnut grows well in light and well-drained red soil."
            );

            createCrop(
                    cropRepository,
                    "Ragi",
                    "Rabi",
                    "Red Soil",
                    "Ragi performs well in red soil."
            );

            createCrop(
                    cropRepository,
                    "Watermelon",
                    "Summer",
                    "Red Soil",
                    "Watermelon grows well in warm conditions and red soil."
            );

            createCrop(
                    cropRepository,
                    "Rice",
                    "Kharif",
                    "Alluvial Soil",
                    "Rice grows well in fertile alluvial soil."
            );

            createCrop(
                    cropRepository,
                    "Wheat",
                    "Rabi",
                    "Alluvial Soil",
                    "Wheat grows well in fertile alluvial soil."
            );

            createCrop(
                    cropRepository,
                    "Maize",
                    "Summer",
                    "Alluvial Soil",
                    "Maize grows well in fertile alluvial soil."
            );

            System.out.println("======================================");
            System.out.println("9 crops initialized using Hibernate/JPA");
            System.out.println("======================================");
        };
    }

    private void createCrop(
            CropRepository cropRepository,
            String name,
            String season,
            String soilType,
            String description) {

        Crop crop = new Crop();

        crop.setName(name);
        crop.setSeason(season);
        crop.setSoilType(soilType);
        crop.setDescription(description);

        cropRepository.save(crop);

        System.out.println(
                "Inserted crop: " + name
                        + " | " + season
                        + " | " + soilType
        );
    }
}