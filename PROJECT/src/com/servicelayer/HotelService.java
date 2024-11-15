package com.servicelayer;

import java.util.Date;

import org.hibernate.SessionFactory;

import com.dao.BookingDAO;
import com.dao.GuestDAO;
import com.dao.RoomDAO;
import com.entityy.Booking;
import com.entityy.Guest;
import com.entityy.Room;

public class HotelService {
    private RoomDAO roomDAO;
    private GuestDAO guestDAO;
    private BookingDAO bookingDAO;

    public HotelService(SessionFactory sessionFactory) {
        this.roomDAO = new RoomDAO(sessionFactory);
        this.guestDAO = new GuestDAO(sessionFactory);
        this.bookingDAO = new BookingDAO(sessionFactory);
    }

    public void bookRoom(int roomId, int guestId, Date checkIn, Date checkOut) {
        Room room = roomDAO.getRoom(roomId);
        Guest guest = guestDAO.getGuest(guestId);
        
        if (room != null && room.isAvailable()) {
            Booking booking = new Booking();
            booking.setRoom(room);
            booking.setGuest(guest);
            booking.setCheckInDate(checkIn);
            booking.setCheckOutDate(checkOut);
            bookingDAO.addBooking(booking);

            // Mark room as unavailable
            room.setAvailable(false);
            roomDAO.updateRoom(room);
        }
    }

	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		
	}

    // Additional methods for other functionalities
}
