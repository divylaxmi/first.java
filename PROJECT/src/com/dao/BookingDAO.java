package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entityy.Booking;
import com.entityy.Room;

public class BookingDAO {
    private SessionFactory sessionFactory;

    public BookingDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addBooking(Booking  booking) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(booking);
            tx.commit();
        }
    }

    public Room getRoom(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Room.class, id);
        }
    }

    // Additional CRUD methods for Room entity
    
    
    
}