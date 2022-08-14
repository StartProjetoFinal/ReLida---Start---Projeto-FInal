package com.relida.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.relida.dao.AnuncioDAO;
import com.relida.dao.UsuarioDAO;
import com.relida.model.Anuncio;
import com.relida.model.Usuario;

@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private AnuncioDAO anuncioDAO;
	
	@GetMapping("/index")
	public String exibirTelaInicial(HttpSession session, Model modelo) {
		System.out.println(session.getAttribute("Logado")); //Verificar no console se está logando corretamente
		Anuncio anuncio = anuncioDAO.findByTitulo("O Último Olimpiano");
		modelo.addAttribute("anuncio", anuncio);
		modelo.addAttribute("valor", "R$ " + String.valueOf(anuncio.getValor()));
		modelo.addAttribute("vendido_por", "Vendido por: " + anuncio.getAnunciante().getNome());
		return"index";
	}
	
	@RequestMapping("/login")
	public String exibirTelaLogin(String mensagem, HttpSession session) {
		session.setAttribute("Logado", null);
		return"login";
	}
	@RequestMapping("/error_login")
	public String exibirTelaLoginError(String mensagem) {
		return"error_login";
	}

	@RequestMapping("/deslogar")
	public String Deslogar(HttpSession session) {
		session.setAttribute("Logado", null);
		return"index";
	}
	
	

	@RequestMapping("/fale_conosco")
	public String exibirTelaFaleConosco(String mensagem) {
		return"fale_conosco";
	}

	@GetMapping("/quem_somos")
	public String exibirQuemSomos() {
		return "quem_somos";
	}

	@GetMapping("/privacidade")
	public String exibirPrivacidade() {
		return "privacidade";
	}

	@GetMapping("/termos_uso")
	public String exibirTermosUso() {
		return "termos_uso";
	}
	
	@RequestMapping("/login_ok")
	public String efetuarLogin(Usuario usuario, RedirectAttributes ra, HttpSession session) {
		Usuario usuarioo = this.usuarioDAO.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if (usuarioo != null) {
			session.setAttribute("Logado", usuarioo);
			return"redirect:/index";
		}else {                                                                                     
			ra.addFlashAttribute("mensagem","Dados Inválidos, tente novamente.");
			return"redirect:/error_login";
			
		}
	}
	
	
}
