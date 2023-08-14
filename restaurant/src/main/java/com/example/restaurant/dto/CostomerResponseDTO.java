package com.example.restaurant.dto;

import com.example.restaurant.model.Address;
import com.example.restaurant.model.Customer;

public record CostomerResponseDTO(String name,
                                  Address address
) {
    public CostomerResponseDTO(Customer customer) {
        this(
            customer.getName(),
            customer.getAddress()
        );
    }
}
