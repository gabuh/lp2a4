package config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactoryConnection {
    private static EntityManager entityManager;

    public static void connect(){
        try{
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
            entityManager = entityManagerFactory.createEntityManager();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static EntityManager getEntityManager() {
        if(entityManager == null){
            connect();
            return entityManager;
        }
        return entityManager;
    }

}
