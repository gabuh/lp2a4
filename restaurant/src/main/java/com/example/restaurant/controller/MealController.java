package com.example.restaurant.controller;

import com.example.restaurant.model.Meal;
import com.example.restaurant.dto.MealResponseDTO;
import com.example.restaurant.repository.CostumeRepository;
import com.example.restaurant.repository.MealRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("meal")
public class MealController {

    private MealRepository mealRepository;

    @GetMapping
    public List<MealResponseDTO> getAll() {
        return mealRepository.findAll().stream().map(MealResponseDTO::new).toList();
    }

    @PostMapping
    public void addMeal(@RequestBody MealResponseDTO data){
        mealRepository.save(new Meal(data));
    }

    @DeleteMapping("/{id}")
    public void deleteMeal(@PathVariable Long id){
        mealRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void editMeal(@RequestBody MealResponseDTO mealResponseDTO, @PathVariable Long id){
        Meal m = new Meal();
        m.setId(id);
        m.setName(mealResponseDTO.name());
        m.setDescription(mealResponseDTO.description());
        m.setPrice(mealResponseDTO.price());
        m.setType(mealResponseDTO.type());
        mealRepository.save(m);
    }



}//--end
