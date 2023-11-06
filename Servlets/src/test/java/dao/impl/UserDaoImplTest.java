package dao.impl;

import dao.UserDao;
import junit.framework.TestCase;
import model.Event;
import model.User;

import java.util.*;


public class UserDaoImplTest extends TestCase {

    public boolean insertUser(){
        UserDao userDao = new UserDaoImpl();
        Event event1 = new Event(new Date(),"OK1");
        Event event2 = new Event(new Date(),"OK2");
        Event event3 = new Event(new Date(),"OK3");
//        Set<Event> events = new HashSet<>();
//        events.add(event1);
//        events.add(event2);
//        events.add(event3);
        User user = new User("Gabriel","gabriel@email.com", "password");
        user.addEvent(event1);
        user.addEvent(event2);
        user.addEvent(event3);


        return userDao.create(user);
    }


    public void testGetByUsername(){
//        assertTrue(insertUser());
        Set<Event> events = new UserDaoImpl().getUserByUsername("Gabriel").getEvents();
        for (Event e:
             events) {
            System.out.println(e.getId());
        }
        assertEquals(3,new UserDaoImpl().getUserByUsername("Gabriel").getEvents().size() );
    }




    public void testValidUser(){
        UserDao userDao = new UserDaoImpl();
//        assertTrue(insertUser());
        String validUsername = "Gabriel";
        String validPassword = "password";
        assertTrue(userDao.isValidUser(validUsername, validPassword));
    }

    public void testInvalidUser(){
        UserDao userDao = new UserDaoImpl();
        String invalidUsername = "naive";
        String invalidPassword =  "man-what?";
        assertFalse(userDao.isValidUser(invalidUsername, invalidPassword));
    }

    public void testEmptyUsers(){
        assertEquals(new ArrayList<User>(), new UserDaoImpl().getUsers());
    }

}