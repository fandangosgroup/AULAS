package com.github.fabegalo.programa;

import java.util.Scanner;

import com.github.fabegalo.classes.Usuario;

public class main {

	public static void main(String[] args) {
		
		Boolean exit = false;
		UsuarioRepositorio users = new UsuarioRepositorio();
		Usuario user = null;
		
		try (Scanner scan = new Scanner(System.in)){
			while(!exit) {
				
				if(user.getNome().isEmpty()) {
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
				}
				
				
				
			}
			
			
		}
		
		

	}

}
