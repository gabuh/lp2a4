package dao.impl;

import config.JpaFactoryConnection;
import dao.EventDao;
import dao.UserDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import model.Event;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class EventDaoImpl implements EventDao {


    @Override
    public boolean create(Event event) {
        EntityTransaction transaction = JpaFactoryConnection.getEntityManager().getTransaction();
        try {
            transaction.begin();
            JpaFactoryConnection.getEntityManager().persist(event);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
        }
        return true;
    }

    @Override
    public ArrayList<Event> getEvents(String username) {
        UserDao userDao = new UserDaoImpl();
        User user =  userDao.getUserByUsername(username);
        return (ArrayList<Event>) JpaFactoryConnection.getEntityManager().createQuery("SELECT e FROM Event AS e WHERE e.user.id = :user_id",Event.class).setParameter("user_id",user.getId()).getResultList();
    }



}
