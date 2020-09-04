package com.github.fabegalo;

public class Pessoa {

	private int id;
	private String nome;
	private String rg;
	
	public Pessoa(String nome, String rg){
		this.nome = nome;
		this.rg = rg;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	

}
