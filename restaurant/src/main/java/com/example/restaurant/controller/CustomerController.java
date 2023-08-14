package com.example.restaurant.controller;

import com.example.restaurant.dto.CostomerResponseDTO;
import com.example.restaurant.model.Customer;
import com.example.restaurant.repository.CostumeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private CostumeRepository costumeRepository;

    @GetMapping
    public List<CostomerResponseDTO> getAll(){
        return costumeRepository.findAll().stream().map(CostomerResponseDTO::new).toList();
    }

    @PostMapping
    public void addCostumer(@RequestBody CostomerResponseDTO costomerResponseDTO){
        costumeRepository.save(new Customer(costomerResponseDTO));
    }

    @DeleteMapping("/{id}")
    public void removeCostumer(@PathVariable Long id){
        costumeRepository.deleteById(id);
    }


    @PutMapping("/{id}")
    public void updateCostumer(@RequestBody CostomerResponseDTO costomerResponseDTO, @PathVariable Long id){
        Customer c = new Customer();
        c.setId(id);
        c.setName(costomerResponseDTO.name());
        c.setAddress(costomerResponseDTO.address());
        costumeRepository.save(c);
    }


}
