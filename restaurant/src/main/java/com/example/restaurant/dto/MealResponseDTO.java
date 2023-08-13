package com.example.restaurant.dto;

import com.example.restaurant.model.Meal;
import com.example.restaurant.model.MealType;


public record MealResponseDTO(Long id,
                              String name,
                              String description,
                              double price,
                              MealType type){
    public MealResponseDTO(Meal meal){
        this(meal.getId(),
            meal.getName(),
            meal.getDescription(),
            meal.getPrice(),
            meal.getType());
    }
}
