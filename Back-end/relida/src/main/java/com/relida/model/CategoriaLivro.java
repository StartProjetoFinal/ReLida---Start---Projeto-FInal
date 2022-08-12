package com.relida.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaLivro {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length=15)
	private String categoria;
	
	
	
	//Construtores
	public CategoriaLivro() {}
	public CategoriaLivro(String categoria) {
		this.categoria = categoria;
	}
	
	

	//Métodos
	public Integer getId() {
		return id;
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
