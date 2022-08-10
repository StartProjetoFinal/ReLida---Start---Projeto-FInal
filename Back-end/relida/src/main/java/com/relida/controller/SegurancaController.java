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
public class SegurancaController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@GetMapping("/redefinicao_senha")
	public String exibirTelaRedefinicao() {
		return "redefinicao_senha";
	}

	@RequestMapping("redefinicao/mostra_pergunta")
	public String AbrirRedefinicaoOuNao(Usuario usuario, RedirectAttributes ra, HttpSession session) {
		Usuario usuarioo = this.usuarioDAO.findByEmail(usuario.getEmail());
		if (usuarioo!=null) {
			return"redirect:/redefinicao_senha";
		} else {
			ra.addFlashAttribute("mensagem","Você precisa preencher um email válido e não vazio para acessar a redefinição de senha");
			return"redirect:/login";	
		}
	}
	

	
	
	
}
