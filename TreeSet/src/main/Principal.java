package main;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		Set<String> listaNome = new TreeSet<>();
		listaNome.add("Marcos");
		listaNome.add("Gisele");
		listaNome.add("Giovana");
		listaNome.add("Julia");
		
		Iterator<String> iterator = listaNome.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
