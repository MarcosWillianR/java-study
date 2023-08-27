package main;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		LinkedList<String> listaNome = new LinkedList<>();
		listaNome.add("Marcos");
		listaNome.add("Gisele");
		listaNome.add("Giovana");
		listaNome.add("Julia");
		
		System.out.println("Antes");
		
		for (String nome: listaNome) {
			System.out.println(nome);
		}
		
		listaNome.set(1, "Jujuba");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Depois");
		
		for (String nome: listaNome) {
			System.out.println(nome);
		}
	}

}
