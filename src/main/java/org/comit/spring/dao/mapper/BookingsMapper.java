package org.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.spring.bean.Bookings;
import org.springframework.jdbc.core.RowMapper;

public class BookingsMapper implements RowMapper<Bookings>{
	@Override
	public Bookings mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Bookings booking=new Bookings();
		
		
		booking.setIdBooking(rs.getInt("BOOKING_ID"));
		booking.setVisitDate(rs.getDate("VISIT_DATE"));
		booking.setNumberOfTickets(rs.getInt("NO_OF_TICKETS"));
		booking.setTotalPrice(rs.getDouble("TOTAL_PRICE"));
        
        return booking;
	}

}
