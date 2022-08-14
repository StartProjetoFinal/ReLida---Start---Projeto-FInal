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


	}
	

}
