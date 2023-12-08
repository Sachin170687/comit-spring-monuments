package org.comit.spring.controller;

import java.math.BigDecimal;
import java.util.List;

import org.comit.spring.bean.Bookings;
import org.comit.spring.bean.LoginUser;
import org.comit.spring.bean.User;
import org.comit.spring.service.BookingService;
import org.comit.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	@Autowired
	BookingService bookingservice;
	
	@GetMapping("/")
	String page() {
		System.out.println("First Page");
		this.logger.debug("Showing Main Page");
		return "index";
	}
	
	@GetMapping("monuments_list")
	String list() {
		System.out.println("Second Page");
		return "monuments";
	}
	@GetMapping("loginpage")
	String ticket(LoginUser loginuser) {
		System.out.println("Third Page");
		return "login";
	}
	
		

	@GetMapping("register")
	String regis(User user) {
		System.out.println("Fourth Page");
		this.logger.debug("Showing User Form...");
		return "register_form";
	}
	
	@PostMapping("register")
	String createUser(User user) {
		System.out.println("Eigth Page");
		this.logger.debug("Creating User...");
		this.userService.createUser(user);
		return "redirect:/loginpage";
	}
	
	
	@GetMapping("/update/{id}")
	ModelAndView showUpdate(@PathVariable int id) {
		System.out.println("Tenth Page");
		this.logger.debug("Showing the Update User Page...");
		User user = this.userService.findUser(id);
		return new ModelAndView("update_register_form","user",user);
	}
	
	@PostMapping("update")
	String updateUser(User user) {
		System.out.println("Eleventh Page");
		this.logger.debug("Updating User...");
		this.userService.updateUser(user);
		return "redirect:/adminpage1";
	}
	
	
	@GetMapping("/delete/{id}")
	String deleteUser(@PathVariable int id) {
		System.out.println("Twelth Page");
		this.logger.debug("Deleting User Page...,idUser: {}",id);
		this.userService.deleteUser(id);
		return "redirect:/adminpage1";
	}
	
	
	
	

	@GetMapping("/adminpage1")
	ModelAndView listusers() {
		System.out.println("Fifth Page");
		this.logger.debug("Listing Users ...");
		List<User> users =this.userService.listusers();
        return new ModelAndView("list","users",users);
	}
	
	@GetMapping("adminpage2")
	ModelAndView bookinglist() {
		System.out.println("Sixth Page");
		
		List<Bookings> booking =this.bookingservice.bookinglist();
        return new ModelAndView("bookinglist","booking",booking);
	}
	
	@GetMapping("adminpage")
	String homepage() {
		System.out.println("Seventh Page");
		return "adminhomepage";
	}
	
	@GetMapping("booking")
	String showBookings(Bookings booking) {
		System.out.println("13th Page");
		return "booking_form";
	}
	
	@PostMapping("booking")
	String createBooking(Bookings booking) {
		System.out.println("14th Page");
		BigDecimal totalPrice= booking.getTicketPrice().multiply(booking.getNumberTickets());
		booking.setTotalPrice(totalPrice);
		this.bookingservice.createBooking(booking);
		return "booking_form";	
	}
	
	@GetMapping("payment")
	String showPayment() {
		System.out.println("15th Page");
		return "payment";
	}
	
	
}