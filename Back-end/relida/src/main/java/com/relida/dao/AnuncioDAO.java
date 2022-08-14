package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relida.model.Anuncio;
import com.relida.model.Usuario;

public interface AnuncioDAO<S> extends JpaRepository<Anuncio, Integer> {

	Anuncio findByValorAndTituloAndAutorAndOutrosAndCidade(double valor, String titulo, String autor, String outros, String cidade);

	Anuncio findByTitulo(String foto_anuncio);
	
}
