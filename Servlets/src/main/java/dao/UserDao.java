package dao;

import jakarta.persistence.PersistenceContext;
import model.User;

import java.util.ArrayList;

public interface UserDao {
    @PersistenceContext
    boolean create (User user);
    @PersistenceContext
    ArrayList<User> getUsers();
    boolean isValidUser(String username, String password);

    @PersistenceContext
    void update(User user);

    @PersistenceContext
    public User getUserByUsername(String username);

}
