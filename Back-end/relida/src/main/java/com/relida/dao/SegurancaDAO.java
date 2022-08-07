package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relida.domain.PerguntaDeSeguranca;

public interface SegurancaDAO {

	public interface AnuncioDAO extends JpaRepository<PerguntaDeSeguranca, Integer> {
		
	}

	
}
