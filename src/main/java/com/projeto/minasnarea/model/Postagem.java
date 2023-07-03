package com.projeto.minasnarea.model;


import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")

public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo titulo é Obrigatório!" )
	@Size(min = 5, max = 100, message = "O atributo titulo deve conter no minimo 5 e no maximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "O atributo texto é Obrigatório!" )
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no minimo 10 e no maximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Minas tema;
	
	// get e set
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Minas getTema() {
		return tema;
	}

	public void setMinas(Minas tema) {
		this.tema = tema;
	}	
}