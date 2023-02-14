package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@GetMapping("/")
	public String loadMain(HttpServletRequest request) {
		System.out.println(request.getRequestURI());
		return "main";
	}

}
