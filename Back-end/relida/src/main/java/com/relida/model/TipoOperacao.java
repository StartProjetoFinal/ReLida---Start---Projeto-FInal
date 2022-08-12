package com.relida.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoOperacao {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
		
	@Column(length=10)
	private String tipo;
		

	
	//Construtores
	public TipoOperacao(String tipo) {
			this.tipo = tipo;
	}	
	public TipoOperacao() {
			super();
		}
	
	

	//Métodos
	public Integer getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}


	@Override
	public String toString() {
		return "TipoOperacao [id=" + id + ", tipo=" + tipo + "]";
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, tipo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoOperacao other = (TipoOperacao) obj;
		return Objects.equals(id, other.id) && Objects.equals(tipo, other.tipo);
	}
			
}
