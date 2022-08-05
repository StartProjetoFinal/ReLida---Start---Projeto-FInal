package com.relida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedefinicaoController {
	@GetMapping("/redefinicao")
	public String exibirTelaRedefinicao () {
		return "redefinicao_senha";
		
		
	}
}
