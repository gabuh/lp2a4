package com.example.restaurant.controller;

import com.example.restaurant.model.Meal;
import com.example.restaurant.dto.MealResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("meal")
public class MealController {
    private final List<Meal> meals = new ArrayList<>();

    @GetMapping
    public List<MealResponseDTO> getAll() {
        return meals.stream().map(MealResponseDTO::new).toList();
    }

    @PostMapping
    public void addMeal(@RequestBody MealResponseDTO data){
        meals.add(new Meal(data));
    }

    @DeleteMapping("/{id}")
    public void deleteMeal(@PathVariable Long id){
            meals.removeIf( me -> me.getId().equals(id));
    }

    @PutMapping("/{id}")
    public void editMeal(@RequestBody MealResponseDTO mealResponseDTO, @PathVariable Long id){
        for (Meal m: meals) {
            if (m.getId().equals(id)){
                m.setName(mealResponseDTO.name());
                m.setDescription(mealResponseDTO.description());
                m.setPrice(mealResponseDTO.price());
                m.setType(mealResponseDTO.type());
            }
        }
    }



}//--end
