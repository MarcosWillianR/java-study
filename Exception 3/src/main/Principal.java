package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("Digite o número 1 ou 2:");
			System.out.println();
			try {
				opcao = teclado.nextInt();
				switch(opcao) {
					case 1:
						System.out.println("Você digitou a opção " + opcao);
						break;
					case 2:
						System.out.println("Você digitou a opção " + opcao);
						break;
					default:
						throw new Exception("Erro");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("-----------------");
			}
		} while (true);
	}

}
