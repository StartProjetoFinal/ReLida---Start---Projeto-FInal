package com.relida.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Anuncio {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	private Usuario anunciante;
	
	private String tipo_operacao;
	
	private String categoria;
	
	private double valor;
	
	@Column(length=200)
	private String titulo;

	@Column(length=100)
	private String autor;
	
	@DateTimeFormat(style = "yyyy") //Verificar atributo name em cadastrar_livro >form>input
	private String data_edicao;
	
	@Column(length=50)
	private String outros;

	@Column(length=50)
	private String cidade;
	
	private String estado;
	
	@Column(length=11) //Ver no html
	private String cep;
	
	@Lob
	private byte[] foto_anuncio;  // Ver como salvar foto no static e só pegar a string do diretório
	
	@Column(length=500)
	private String comentario;
	
	
	
	
	
	//Construtores
	public Anuncio() {
		super();
	}
	
	public Anuncio(Usuario anunciante, String tipo_operacao, String categoria, double valor,
			String titulo, String autor, String data_edicao, String outros, String cidade, String estado, String cep,
			byte[] foto_anuncio, String comentario) {
		super();
		this.anunciante = anunciante;
		this.tipo_operacao = tipo_operacao;
		this.categoria = categoria;
		this.valor = valor;
		this.titulo = titulo;
		this.autor = autor;
		this.data_edicao = data_edicao;
		this.outros = outros;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.foto_anuncio = foto_anuncio;
		this.comentario = comentario;
	}
	public Anuncio(Usuario anunciante, String tipo_operacao, String categoria, double valor,
			String titulo, String autor, String data_edicao, String outros, String cidade, String estado, String cep, String comentario) {
		super();
		this.anunciante = anunciante;
		this.tipo_operacao = tipo_operacao;
		this.categoria = categoria;
		this.valor = valor;
		this.titulo = titulo;
		this.autor = autor;
		this.data_edicao = data_edicao;
		this.outros = outros;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.comentario = comentario;
	}
	//Construtor com campos não obrigatórios:
	public Anuncio(Integer id, Usuario anunciante, String tipo_operacao, String categoria, double valor,
			String titulo, String cidade, String estado, String cep, byte[] foto_anuncio) {
		super();
		this.id = id;
		this.anunciante = anunciante;
		this.tipo_operacao = tipo_operacao;
		this.categoria = categoria;
		this.valor = valor;
		this.titulo = titulo;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.foto_anuncio = foto_anuncio;
	}
	

public Anuncio(double valor, String titulo, String autor, String outros, String cidade) {
		super();
		this.valor = valor;
		this.titulo = titulo;
		this.autor = autor;
		this.outros = outros;
		this.cidade = cidade;
	}

	
	
	
	//Métodos
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getAnunciante() {
		return anunciante;
	}

	public void setAnunciante(Usuario anunciante) {
		this.anunciante = anunciante;
	}

	public String getTipo_operacao() {
		return tipo_operacao;
	}

	public void setTipo_operacao(String tipo_operacao) {
		this.tipo_operacao = tipo_operacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getData_edicao() {
		return data_edicao;
	}

	public void setData_edicao(String data_edicao) {
		this.data_edicao = data_edicao;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public byte[] getFoto_anuncio() {
		return foto_anuncio;
	}

	public void setFoto_anuncio(byte[] foto_anuncio) {
		this.foto_anuncio = foto_anuncio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Anuncio [id=" + id + ", anunciante=" + anunciante + ", tipo_operacao=" + tipo_operacao + ", categoria="
				+ categoria + ", valor=" + valor + ", titulo=" + titulo + ", autor=" + autor + ", data_edicao="
				+ data_edicao + ", outros=" + outros + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", foto_anuncio=" + foto_anuncio + ", comentario=" + comentario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anunciante, autor, categoria, cep, cidade, comentario, data_edicao, estado, foto_anuncio,
				id, outros, tipo_operacao, titulo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anuncio other = (Anuncio) obj;
		return Objects.equals(anunciante, other.anunciante) && Objects.equals(autor, other.autor)
				&& Objects.equals(categoria, other.categoria) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(comentario, other.comentario)
				&& Objects.equals(data_edicao, other.data_edicao) && Objects.equals(estado, other.estado)
				&& Objects.equals(foto_anuncio, other.foto_anuncio) && Objects.equals(id, other.id)
				&& Objects.equals(outros, other.outros) && Objects.equals(tipo_operacao, other.tipo_operacao)
				&& Objects.equals(titulo, other.titulo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
		
}