package com.example.restaurant.model;

import com.example.restaurant.dto.MealResponseDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "meals")
@Entity(name = "meals")
public class Meal {
    @Id
    @GeneratedValue()
    private Long id;
    @Column
    private String name;
    @Column
    private String description;    
    @Column
    private double price;
    @Column
    private MealType type;

    public Meal(MealResponseDTO data){
        this.name = data.name();
        this.description = data.description();
        this.type = data.type();
        this.price = data.price();
    }


}
