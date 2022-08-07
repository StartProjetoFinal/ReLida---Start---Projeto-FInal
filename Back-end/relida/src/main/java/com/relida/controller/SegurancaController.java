package com.relida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class SegurancaController {

	@Controller
	public class SegurancaController {
		
		@GetMapping("/redefinicao_senha")
		public String exibirTelaCadastrarLivro() {
			return "redefinicao_senha";
		}
	
	
}
