package com.io.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.io.blog.model.Autor;
import com.io.blog.service.AutorService;


@Controller
public class AutorController {
	
	@Autowired
	private AutorService serviceAutor;
	
	@GetMapping("autor/formulario")
	public String formulario() {
		return "formulario";
	}
	
	
	@PostMapping("autor/salvar")
	public String salvar(Autor autor) {
		serviceAutor.cadastrarAutor(autor);
		
		return "sucesso";
	}
	
}
