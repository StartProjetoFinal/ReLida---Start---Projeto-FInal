package com.relida.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

}
