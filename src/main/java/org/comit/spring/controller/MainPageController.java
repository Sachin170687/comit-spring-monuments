package org.comit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
	
	@GetMapping("/")
	String page() {
		System.out.println("First Page");
		return "index";
	}
	
	@GetMapping("monuments_list")
	String list() {
		System.out.println("Second Page");
		return "monuments";
	}
	@GetMapping("bookings")
	String ticket() {
		System.out.println("Third Page");
		return "ticket";
	}

	@GetMapping("register")
	String regis() {
		System.out.println("Fourth Page");
		return "register_form";
	}


}
