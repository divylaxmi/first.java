package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entityy.Room;

public class RoomDAO {
    private SessionFactory sessionFactory;

    public RoomDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addRoom(Room room) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(room);
            tx.commit();
        }
    }

    public Room getRoom(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Room.class, id);
        }
    }

	public RoomDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		
	}
    
    
    

    // Additional CRUD methods for Room entity
    
    
    
}

