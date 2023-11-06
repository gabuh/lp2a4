package model;

import jakarta.persistence.*;
import lombok.*;


import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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
    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Event> events;

    public User(long id, String name, String email, Set<Event> events) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.events = events;
    }



    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.events = new HashSet<>();
    }

    public User(String name, String email, String password, Set<Event> eventsList) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.events = eventsList;
        for (Event e:
                eventsList) {
            e.setUser(this);
        }
    }


    public void addEvent(Event event){
        events.add(event);
        event.setUser(this);
    }

    public void removeEvent(Event event){
        events.remove(event);
        event.setUser(null);
    }


}
