package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relida.domain.Anuncio;

public interface AnuncioDAO extends JpaRepository<Anuncio, Integer> {
	
}
