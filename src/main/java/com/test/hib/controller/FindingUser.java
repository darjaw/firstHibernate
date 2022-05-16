package com.test.hib.controller;

import com.test.hib.model.User;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.sql.internal.SQLQueryParser;

import javax.management.Query;
import java.util.List;

public class FindingUser {
    public FindingUser() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        String sql = """
                SELECT * FROM user u
                """;

        List<User> users = session.createNativeQuery(sql, User.class).getResultList();

        for (User user : users) {
            System.out.println(user.getUserId()
                    + ". " + user.getFirstName()
                    + " " + user.getLastName());
        }

        //Close resources
        tx.commit();
        factory.close();
        session.close();
    }
}