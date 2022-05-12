package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;
import org.hibernate.query.sql.internal.SQLQueryParser;

public class FindingUser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        String sql = "SELECT * FROM USER" +
        " INNER JOIN USER_DETAILS ON USER.ID = USER_DETAILS.USER_ID";
        session.createNamedQuery()
        //Close resources
        tx.commit();
        factory.close();
        session.close();
    }
}