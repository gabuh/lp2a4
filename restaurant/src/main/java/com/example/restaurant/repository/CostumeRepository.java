package com.example.restaurant.repository;

import com.example.restaurant.model.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumeRepository extends JpaRepository<Costumer, Long> {
}
