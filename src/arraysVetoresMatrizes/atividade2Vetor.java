package arraysVetoresMatrizes;

import java.util.Scanner;

public class atividade2Vetor {

	public static void main(String[] args) {
		
		int i, impar, par, soma = 0, vet[] = new int [10];
		double media;
		Scanner leia = new Scanner(System.in); 
		
		
		System.out.println("Insira 10 números inteiros (um por vez)");
		for(i = 0; i < 10; i++) {
			System.out.printf("Insira o " + (i + 1) + "º número: ");
			vet[i] = leia.nextInt();
		}
		
		System.out.println("\nElementos nos índices ímpares:");
		for(impar = 1; impar < vet.length; impar = impar + 2) {
			System.out.printf(vet[impar] + " ");
		}
		System.out.println("\n");
		System.out.println("\nElementos pares:");
		for(par = 0; par < vet.length; par++) {
			soma = soma + vet[par];
			if(vet[par] % 2 == 0) {
				System.out.printf(vet[par]+" ");
			}
		}
		System.out.println("\n");
		media = soma/10;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}

}
