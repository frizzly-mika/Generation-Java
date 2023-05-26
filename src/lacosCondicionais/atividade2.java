package lacosCondicionais;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		int num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é par ou ímpar e negativo ou positivo:");
		num = leia.nextInt();
		
		if(num % 2 == 0 && num >= 0) {
			System.out.println("\nO número " + num + " é par e positivo.");
		}else if(num % 2 == 0 && num <= 0) {
			System.out.println("\nO número " + num + " é par e negativo.");
		}else if(num % 1 == 0 && num > 0) {
			System.out.println("\nO número " + num + " é ímpar e positivo.");
		}else if(num % 1 == 0 && num < 0) {
			System.out.println("\nO número " + num + " é ímpar e negativo.");
		}

	}
	
}
