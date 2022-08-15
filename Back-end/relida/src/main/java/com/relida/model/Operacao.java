package com.relida.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Operacao {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	private Anuncio anuncio;
	
	@ManyToOne
	private Usuario usuario;
	
	@DateTimeFormat(style = "yyyy-mm-dd hh:mm:ss") 
	private String data_hora_operacao;

	
	//Construtores
	public Operacao(Anuncio anuncio, Usuario usuario, String data_hora_operacao) {
		super();
		this.anuncio = anuncio;
		this.usuario = usuario;
		this.data_hora_operacao = data_hora_operacao;
	}

	public Operacao() {
		super();
	}

	public Operacao(Anuncio anuncio, Usuario usuario) {
		super();
		this.anuncio = anuncio;
		this.usuario = usuario;
	}

	
	
	//Métodos
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getData_hora_operacao() {
		return data_hora_operacao;
	}

	public void setData_hora_operacao(String data_hora_operacao) {
		this.data_hora_operacao = data_hora_operacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anuncio, data_hora_operacao, id, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operacao other = (Operacao) obj;
		return Objects.equals(anuncio, other.anuncio) && Objects.equals(data_hora_operacao, other.data_hora_operacao)
				&& Objects.equals(id, other.id) && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Operacao [id=" + id + ", anuncio=" + anuncio + ", usuario=" + usuario + ", data_hora_operacao="
				+ data_hora_operacao + "]";
	}
	
		
}
