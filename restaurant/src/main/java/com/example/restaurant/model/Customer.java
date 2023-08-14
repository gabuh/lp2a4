package com.example.restaurant.model;


import com.example.restaurant.dto.CostomerResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "customers")
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;


    public Customer(CostomerResponseDTO costomerResponseDTO) {
        this.address = costomerResponseDTO.address();
        this.name = costomerResponseDTO.name();
    }
}
