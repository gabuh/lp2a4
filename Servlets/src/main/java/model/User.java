package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
