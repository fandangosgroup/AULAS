package com.github.fabegalo.programa;

import java.util.ArrayList;

import com.github.fabegalo.classes.Tarefa;
import com.github.fabegalo.classes.Usuario;

public class TarefasRepositorio {
	ArrayList<Tarefa> repositorioTarefa = new ArrayList<Tarefa>();
	
	
	public ArrayList<Tarefa> getTarefasInUser(Usuario user){
		
		ArrayList<Tarefa> aux = new ArrayList<Tarefa>();
		
		for(Tarefa task : repositorioTarefa) {
			if(user == task.getUsuario()) {
				aux.add(task);
			}
		}
		
		return aux;
		
	}
	
	public void updateTaskListUser(ArrayList<Tarefa> tasks) {
		
	}

}
