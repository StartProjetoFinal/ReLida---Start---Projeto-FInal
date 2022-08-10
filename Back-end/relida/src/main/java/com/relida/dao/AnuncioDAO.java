package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relida.model.Anuncio;

public interface AnuncioDAO<S> extends JpaRepository<Anuncio, Integer> {

	Anuncio findByValorAndTituloAndAutorAndOutrosAndCidade(double valor, String titulo, String autor, String outros, String cidade);
	
}
