package org.example.service;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {

    private final UserRepository userRepository;

    public FarmerService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllFarmers() {
        return userRepository.findAll();
    }

    public User getFarmerById(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Farmer not found"));
    }
}