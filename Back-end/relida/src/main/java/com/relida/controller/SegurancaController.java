package com.relida.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.relida.dao.UsuarioDAO;
import com.relida.model.Usuario;

@Controller
public class SegurancaController {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@GetMapping("/redefinicao_senha")
	public String exibirTelaRedefinicao(String pergunta) {
		return "redefinicao_senha";
	}

	@RequestMapping("redefinicao/mostra_pergunta")
	public String AbrirRedefinicaoOuNao(Usuario usuario, RedirectAttributes ra, HttpSession session) {
		Usuario usuarioo = this.usuarioDAO.findByEmail(usuario.getEmail());
		if (usuarioo!=null) {
			session.setAttribute("Logado", usuarioo);
			ra.addFlashAttribute("pergunta", usuarioo.getPergunta_seg());
			return"redirect:/redefinicao_senha";
		} else {
			ra.addFlashAttribute("mensagem","Você precisa preencher um email válido e não vazio para acessar a redefinição de senha");
			return"redirect:/login";	
		}
	}
	
	
	@RequestMapping("/redefine")
	public String RedefineSenha(HttpSession session, String resposta_seg2, String senha1, String senha2, Model modelo) {
		Usuario usuario = (Usuario) session.getAttribute("Logado");
		System.out.println(usuario);
		Usuario usuarioo = usuarioDAO.findByEmail(usuario.getEmail());
		
		if (senha1.equals(senha2) && resposta_seg2.equals(usuarioo.getresposta_seg())) {
			this.usuarioDAO.deleteById(usuarioo.getId());
			usuarioo.setSenha(senha1);
			this.usuarioDAO.save(usuarioo);
			return "login";	
		}else if (!senha1.equals(senha2)) {
			modelo.addAttribute("erro", "Você digitou senhas diferentes. Tente novamente.");
			return "error_redefinicao_senha";
		} 
		else {
			modelo.addAttribute("erro", "Sinto muito, você não digitou a resposta corretamente.");
			return "error_redefinicao_senha";
		}
	
	}
}
	

