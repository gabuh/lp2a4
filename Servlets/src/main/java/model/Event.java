package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "event")
public class Event {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Column
    private Date date;

    @Column
    private String description;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    private User user;

    public Event(Date date, String description) {
        this.date = date;
        this.description = description;
    }


}
