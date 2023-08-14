package com.example.restaurant.controller;

import com.example.restaurant.dto.CostumerResponseDTO;
import com.example.restaurant.model.Costumer;
import com.example.restaurant.repository.CostumeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/costumer")
public class CostumerController {
    private CostumeRepository costumeRepository;

    @GetMapping
    public List<CostumerResponseDTO> getAll(){
        return costumeRepository.findAll().stream().map(CostumerResponseDTO::new).toList();
    }

    @PostMapping
    public void addCostumer(@RequestBody  CostumerResponseDTO costumerResponseDTO){
        costumeRepository.save(new Costumer(costumerResponseDTO));
    }

    @DeleteMapping("/{id}")
    public void removeCostumer(@PathVariable Long id){
        costumeRepository.deleteById(id);
    }


    @PutMapping("/{id}")
    public void updateCostumer(@RequestBody CostumerResponseDTO costumerResponseDTO,@PathVariable Long id){
        Costumer c = new Costumer();
        c.setId(id);
        c.setName(costumerResponseDTO.name());
        c.setAddress(costumerResponseDTO.address());
        costumeRepository.save(c);
    }


}
