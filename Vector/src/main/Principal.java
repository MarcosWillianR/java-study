package main;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		Vector<String> listaNome = new Vector<>();
		listaNome.add("Marcos");
		listaNome.add("Gisele");
		listaNome.add("Giovana");
		listaNome.add("Julia");
		
		for(String nome: listaNome) {
			System.out.println(nome);
		}
	}

}
