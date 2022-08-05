package com.relida.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaLivro {
	
	//Construtores
	protected CategoriaLivro() {}
	protected CategoriaLivro(String categoria) {
		this.categoria = categoria;
	}
	
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String categoria;

	//Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	@Override
	public String toString() {
		return "CategoriaLivro [categoria=" + categoria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaLivro other = (CategoriaLivro) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
}
