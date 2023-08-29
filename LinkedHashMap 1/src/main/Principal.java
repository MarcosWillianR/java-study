package main;

import java.util.LinkedHashMap;

public class Principal {

	public static void main(String[] args) {
		LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
		listaNomes.put("mar", "Marcos");
		listaNomes.put("jo", "João");
		listaNomes.put("juc", "Juca");
		System.out.println("LinkedHashMap1: " + listaNomes);
		
		LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes);
		novaListaNomes.put("Jubis", "Jujuba");
		System.out.println("LinkedHashMap2: " + novaListaNomes);
	}
}
