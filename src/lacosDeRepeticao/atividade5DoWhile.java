package lacosDeRepeticao;

import java.util.Scanner;

public class atividade5DoWhile {

	public static void main(String[] args) {
		int num, soma = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva uma sequência numérica para descobrir qual a soma dos números positivos.");
		System.out.println("São aceitos números positivos e negativos. O número '0' encerra a operação a sequência.\n");
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0) {
				soma = soma + num;
			}
			
		}while (num != 0);
		
		System.out.println("\nA soma dos números positivos é: "+ soma);

	}

}
