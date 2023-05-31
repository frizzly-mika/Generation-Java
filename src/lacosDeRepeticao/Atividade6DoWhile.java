package lacosDeRepeticao;

import java.util.Scanner;

public class Atividade6DoWhile {

	public static void main(String[] args) {
		int cont = 0, num;
		float  soma = 0, med = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva uma sequência numérica para descobrir qual a média de todos os números múltiplos de 3.");
		System.out.println("São aceitos números positivos e negativos. O número '0' encerra a operação a sequência.\n");
		
		do {
			System.out.printf("Digite um número: ");
			num = leia.nextInt();
			
			if(num % 3 == 0 && num > 0) {
				soma = soma + num;
				cont++;
			}
			
		}while (num != 0);
		
		med = soma/cont;
		System.out.printf("\nA média de todos os números múltiplos de 3 é: " + med);
	}

}
