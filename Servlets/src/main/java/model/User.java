package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "person")
public class Person {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String email;


    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
