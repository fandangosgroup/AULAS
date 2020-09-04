package com.github.fabegalo;

public class Programa {

	public static void main(String[] args) {
		
		RepositorioPessoa repositorio = new RepositorioPessoa();
		
		Pessoa p1 = new Pessoa("João vitor", "001002005");
		Pessoa p2 = new Pessoa("Ana", "222002005");
		
		repositorio.pessoas.add(p1);
		repositorio.pessoas.add(p2);
	}

}
