package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

public class DeletingUser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        User u1 = new User();
        User u2 = new User();
//        u1.setId(7);
//        u2.setId(8);
        session.remove(u1);
        session.remove(u2);
        tx.commit();
        session.close();
        factory.close();
    }
}

