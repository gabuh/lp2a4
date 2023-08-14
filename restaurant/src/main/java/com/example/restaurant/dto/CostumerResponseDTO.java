package com.example.restaurant.dto;

import com.example.restaurant.model.Address;
import com.example.restaurant.model.Costumer;

public record CostumerResponseDTO(String name,
                                  Address address
) {
    public CostumerResponseDTO(Costumer costumer) {
        this(
            costumer.getName(),
            costumer.getAddress()
        );
    }
}
