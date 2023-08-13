package com.example.restaurant.controller;

import com.example.restaurant.dto.EmployeeResponseDTO;
import com.example.restaurant.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

private final List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<EmployeeResponseDTO> getEmployees() {
        return employees.stream().map(EmployeeResponseDTO::new).toList();
    }


    @PostMapping
    public void addEmployee(@RequestBody EmployeeResponseDTO employeeResponseDTO){
        employees.add(new Employee(employeeResponseDTO));
    }


    @DeleteMapping("/{cpf}")
    public void deleteEmployee(@PathVariable String cpf){
        employees.removeIf(em -> em.getCpf().equals(cpf));
    }

    @PutMapping("/{cpf}")
    public void editEmployee(@RequestBody EmployeeResponseDTO employeeResponseDTO, @PathVariable String cpf){
        for (Employee em : employees){
            if (em.getCpf().equals(cpf)){
                em.setName(employeeResponseDTO.name());
            }
        }

    }

} //--end

