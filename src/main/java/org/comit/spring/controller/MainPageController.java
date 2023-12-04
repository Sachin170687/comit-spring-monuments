package org.comit.spring.controller;

import org.comit.spring.bean.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.spring.bean.Userfm;

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
	@GetMapping("loginpage")
	String ticket() {
		System.out.println("Third Page");
		return "login";
	}
	
	

	@GetMapping("register")
	String regis() {
		System.out.println("Fourth Page");
		return "register_form";
	}


}
