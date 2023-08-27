package main;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<String> listaNome = new ArrayList<>();
		listaNome.add("Marcos");
		listaNome.add("Gisele");
		listaNome.add("Giovana");
		listaNome.add("Julia");
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}
	}

}
