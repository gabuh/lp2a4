package dao.impl;

import config.JpaFactoryConnection;
import dao.UserDao;
import jakarta.persistence.EntityTransaction;
import model.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    @Override
    public void create(User user) {
        EntityTransaction transaction = JpaFactoryConnection.getEntityManager().getTransaction();
        try{
            transaction.begin();
            JpaFactoryConnection.getEntityManager().persist(user);
            transaction.commit();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
        }
    }

    @Override
    public ArrayList<User> getUsers() {
        return (ArrayList<User>) JpaFactoryConnection.getEntityManager().createQuery("SELECT u FROM User AS u",User.class).getResultList();
    }
}
