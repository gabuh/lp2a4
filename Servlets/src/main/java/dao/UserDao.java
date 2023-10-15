package dao;

import model.User;

import java.util.ArrayList;

public interface UserDao {
    void create (User user);
    ArrayList<User> getUsers();

}
