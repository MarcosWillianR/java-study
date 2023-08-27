package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite numeros inteiros (digite um valor negativo para sair):");
        
        while (true) {
            System.out.print("Digite um numero: ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                break;
            }
            
            numbers.add(number);
        }
        
        scanner.close();
        
        System.out.println("Numeros armazenados: " + numbers);
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Soma total dos numeros: " + sum);
    }

}
