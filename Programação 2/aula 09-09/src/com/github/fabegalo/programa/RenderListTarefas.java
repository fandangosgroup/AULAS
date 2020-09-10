package com.github.fabegalo.programa;

import java.util.ArrayList;

import com.github.fabegalo.classes.Tarefas;
import com.github.fabegalo.classes.Usuario;

public class RenderListTarefas {
	
	
	private Usuario user;
	private ArrayList<Tarefas> tarefas;
	
	public RenderListTarefas(Usuario user, ArrayList<Tarefas> tarefas) {
		this.user = user;
		this.tarefas = tarefas;
		
		viewList();
	}
	
	public Usuario getUser() {
		return user;
	}

	public ArrayList<Tarefas> getTarefas() {
		return tarefas;
	}

	private void viewList(){
		System.out.println("------Suas Tarefas--"+getUser().getNome()+"------");
		for(Tarefas task : getTarefas()) {
			String check;
			check = (task.getStatus() == "Concluido") ?  "X": "";
			System.out.println("-["+check+"]"+task.getTitulo()+"-----");
		}
		System.out.println("--------------------------");
	}
}
