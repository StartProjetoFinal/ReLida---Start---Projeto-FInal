package com.relida.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.relida.dao.UsuarioDAO;
import com.relida.model.Usuario;

@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@GetMapping("/")
	public String exibirTelaInicial() {
		return"index";
	}
	
	@RequestMapping("/login")
	public String exibirTelaLogin(String mensagem) {
		mensagem = null; // Apaga mensagem após atualização da página.
		return"login";
	}
	
	@RequestMapping("/login_ok")
	public String efetuarLogin(Usuario usuario, RedirectAttributes ra, HttpSession session) {
		usuario = this.usuarioDAO.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if (usuario != null) {
			session.setAttribute("UsuarioLogado", usuario);
			return"index";
		}else {
			ra.addFlashAttribute("mensagem","Dados Inválidos, tente novamente.");
			return"redirect:/login";
			
		}
	}
	
	
}
