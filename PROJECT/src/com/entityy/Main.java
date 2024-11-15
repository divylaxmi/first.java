package com.entityy;

import java.math.BigDecimal;
import java.sql.Date;
//import java.util.Date;
import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.servicelayer.HotelService;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        HotelService hotelService = new HotelService(sessionFactory);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hotel Management System");
        System.out.println("1. Add Room");
        System.out.println("2. Book Room");
        System.out.println("3. Check Room Availability");
        System.out.println("Enter choice:");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter room number, type, price:");
                int roomNumber = scanner.nextInt();
                String type = scanner.next();
                BigDecimal price = scanner.nextBigDecimal();
                Room room = new Room();
                room.setRoomNumber(roomNumber);
                room.setType(type);
                room.setPrice(price);
                hotelService.addRoom(room);
                break;
            case 2:
                System.out.println("Enter room ID, guest ID, check-in date, check-out date:");
                int roomId = scanner.nextInt();
                int guestId = scanner.nextInt();
                Date checkIn = Date.valueOf(scanner.next());
                Date checkOut = Date.valueOf(scanner.next());
                hotelService.bookRoom(roomId, guestId, checkIn, checkOut);
                break;
            // Add cases for other operations
        }
    }
}
