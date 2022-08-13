package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relida.model.Comentario;

public interface ComentarioDAO<S> extends JpaRepository<Comentario, Integer> {

}
