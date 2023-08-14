package com.example.restaurant.repository;

import com.example.restaurant.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumeRepository extends JpaRepository<Customer, Long> {
}
