package com.relida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcessoController {
	@GetMapping("/")
	public String exibirTelaInicial() {
		return"index";
	}
}
