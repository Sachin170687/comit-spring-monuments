package org.comit.spring.service;

import java.util.List;

import org.comit.spring.bean.Bookings;
import org.comit.spring.dao.BookingsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
	@Autowired
	BookingsDao bookingsdao;
	
	public List<Bookings> bookinglist(){
		
		List<Bookings> booking= this.bookingsdao.bookinglist();
		return booking;
	}
	
	public void createBooking(Bookings booking) {
		
		this.bookingsdao.createBooking(booking);
	}
	
}
