package com.relida.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.relida.dao.UsuarioDAO;
import com.relida.model.Usuario;

@Controller
public class UsuarioController {
		
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@GetMapping("/cadastro_usuario")
	public String exibirTelaCadastro() {
		return "cadastro_usuario";
	}
	
	
	@GetMapping("/meu_perfil")
	public String exibirMeuPerfil() {
		return "meu_perfil";
	}

	@GetMapping("/editar_perfil")
	public String exibirEditarPerfil() {
		return "editar_perfil";
	}
	
	@GetMapping("/meus_pedidos")
	public String exibirTelaMeusPedidos() {
		return "meus_pedidos";
	}
	
	
	@GetMapping("/cadastro_ok")
	public String CadastrarUsuario(Usuario usuario, String senha2, String exampleRadios) {
		
		//Coletando pergunta:
		usuario.setPergunta_seg(exampleRadios);
		if (usuario.getPergunta_seg().equals("opcao1")) {usuario.setPergunta_seg("Animal favorito?");}
		if (usuario.getPergunta_seg().equals("opcao2")) {usuario.setPergunta_seg("Melhor amigo de infância?");}
		if (usuario.getPergunta_seg().equals("option3")) {usuario.setPergunta_seg("Livro favorito?");}
		
		//Validação de senha e de existência de cadastro:
		Usuario usuarioo = usuarioDAO.findByEmail(usuario.getEmail());
		if (usuarioo==null && usuario.getSenha().equals(senha2)) {
			this.usuarioDAO.save(usuario);
			return "login";
			}
		else if (usuarioo != null && usuario.getSenha().equals(senha2)) {
			usuario.setNome("Esse email já está cadastrado. Tente novamente!");
			return "error_cadastro_usuario";
			}
		else {
			usuario.setNome("Senhas diferentes. Tente novamente!");
			return "error_cadastro_usuario";
		}
	}
	
	
	@RequestMapping("/excluir_conta")
	public String ExcluirConta(HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("Logado");
		this.usuarioDAO.deleteById(usuario.getId());
		
		return "index";
	}

	
	}
