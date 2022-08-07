package com.relida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnuncioController {
	
	@GetMapping("/cadastrar_livro")
	public String exibirTelaCadastrarLivro() {
		return "cadastrar_livro";
	}

}
