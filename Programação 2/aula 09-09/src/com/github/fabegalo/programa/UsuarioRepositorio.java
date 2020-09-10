package com.github.fabegalo.programa;

import java.util.ArrayList;

import com.github.fabegalo.classes.Usuario;

public class UsuarioRepositorio {
	ArrayList<Usuario> repositorioUsuario = new ArrayList<Usuario>();
	
	
	public void addUser(Usuario e) {
		repositorioUsuario.add(e);
	}
	
	public int getNextID() {
		return repositorioUsuario.size();
	}
	
	
	public Usuario getUserInList(String name) {
		
		
		for(Usuario user : repositorioUsuario) {
			if(user.getNome() == name) {
				return user;
			}
		}
		
		
		return null;
	}
}
