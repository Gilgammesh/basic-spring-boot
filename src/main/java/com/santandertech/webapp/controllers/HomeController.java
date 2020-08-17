package com.santandertech.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")	
	public String home() {
		//return "redirect:https://www.google.com.pe";
		//return "redirect:/app/inicio";   // Redireccionar la página a la ruta indicada puede ser interna o externa
		return "forward:/app/index";  // Muestra el contenido de la ruta indicada sin cambiar la Url (solo funciona para rutas internas)
	}
	
}
