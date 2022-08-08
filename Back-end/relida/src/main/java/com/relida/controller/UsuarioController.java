package com.relida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.relida.dao.UsuarioDAO;
import com.relida.model.Usuario;

@Controller
public class UsuarioController {
	
	@Autowired 
	private UsuarioDAO usuarioDAO;
		
	@GetMapping("/cadastro")
	public String exibirTelaCadastro() {
		return "cadastro_usuario";
	}
	
	@GetMapping("/cadastro_ok") //Falta verificar a repetição de senha e coletar input da pergunta de segurança
	public String CadastrarUsuario(Usuario usuario) {
		this.usuarioDAO.save(usuario);
		return "login" ;
	}
	
	
	
	
}
