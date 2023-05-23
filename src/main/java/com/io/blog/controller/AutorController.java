package com.io.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.io.blog.model.Autor;
import com.io.blog.service.AutorService;


@Controller
@RequestMapping("/autor")
public class AutorController {
	
	@Autowired
	private AutorService serviceAutor;
	@GetMapping("/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@PostMapping("/salvar")
	public String salvar(Autor autor) {
		serviceAutor.cadastrarAutor(autor);
		return "sucesso";
	}
	
}
