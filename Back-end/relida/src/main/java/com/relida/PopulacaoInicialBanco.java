package com.relida;

import java.io.IOException;
import java.io.InputStream;

import javax.transaction.Transactional;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.relida.dao.AnuncioDAO;
import com.relida.dao.UsuarioDAO;
import com.relida.model.Anuncio;
import com.relida.model.Usuario;

@Component
@Transactional
public class PopulacaoInicialBanco implements CommandLineRunner {
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private AnuncioDAO anuncioDAO;
	
	@GetMapping(value = "/image")
	public @ResponseBody byte[] getImage() throws IOException {
	    InputStream in = getClass()
	      .getResourceAsStream("anuncio_exemplo.jpg");
	    return IOUtils.toByteArray(in);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Usuario usuarioo = usuarioDAO.findByEmail("joseheraclito@gmail.com");
		Anuncio anuncioo = anuncioDAO.findByTitulo("O Último Olimpiano");
		
		if (usuarioo==null && anuncioo==null) {
			Usuario usuario = new Usuario("José Heráclito", "joseheraclito@gmail.com", "Ab@1", "Livro favorito?", "Harry Potter");
			Anuncio anuncio = new Anuncio(usuario, "Venda", "Literatura Infanto-Juvenil", 15.5, "O Último Olimpiano", "Rick Riordan", "2014", "", "Recife", "Pernambuco", "50.060-004", getImage(), "Livro em bom estado, com marcas de uso em algumas páginas.Quem gosta de uma boa ficção e aventuras vai gostar muito desse livro.");
			this.usuarioDAO.save(usuario);
			this.anuncioDAO.save(anuncio);
		}
		Usuario u1= new Usuario("Jose");
		u1.setEmail("jose_h@gmail.com");
		u1.setPergunta_seg("Amigo de Infancia");
		u1.setresposta_seg("Roberto");
		u1.setSenha("Jhj12345@");
		
		Usuario u2= new Usuario("Maria");
		u2.setEmail("mariasilva@hotmail.com");
		u2.setPergunta_seg("Livro Favorito");
		u2.setresposta_seg("Como eu era antes de voce");
		u2.setSenha("Ms12345@");
		
		Usuario u3= new Usuario("Shirlley");
		u3.setEmail("devshirlleybarros@gmail.com");
		u3.setPergunta_seg("Animal Estimacao");
		u3.setresposta_seg("Lessi");
		u3.setSenha("Sb12345@");
		
		Usuario u4= new Usuario("Wandemberg");
		u4.setEmail("ss.wandemberg@gmail.com");
		u4.setPergunta_seg("Livro favorito");
		u4.setresposta_seg("O ultimo olimpiano");
		u4.setSenha("Ws12345@");
		
		Usuario u5= new Usuario("Larissa");
		u5.setEmail("larissa12_gomes@hotmail.com");
		u5.setPergunta_seg("Animal de Estimacao");
		u5.setresposta_seg("Snow");
		u5.setSenha("Lg12345@");
		
		Usuario u6= new Usuario("Bruno");
		u6.setEmail("brunnoaalleexandre@gmail.com");
		u6.setPergunta_seg("Livro favorito");
		u6.setresposta_seg("Do mil ao Milhao");
		u6.setSenha("Ba12345@");
		
		Usuario u7= new Usuario("Francisco");
		u7.setEmail("francisco.vrs.lira@gmail.com");
		u7.setPergunta_seg("Amigo de Infancia");
		u7.setresposta_seg("Fernando");
		u7.setSenha("Fl12345@");
		
		usuarioDAO.save(u1);
		usuarioDAO.save(u2);
		usuarioDAO.save(u3);
		usuarioDAO.save(u4);
		usuarioDAO.save(u5);
		usuarioDAO.save(u6);
		usuarioDAO.save(u7);


	}
	

}
