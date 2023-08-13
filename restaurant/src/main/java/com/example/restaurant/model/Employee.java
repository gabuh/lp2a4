package com.example.restaurant.model;

import com.example.restaurant.dto.EmployeeResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String cpf;
    private String name;

    public Employee(EmployeeResponseDTO employeeResponseDTO) {
        this.cpf = employeeResponseDTO.cpf();
        this.name = employeeResponseDTO.name();
    }
}
