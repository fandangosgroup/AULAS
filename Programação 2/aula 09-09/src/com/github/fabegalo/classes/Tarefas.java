package com.github.fabegalo.classes;

public class Tarefas {
	
	private int id;
	private String status;
	private Usuario usuario;
	private String titulo;
	private String descricao;
	
	public Tarefas(int id, String status, Usuario usuario, String titulo, String descricao) {
		this.id = id;
		this.status = status;
		this.usuario = usuario;
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
