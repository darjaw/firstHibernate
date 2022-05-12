package com.test.hib.controller;

import com.test.hib.model.User;
import com.test.hib.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreatingUser {
    public CreatingUser(User user, UserDetails userDetails) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        UserDetails sendUserDetails = userDetails;
        user.setUserDetails(userDetails);

        session.persist(user);
        t.commit();
        System.out.println("User submitted!");
        factory.close();
        session.close();
    }
}



