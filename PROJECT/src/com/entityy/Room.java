package com.entityy;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")

public class Room {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "room_number", unique = true)
	    private int roomNumber;

	    private String type;
	    private BigDecimal price;

	    @Column(name = "is_available")
	    private boolean isAvailable = true;
	    
	    
	    

	    // Getters and Setters
	    
	    public Room() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

		public Room(int id, int roomNumber, String type, BigDecimal price, boolean isAvailable) {
			super();
			this.id = id;
			this.roomNumber = roomNumber;
			this.type = type;
			this.price = price;
			this.isAvailable = isAvailable;
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getRoomNumber() {
			return roomNumber;
		}

		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public boolean isAvailable() {
			return isAvailable;
		}

		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
	    
	    
	}



