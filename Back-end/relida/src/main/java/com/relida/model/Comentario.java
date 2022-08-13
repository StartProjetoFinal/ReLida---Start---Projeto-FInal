package com.relida.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Comentario {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length=256)
	private String comentario;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Anuncio anuncio;
	
	@OneToOne
	private Comentario recomentario;
	
	
	
	
	//Construtores
	public Comentario() {
		super();
	}
	
	public Comentario(String comentario, Usuario usuario, Anuncio anuncio) {
		super();
		this.comentario = comentario;
		this.usuario = usuario;
		this.anuncio = anuncio;
	}

	public Comentario(String comentario, Usuario usuario, Anuncio anuncio, Comentario recomentario) {
		super();
		this.comentario = comentario;
		this.usuario = usuario;
		this.anuncio = anuncio;
		this.recomentario = recomentario;
	}
	
	public Comentario(String comentario) {
		super();
		this.comentario = comentario;
	}

	public Comentario(String comentario, Usuario usuario) {
		super();
		this.comentario = comentario;
		this.usuario = usuario;
	}
	

	
	
	//Métodos
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public Comentario getRecomentario() {
		return recomentario;
	}

	public void setRecomentario(Comentario recomentario) {
		this.recomentario = recomentario;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(anuncio, comentario, id, recomentario, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		return Objects.equals(anuncio, other.anuncio) && Objects.equals(comentario, other.comentario)
				&& Objects.equals(id, other.id) && Objects.equals(recomentario, other.recomentario)
				&& Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", comentario=" + comentario + ", usuario_id=" + usuario + ", anuncio_id="
				+ anuncio + ", recomentario_id=" + recomentario + "]";
	}

	
}
