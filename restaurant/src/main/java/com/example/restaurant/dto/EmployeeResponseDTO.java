package com.example.restaurant.dto;

import com.example.restaurant.model.Employee;

public record EmployeeResponseDTO(String cpf,
                                  String name
                                  ) {
    public EmployeeResponseDTO(Employee employee){
        this(
                employee.getCpf(),
                employee.getName()
        );
    }
}
