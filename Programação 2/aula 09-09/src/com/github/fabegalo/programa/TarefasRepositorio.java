package com.github.fabegalo.programa;

import java.util.ArrayList;

import com.github.fabegalo.classes.Tarefas;
import com.github.fabegalo.classes.Usuario;

public class TarefasRepositorio {
	ArrayList<Tarefas> repositorioTarefa = new ArrayList<Tarefas>();
	
	
	public ArrayList<Tarefas> getTarefasInUser(Usuario user){
		
		ArrayList<Tarefas> aux = new ArrayList<Tarefas>();
		
		for(Tarefas task : repositorioTarefa) {
			if(user == task.getUsuario()) {
				aux.add(task);
			}
		}
		
		return aux;
		
	}

}
