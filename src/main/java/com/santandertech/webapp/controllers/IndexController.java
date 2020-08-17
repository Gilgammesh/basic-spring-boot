package com.santandertech.webapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

	@Value("${texto.indexcontroller.titulo1}")
	private String textoIndex1;

	@Value("${texto.indexcontroller.titulo2}")
	private String textoIndex2;

	@Value("${texto.indexcontroller.mensaje1}")
	private String mensajeIndex1;

	// @RequestMapping(path = "/index", method = RequestMethod.GET)
	// @RequestMapping(value = "/index", method = RequestMethod.GET)
	// @GetMapping(path = "/index")
	// @GetMapping(value = "/index")
	// @GetMapping("/index")
	@GetMapping({ "", "/", "/index", "inicio" })
	// public String index(Map<String, Object> map) {
	// public String index(ModelAndView mv) {
	// public String index(ModelMap model) {
	public String index(Model model) {
		// map.put("titulo", "Página de Inicio");
		// mv.addObject("titulo", "Página de Inicio");
		// mv.setViewName("index");
		model.addAttribute("titulo", "Página de Inicio");
		model.addAttribute("titulo1", textoIndex1);
		model.addAttribute("titulo2", textoIndex2);
		model.addAttribute("mensaje1", mensajeIndex1);
		return "index";
	}

}
