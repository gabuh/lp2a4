package com.example.restaurant.model;

import com.example.restaurant.dto.MealResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    private static Long idBase = 0L;
    private Long id;
    private String name;
    private String description;
    private double price;
    private MealType type;

    public Meal(MealResponseDTO data){
        this.name = data.name();
        this.id = idBase++;
        this.description = data.description();
        this.type = data.type();
        this.price = data.price();
    }


}
