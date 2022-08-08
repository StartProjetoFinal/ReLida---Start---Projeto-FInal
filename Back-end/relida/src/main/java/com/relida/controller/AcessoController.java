package com.relida.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/login")
	public String exibirTelaLogin() {
		return"login";
	}
	
	@PostMapping("/login_ok")
	public String efetuarLogin(Usuario usuario, RedirectAttributes ra, HttpSession session) {
		usuario = this.usuarioDAO.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if (usuario != null) {
			session.setAttribute("UsuarioLogado", usuario);
			return"redirect:/index";
		}else {
			ra.addFlashAttribute("mensagem","Dados Inválidos");
			return"redirect:/login";
			
		}
	}
	
	
}
