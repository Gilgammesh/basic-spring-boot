package com.santandertech.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariablesRutaController {

	@GetMapping("/")
	public String index() {
		return "variables/index";
	}

	@GetMapping("/string/{texto}")
	public String variables(@PathVariable(required = false) String texto, Model model) {
		model.addAttribute("titulo", "Parametros variables en la ruta o path");
		model.addAttribute("resultado", "El texto enviado es: " + texto);
		return "variables/ver";
	}

	@GetMapping("/mix-vars/{saludo}/{numero}")
	public String variables(@PathVariable(required = false) String saludo,
			@PathVariable(required = false) Integer numero, Model model) {
		model.addAttribute("titulo", "Parametros variables en la ruta o path");
		model.addAttribute("resultado1", "El saludo enviado es: " + saludo);
		model.addAttribute("resultado2", "El numero enviado es: " + numero	);
		return "variables/ver";
	}

}
