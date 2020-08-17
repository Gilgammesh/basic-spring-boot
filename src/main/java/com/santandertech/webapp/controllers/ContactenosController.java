package com.santandertech.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactenosController {

	@GetMapping("/contactenos")
	public String contactenos() {
		return "contactenos";
	}

}
