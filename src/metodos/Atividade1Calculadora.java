package metodos;

import java.util.Scanner;

public class Atividade1Calculadora {

	public static void main(String[] args) {
		
		float num1, num2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" _______________");
		System.out.println("|               |");
		System.out.println("|  Calculadora  |");
		System.out.println("|_______________|");
		System.out.printf("\nDigite um número: ");
		num1 = leia.nextFloat();
		System.out.printf("Digite outro número: ");
		num2 = leia.nextFloat();
		
		System.out.println("\n ________________");
		System.out.println("|                |");
		System.out.println("|   Resultados   |");
		System.out.println("|________________|");
		System.out.printf("\nSoma: " + soma(num1, num2));
		System.out.printf("\nSubtração: " + sub(num1, num2));
		System.out.printf("\nMultiplicação: " + mult(num1, num2));
		System.out.printf("\nDivisão: " + div(num1,num2));
				
	}
	
	public static float soma(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float sub(float num1, float num2) {
		return num1 - num2;
	}
	
	public static float mult(float num1, float num2) {
		return num1 * num2;
	}
	
	public static float div(float num1, float num2) {
		return num1 / num2;
	}

}
