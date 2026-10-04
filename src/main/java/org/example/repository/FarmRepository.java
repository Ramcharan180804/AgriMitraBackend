package org.example.repository;

import org.example.entity.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FarmRepository extends JpaRepository<Farm, Integer> {

    List<Farm> findByUserId(Integer userId);
}