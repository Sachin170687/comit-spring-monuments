package org.comit.spring.dao;

import java.util.List;

import org.comit.spring.bean.Bookings;
import org.comit.spring.dao.mapper.BookingsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookingsDao {
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Bookings> bookinglist(){
		String sql="SELECT * FROM BOOKINGS";
	    return this.jdbctemplate.query(sql,new BookingsMapper());
	}
	
	public void createBooking(Bookings booking) {
		String sql="INSERT INTO BOOKINGS (VISIT_DATE,TICKET_PRICE,NO_OF_TICKETS,TOTAL_PRICE)" 
				    + "VALUES (?,?,?,?)";
		this.jdbctemplate.update(sql,booking.getVisitDate(),booking.getTicketPrice(),
				booking.getNumberTickets(),booking.getTotalPrice());			
	}
	
	
}
