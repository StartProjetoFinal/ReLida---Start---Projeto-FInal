package com.relida.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String estado;
	
	
	
	//Construtores
	public Estado(String estado) {
		super();
		this.estado = estado;
	}

	public Estado() {
		super();
	}
	
	
	
	
	// Métodos
	public String getEstado() {
		return estado;
	}
	

	@Override
	public String toString() {
		return "Estado [estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(estado, other.estado);
	}
	
	

}
