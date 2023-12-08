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
		booking.setTicketPrice(rs.getBigDecimal("TICKET_PRICE"));
		booking.setNumberTickets(rs.getBigDecimal("NO_OF_TICKETS"));
		booking.setTotalPrice(rs.getBigDecimal("TOTAL_PRICE"));
        return booking;
	}

}
