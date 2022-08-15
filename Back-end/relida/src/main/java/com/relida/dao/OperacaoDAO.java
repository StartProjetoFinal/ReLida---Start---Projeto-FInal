package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relida.model.Operacao;


public interface OperacaoDAO<S> extends JpaRepository<Operacao, Integer> {

}
