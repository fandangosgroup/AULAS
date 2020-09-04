package com.github.fabegalo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileIO {
	
	public static void writer(List<Pessoa> pessoas, String nomeArquivo) throws IOException {
		FileWriter fileWriter = new FileWriter(nomeArquivo);
		
		try(BufferedWriter writer = new BufferedWriter(fileWriter)){
			
			List<String> dados = pessoas
					.stream().map(pessoa -> pessoa.toString())
					.collect(Collectors.toList());
			
			for(String linha : dados) {
				writer.write(linha);
			}
		}
		
	}
	
	public static ArrayList<Pessoa> reader(String nomeArquivo) throws IOException {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		FileReader fileReader = new FileReader(nomeArquivo);
		
		try (BufferedReader reader = new BufferedReader(fileReader)) {
			String dado = "";
			while ((dado = reader.readLine()) != null) {
				System.out.println(dado);
			}
		}
		
		return pessoas;
	}
}
