package com.santandertech.webapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.santandertech.webapp.models.Usuario;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Carlos");
		usuario.setApellido("Santander");
		usuario.setEmail("carlos.santander@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de usuario");
		return "perfil";
	}

	@GetMapping("/listar")
	public String usuarios(Model model) {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Carlos", "Santander", "carlos.santander@gmail.com"));
		usuarios.add(new Usuario("Marianella", "Yalta", "nellita681@gmail.com"));
		usuarios.add(new Usuario("Joaquin", "Del Valle", "joaquinvall@gmail.com"));
		usuarios.add(new Usuario("Mauro", "Mori", "mmori1848@gmail.com"));
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Lista de Usuarios");
		return "listar";
	}

	@ModelAttribute("usuariosModel")
	public List<Usuario> listarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Carlin", "Santander", "carlin1733@gmail.com"));
		usuarios.add(new Usuario("Julio", "Yalta", "julioyalta@gmail.com"));
		usuarios.add(new Usuario("Maurcio", "Panduro", "xfrost16@gmail.com"));
		usuarios.add(new Usuario("Genny", "Ruiz", "gruiz199@gmail.com"));
		return usuarios;
	}

}
