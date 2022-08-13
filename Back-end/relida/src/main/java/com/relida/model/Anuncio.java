package com.relida.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@ManyToOne
	private TipoOperacao tipo_operacao;
	
	@ManyToOne
	private CategoriaLivro categoria;
	
	private double valor;
	
	@Column(length=200)
	private String titulo;

	@Column(length=100)
	private String autor;
	
	@DateTimeFormat(style = "yyyy-MM-dd") //Verificar atributo name em cadastrar_livro >form>input
	private LocalDate data_edicao;
	
	@Column(length=50)
	private String outros;

	@Column(length=50)
	private String cidade;
	
	@ManyToOne
	private Estado estado;
	
	@Column(length=8) //Ver no html
	private Long cep;
	
	@Column(length=100)
	private String foto_diretorio;  // Ver como salvar foto no static e só pegar a string do diretório
	
	@Column(length=500)
	private String comentario;
	
	
	
	
	//Construtores
	public Anuncio() {
		super();
	}
	
	public Anuncio(Usuario anunciante, TipoOperacao tipo_operacao, CategoriaLivro categoria, double valor,
			String titulo, String autor, LocalDate data_edicao, String outros, String cidade, Estado estado, Long cep,
			String foto_diretorio, String comentario) {
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
		this.foto_diretorio = foto_diretorio;
		this.comentario = comentario;
	}
	//Construtor com campos não obrigatórios:
	public Anuncio(Integer id, Usuario anunciante, TipoOperacao tipo_operacao, CategoriaLivro categoria, double valor,
			String titulo, String cidade, Estado estado, Long cep, String foto_diretorio) {
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
		this.foto_diretorio = foto_diretorio;
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

	public TipoOperacao getTipo_operacao() {
		return tipo_operacao;
	}

	public void setTipo_operacao(TipoOperacao tipo_operacao) {
		this.tipo_operacao = tipo_operacao;
	}

	public CategoriaLivro getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaLivro categoria) {
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

	public LocalDate getData_edicao() {
		return data_edicao;
	}

	public void setData_edicao(LocalDate data_edicao) {
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getFoto_diretorio() {
		return foto_diretorio;
	}

	public void setFoto_diretorio(String foto_diretorio) {
		this.foto_diretorio = foto_diretorio;
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
				+ ", foto_diretorio=" + foto_diretorio + ", comentario=" + comentario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anunciante, autor, categoria, cep, cidade, comentario, data_edicao, estado, foto_diretorio,
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
				&& Objects.equals(foto_diretorio, other.foto_diretorio) && Objects.equals(id, other.id)
				&& Objects.equals(outros, other.outros) && Objects.equals(tipo_operacao, other.tipo_operacao)
				&& Objects.equals(titulo, other.titulo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
		
}