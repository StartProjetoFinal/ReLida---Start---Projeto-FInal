package com.relida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SegurancaController {

	@GetMapping("/redefinicao")
	public String exibirTelaCadastrarLivro() {
		return "redefincao_senha";
	}

//	@GetMapping("redefinicao/mostra_pergunta")
//	public String GetPergunta()
	
}
