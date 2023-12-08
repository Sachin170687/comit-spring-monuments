package org.comit.spring.bean;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Bookings {
	
	int idBooking;
    
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date visitDate;
    BigDecimal ticketPrice;
    BigDecimal numberTickets;
    BigDecimal totalPrice;
    
    
	public int getIdBooking() {
		return idBooking;
	}
	public void setIdBooking(int idBooking) {
		this.idBooking = idBooking;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public BigDecimal getNumberTickets() {
		return numberTickets;
	}
	public void setNumberTickets(BigDecimal numberTickets) {
		this.numberTickets = numberTickets;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return String.format("Bookings [idBooking=%s, visitDate=%s, ticketPrice=%s, numberTickets=%s, totalPrice=%s]",
				idBooking, visitDate, ticketPrice, numberTickets, totalPrice);
	}
    
       
    
}
    
    
    
    
		
    
    
		


