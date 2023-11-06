package dao.impl;

import config.JpaFactoryConnection;
import dao.UserDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import model.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {

    public boolean create(User user) {
        EntityTransaction transaction = JpaFactoryConnection.getEntityManager().getTransaction();
        try{
            transaction.begin();
            JpaFactoryConnection.getEntityManager().persist(user);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
        }
        return true;
    }

    public ArrayList<User> getUsers() {
        return (ArrayList<User>) JpaFactoryConnection.getEntityManager().createQuery("SELECT u FROM User AS u",User.class).getResultList();
    }



    public User getUserByUsername(String username){
       return JpaFactoryConnection.getEntityManager().createQuery("SELECT u FROM User AS u WHERE u.name = :username", User.class).setParameter("username",username).getSingleResult();
    }

    public User getUserById(long id){
        return JpaFactoryConnection.getEntityManager().find(User.class,id);
    }

    public boolean isValidUser(String username, String password) {
        try {
            JpaFactoryConnection.getEntityManager().createQuery("SELECT u FROM User AS u WHERE u.name = :username AND u.password = :password ",User.class).setParameter("username",username).setParameter("password",password).getSingleResult();
        }catch (NoResultException e){
            return false;
        }
        return true;
    }


    public void update(User user) {
        JpaFactoryConnection.getEntityManager().merge(user);
    }


}
