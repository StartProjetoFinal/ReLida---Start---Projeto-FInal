package com.relida.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relida.model.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

	Usuario findByEmailAndSenha(String email, String senha);
//		String findByNome(String nome);
	Usuario findByEmail(String email);
}
