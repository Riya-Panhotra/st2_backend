
package com.fullstackapp.Trail.Repository;


import com.fullstackapp.Trail.Model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserRepostory {
    @PersistenceUnit(unitName = "allusers")
    private EntityManagerFactory entityManagerFactory;
    public List<User> getallusers()
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<User> query = entityManager.createQuery("SELECT u from User u",User.class);
        List<User> result = query.getResultList();
        return result;
    }
    public void adduser(User newuser)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(newuser);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
            transaction.rollback();
        }
    }

}