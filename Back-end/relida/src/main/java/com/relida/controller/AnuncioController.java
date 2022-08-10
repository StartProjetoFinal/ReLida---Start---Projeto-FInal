package com.relida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.relida.dao.AnuncioDAO;
import com.relida.model.Anuncio;

@Controller
public class AnuncioController {
	
	@Autowired
	private AnuncioDAO anuncioDAO;
	
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
	
	
	@RequestMapping("/cadastro_livro_verificacao")
	public String CadastrarLivro(Anuncio anuncio) {
			
		//Verificação de existência de um anúncio exatamente igual:
		Anuncio anuncioo = anuncioDAO.findByValorAndTituloAndAutorAndOutrosAndCidade(anuncio.getValor(), anuncio.getTitulo(), anuncio.getAutor(), anuncio.getOutros(), anuncio.getCidade());
		if (anuncioo==null) {
			this.anuncioDAO.save(anuncio);
			return "anuncio_um";
			}
		else {
			anuncio.setAutor("Este livro já está cadastrado!");
			return "error_cadastrar_livro";}
	}
	


}
