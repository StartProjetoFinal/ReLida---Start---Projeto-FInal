package com.relida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/cadastro_ok") //Falta verificar a repetição de senha e coletar input da pergunta de segurança
	public String CadastrarUsuario(Usuario usuario) {
		this.usuarioDAO.save(usuario);
		return "login" ;
	}
	
	@GetMapping("/meu_perfil")
	public String exibirMeuPerfil() {
		return "meu_perfil";
	}
	
	@GetMapping("/meus_pedidos")
	public String exibirTelaMeusPedidos() {
		return "meus_pedidos";
	}
	
	
	
}
