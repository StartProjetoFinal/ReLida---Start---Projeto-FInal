package com.relida.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.relida.dao.AnuncioDAO;
import com.relida.dao.ComentarioDAO;
import com.relida.model.Anuncio;
import com.relida.model.Comentario;
import com.relida.model.Usuario;

@Controller
public class AnuncioController {
	
	@Autowired
	private AnuncioDAO anuncioDAO;
	
	@Autowired
	private ComentarioDAO comentarioDAO;
	
	@GetMapping("/cadastrar_livro")
	public String exibirTelaCadastrarLivro(HttpSession session) {
		if (session.getAttribute("Logado")==null) {return "/login";}
		else { return "cadastrar_livro";}
	}
		
	@GetMapping("/anuncio_{id}")
	public String exibirTelaAnuncio(String UsuarioLogado, Model modelo, @PathVariable String id) {
		modelo.addAttribute("UsuarioLogado", UsuarioLogado);
		Anuncio anuncio = anuncioDAO.findByTitulo("O Último Olimpiano");
		modelo.addAttribute("anuncio", anuncio);
		modelo.addAttribute("valor", "R$ " + String.valueOf(anuncio.getValor()));
		modelo.addAttribute("vendido_por", "Vendido por: " + anuncio.getAnunciante().getNome());
		return "anuncio_" + id;
	}
	
	@GetMapping("/carrinho")
	public String exibirC(HttpSession session) {
		if (session.getAttribute("Logado")==null) {return "/login";}
		else { return "carrinho";}
	}
	
	@GetMapping("/pagamento")
	public String exibirPagamento(HttpSession session) {
		if (session.getAttribute("Logado")==null) {return "/login";}
		else { return "pagamento";}
	}
	@GetMapping("/fale_conosco")
	public String exibirFaleConosco() {
		return "fale_conosco";
	}
	
	
	@RequestMapping("/cadastro_livro_verificacao")
	public String CadastrarLivro(Anuncio anuncio, HttpSession session, @RequestParam("imagem") MultipartFile file) {
			
		//Verificação de existência de um anúncio exatamente igual:
		Anuncio anuncioo = anuncioDAO.findByValorAndTituloAndAutorAndOutrosAndCidade(anuncio.getValor(), anuncio.getTitulo(), anuncio.getAutor(), anuncio.getOutros(), anuncio.getCidade());
		Usuario usuario = (Usuario) session.getAttribute("Logado");
		if (anuncioo==null) {
			anuncio.setAnunciante(usuario);
			try {
				anuncio.setFoto_anuncio(file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.anuncioDAO.save(anuncio);
			return "anuncio_um";
			}
		else {
			anuncio.setAutor("Este livro já está cadastrado!");
			return "error_cadastrar_livro";}
	}
	
	
	@RequestMapping("/comentario")
	public String Comentar(String comentario, Model modelo, String UsuarioLogado) {
		Comentario comentari = new Comentario(comentario);
		this.comentarioDAO.save(comentari);
		modelo.addAttribute("comentarioo", comentari);
		
		//Para persistir dados do livro sem ter que usar redirect:
		modelo.addAttribute("UsuarioLogado", UsuarioLogado);
		Anuncio anuncio = anuncioDAO.findByTitulo("O Último Olimpiano");
		modelo.addAttribute("anuncio", anuncio);
		modelo.addAttribute("valor", "R$ " + String.valueOf(anuncio.getValor()));
		modelo.addAttribute("vendido_por", "Vendido por: " + anuncio.getAnunciante().getNome());
		
		return "anuncio_um";
	}
	
	
	@GetMapping("/imagem/anuncio")
	@ResponseBody
	public byte[] ExibirImagemPerfil(Model modelo) {
		Anuncio anuncio = anuncioDAO.findByTitulo("O Último Olimpiano");
		modelo.addAttribute("anuncio", anuncio);
		return anuncio.getFoto_anuncio();
	}
	
	


}
