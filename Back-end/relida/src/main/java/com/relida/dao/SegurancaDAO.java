package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relida.model.PerguntaDeSeguranca;

@Repository
public interface SegurancaDAO extends JpaRepository<PerguntaDeSeguranca, Integer> {
	
	String findByname (String pergunta);
	
	}
