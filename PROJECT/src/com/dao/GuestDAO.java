package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entityy.Guest;

public class GuestDAO {
    private SessionFactory sessionFactory;

    public GuestDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addGuest(Guest guest) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(guest);
            tx.commit();
        }
    }

    public Guest getGuest(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Guest.class, id);
        }
    }

    // Additional CRUD methods for Guest entity
}
