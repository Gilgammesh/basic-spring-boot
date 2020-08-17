package com.santandertech.webapp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

	@GetMapping("/")
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String params(@RequestParam(required = false, defaultValue = "vacio") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: " + texto);
		return "params/ver";
	}

	@GetMapping("/mix-params")
	public String params(@RequestParam(required = false, defaultValue = "vacio") String saludo,
			@RequestParam(required = false, defaultValue = "0") Integer numero, Model model) {
		model.addAttribute("resultado1", "El saludo enviado es: " + saludo);
		model.addAttribute("resultado2", "El número de saludo es : " + numero);
		return "params/ver";
	}

	@GetMapping("/mix-params-http")
	public String params(HttpServletRequest request, Model model) {
		String saludo = request.getParameter("saludo");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		model.addAttribute("resultado1", "El saludo enviado es: " + saludo);
		model.addAttribute("resultado2", "El número de saludo es : " + numero);
		return "params/ver";
	}

}
