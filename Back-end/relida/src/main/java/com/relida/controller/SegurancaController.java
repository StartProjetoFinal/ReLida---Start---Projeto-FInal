package com.relida.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.relida.dao.UsuarioDAO;
import com.relida.model.PerguntaDeSeguranca;
import com.relida.model.Usuario;

@Controller
public class SegurancaController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@GetMapping("/redefinicao")
	public String exibirTelaCadastrarLivro() {
		return "redefincao_senha";
	}

	@RequestMapping("redefinicao/mostra_pergunta")
	public String AbrirRedefinicao(Usuario usuario, RedirectAttributes ra, HttpSession session) {
		usuario = this.usuarioDAO.findByEmail(usuario.getEmail());
		
		if (usuario != null && usuario.getEmail()!=null && usuario.getEmail() != "") { //Testar
			Usuario user = usuarioDAO.findByEmail(usuario.getEmail()); // Isso não está coletando a linha do usuário
			usuario = user;
			return"redefinicao_senha";
		} else {
			ra.addFlashAttribute("mensagem","Você precisa preencher um email válido e não vazio para acessar a redefinição de senha");
			return"redirect:/login";	
		}
	}

	
	
	
}
