package com.relida.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	//Construtores
	
		public Usuario(String nome, String email, String senha, String pergunta_seg, String resposta_seg) {
			super();
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			this.pergunta_seg = pergunta_seg;
			this.resposta_seg = resposta_seg;
		}
		

		public Usuario(String nome, String email, String senha, String resposta_seg) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.resposta_seg = resposta_seg;
		}
		


		public Usuario(String nome, String email, String resposta_seg) {
			super();
			this.nome = nome;
			this.email = email;
			this.resposta_seg = resposta_seg;
		}


		public Usuario() {
			super();
		}
		
		public Usuario(String email, String senha) {
			super();
			this.email = email;
			this.senha = senha;
		}

		public Usuario(String email) {
			super();
			this.email = email;
		}

		
		
		
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length=100)
	private String nome;
	
	@Column(length=100)
	private String email;
	
	@Column(length=25)
	private String senha;
	
	private String pergunta_seg;
	
	@Column(length=100)
	private String resposta_seg;
	
	
	
	//Métodos
	public String getSenha() {
		return senha;
	}

	public String getPergunta_seg() {
		return pergunta_seg;
	}


	public void setPergunta_seg(String pergunta_seg) {
		this.pergunta_seg = pergunta_seg;
	}


	public String getresposta_seg() {
		return resposta_seg;
	}

	public void setresposta_seg(String resposta_seg) {
		this.resposta_seg = resposta_seg;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	

	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", pergunta_seg="
				+ pergunta_seg + ", resposta_seg=" + resposta_seg + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, pergunta_seg, resposta_seg, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(pergunta_seg, other.pergunta_seg)
				&& Objects.equals(resposta_seg, other.resposta_seg) && Objects.equals(senha, other.senha);
	}
	
	
}


