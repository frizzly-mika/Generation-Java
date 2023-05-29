package arraysVetoresMatrizes;

import java.util.Scanner;

public class atividade3Matriz {

	public static void main(String[] args) {
		
		int soma = 0, soma2 = 0, linha, coluna, matriz[][] = new int [3][3];
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Digite um valor para compor a matriz: [" + linha + "][" + coluna + "]: "); 
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println("\n");
		System.out.printf("Diagonal principal: ");
		for(linha = 0; linha < matriz.length; linha++) {
				System.out.print(matriz[linha][linha] + " ");
				soma += matriz[linha][linha];
		}
		
		
		System.out.println("\n");
		System.out.printf("Diagonal secundária: ");
		for(linha = 0; linha < matriz.length; linha++) {
				System.out.print(matriz[linha][3 - 1 - linha] + " ");
				soma2 += matriz[linha][3 - 1 - linha];
		}

		System.out.println("\n\nSoma dos elementos da diagonal principal: " + soma);
		System.out.println("\nSoma dos elementos da diagonal secundária: " + soma2);
		
	}

}
