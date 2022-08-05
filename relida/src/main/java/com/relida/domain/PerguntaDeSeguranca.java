package com.relida.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PerguntaDeSeguranca {
	
	//Construtores
	protected PerguntaDeSeguranca () {}
	protected PerguntaDeSeguranca (String pergunta) {
		this.pergunta = pergunta;
	}
	
	
	
	//Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	
	private String pergunta;

	//Getters e Setters

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPergunta() {
		return pergunta;
	}


	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}


	
	@Override
	public String toString() {
		return "PerguntaDeSeguranca [pergunta=" + pergunta + "]";
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
		PerguntaDeSeguranca other = (PerguntaDeSeguranca) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
