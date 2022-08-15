package com.relida.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.relida.dao.AnuncioDAO;
import com.relida.dao.UsuarioDAO;
import com.relida.model.Anuncio;
import com.relida.model.Usuario;

@Controller
public class UsuarioController {
		
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private AnuncioDAO anuncioDAO;
	
	@GetMapping("/cadastro_usuario")
	public String exibirTelaCadastro(HttpSession session) {
		session.setAttribute("Logado", null);
		return "cadastro_usuario";
	}
	
	
	@GetMapping("/meu_perfil")
	public String exibirMeuPerfil(HttpSession session) {
		if (session.getAttribute("Logado")==null) {return "/login";}
		else { return "meu_perfil";}
	}

	@GetMapping("/editar_perfil")
	public String exibirEditarPerfil(HttpSession session) {
		if (session.getAttribute("Logado")==null) {return "/login";}
		else { return "editar_perfil";}
	}
	
	@GetMapping("/meus_pedidos")
	public String exibirTelaMeusPedidos(HttpSession session, Model modelo) {
		if (session.getAttribute("Logado")==null) {return "/login";}
		else { 
			Anuncio anuncio1 = anuncioDAO.findByTitulo("O Último Olimpiano");
			Anuncio anuncio2 = anuncioDAO.findByTitulo("Como fazer amigos e influenciar pessoas");
			Anuncio anuncio3 = anuncioDAO.findByTitulo("O Último Olimpiano");
			
			
			return "meus_pedidos_busca";}
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
		session.setAttribute("Logado", null);
		
		return "index";
	}

	
	@RequestMapping("/edita_perfil")
	public String EditaPerfil(HttpSession session, @RequestParam("imagem") MultipartFile file ) {
		Usuario usuario = (Usuario) session.getAttribute("Logado");
		if (file !=null) {
			try {
				usuario.setFoto_perfil(file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.usuarioDAO.save(usuario);
			return "/meu_perfil";
			
		}else {return "/editar_perfil";}
		
	}
	
	
	@GetMapping("/imagem/perfil")
	@ResponseBody
	public byte[] ExibirImagemPerfil(Model modelo, HttpSession session) {
		Usuario usuario = (Usuario) session.getAttribute("Logado");
		Usuario usuarioo = usuarioDAO.findByEmail(usuario.getEmail());
		return usuarioo.getFoto_perfil();
		
	}
	

	
	
}
