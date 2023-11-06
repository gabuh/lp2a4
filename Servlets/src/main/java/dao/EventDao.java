package dao;

import jakarta.persistence.PersistenceContext;
import model.Event;

import java.util.ArrayList;

public interface EventDao {

    @PersistenceContext
    boolean create(Event event);

    @PersistenceContext
    ArrayList<Event> getEvents(String username);


}
