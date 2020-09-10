package com.github.fabegalo.programa;

import java.util.ArrayList;

import com.github.fabegalo.classes.Tarefa;
import com.github.fabegalo.classes.Usuario;

public class RenderListTarefas {
	
	
	private Usuario user;
	private ArrayList<Tarefa> tarefas;
	
	public RenderListTarefas(Usuario user, ArrayList<Tarefa> tarefas) {
		this.user = user;
		this.tarefas = tarefas;
		
		viewList();
	}
	
	public Usuario getUser() {
		return user;
	}
	
	public void removeTask() {
		
	}
	
	public void addTask(Tarefa task) {
		tarefas.add(task);
	}
	
	public void endTask() {
		
	}

	public ArrayList<Tarefa> getTarefas() {
		return tarefas;
	}

	private void viewList(){
		System.out.println("------Suas Tarefas--"+getUser().getNome()+"------");
		for(Tarefa task : getTarefas()) {
			String check;
			check = (task.getStatus() == "Concluido") ?  "X": "";
			System.out.println("-["+check+"]"+task.getTitulo()+"-----");
		}
		System.out.println("--------------------------");
	}
}
