package com.github.fabegalo.programa;

import java.util.ArrayList;
import java.util.Scanner;

import com.github.fabegalo.classes.Tarefa;
import com.github.fabegalo.classes.Usuario;

public class main {

	public static void main(String[] args) {
		
		Boolean exit = false;
		UsuarioRepositorio users = new UsuarioRepositorio();
		TarefasRepositorio tarefas = new TarefasRepositorio();
		Usuario user = null;
		ArrayList<Tarefa> tarefa = new ArrayList<Tarefa>();
		
		try (Scanner scan = new Scanner(System.in)){
			while(!exit) {
				
				if(user == null) {
					System.out.println("-----Bem vindo ao controle de tarefas---- --");
					System.out.println("-                                          -");
					System.out.println("-                [1]Logar                  -");
					System.out.println("-                [2]Registrar-Se           -");
					System.out.println("-                [3]Encerrar               -");
					System.out.println("-                                          -");
					System.out.println("--------------------------------------------");
					
					String input = scan.nextLine();
					
					
					switch(input) {
						case "1":
							String usuario;
							System.out.println("Digite o usuario: ");
							usuario = scan.nextLine();
							user = users.getUserInList(usuario);
							break;
							
						case "2":
							int id = users.getNextID();
							String newNome;
							String newEmail;
							String newCargo;
							
							System.out.println("---Cadastro de Usuario---");
							
							System.out.println("Insira um nome: ");
							newNome = scan.nextLine();
							
							System.out.println("Insira um email: ");
							newEmail = scan.nextLine();
							
							
							System.out.println("Insira um cargo: ");
							newCargo = scan.nextLine();
							
							user = new Usuario(id, newNome, newEmail, newCargo);
							users.addUser(user);
							break;
							
						case "3":
							exit = true;
							break;
						
						default:
							exit = true;
					}
				}else {
					Boolean taskControl = false;
					RenderListTarefas tasks = null;
					
					if(taskControl) {
						System.out.println("-----Bem vindo "+user.getNome()+"-----------");
						System.out.println("-                                          -");
						System.out.println("-                [1]Gerenciar Tarefas      -");
						System.out.println("-                [2]Deslogar               -");
						System.out.println("-                [3]Encerrar               -");
						System.out.println("-                                          -");
						System.out.println("--------------------------------------------");
						
						
						String input = scan.nextLine();
						
						
						switch(input) {
							case "1":
								taskControl = true;
								tasks = new RenderListTarefas(user, tarefa);
								break;
							case "2":
								user = null;
								break;
								
							case "3":
								exit = true;
								break;
							
							default:
								exit = true;
						}
					}else {
						System.out.println("-----Bem vindo "+user.getNome()+"-----------");
						System.out.println("-                                          -");
						System.out.println("-                [1]Adicionar Tarefa       -");
						System.out.println("-                [2]Remover Tarefa         -");
						System.out.println("-                [3]Concluir Tarefa        -");
						System.out.println("-                [4]Sair                   -");
						System.out.println("-                                          -");
						System.out.println("--------------------------------------------");
						
						
						String input = scan.nextLine();
						
						
						switch(input) {
							case "1":
								tasks.addTask(new Tarefa(0, input, user, input, input));
								break;
							case "2":
								tasks.removeTask();
								break;
								
							case "3":
								tasks.endTask();
								break;
								
							case "4":
								tarefas.updateTaskListUser(tasks.getTarefas());
								taskControl = false;
								break;
							
							default:
								exit = true;
						}
					}
					
					
					
				}
				
				
				
			}
			
			
		}
		
		

	}

}
