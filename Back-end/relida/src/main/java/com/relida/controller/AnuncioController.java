package com.relida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnuncioController {
	
	@GetMapping("/cadastrar_livro")
	public String exibirTelaCadastrarLivro() {
		return "cadastrar_livro";
	}
		
	@GetMapping("/anuncio_um")
	public String exibirTelaAnuncio() {
		return "anuncio_um";
	}
	
	@GetMapping("/carrinho")
	public String exibirC() {
		return "carrinho";
	}
	
	@GetMapping("/pagamento")
	public String exibirPagamento() {
		return "pagamento";
	}
	@GetMapping("/fale_conosco")
	public String exibirFaleConosco() {
		return "fale_conosco";
	}
	


}
