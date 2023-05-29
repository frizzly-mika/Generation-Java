package arraysVetoresMatrizes;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade4Matriz {

	public static void main(String[] args) {
		
		int linha, coluna;
		double nota, soma = 0.0, media = 0.0, matriz [][] = new double[10][4],/*	 {{4.0, 5.0, 7.0, 3.0},
															  {2.5, 6.5, 4.7, 8.0},
															  {10.0, 8.5, 9.5, 8.0},
															  {9.0, 6.5, 7.6, 8.2},
															  {5.0, 5.0, 5.0, 6.3},
															  {7.0, 8.0, 9.0, 8.5},
															  {5.5, 3.5, 2.5, 1.0},
															  {8.0, 9.0, 10.0, 9.5},
															  {5.6, 5.8, 6.5, 7.0},
															  {7.5, 8.5, 9.5, 10.0}},*/ vet[] = new double [10];
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				System.out.println("Digite sua nota: ");
				matriz [linha][coluna] = leia.nextDouble();
				
			}
		}
		
		for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				soma += matriz[linha][coluna];
				
			}
			
			media = soma/4;
			soma = 0;
			vet[linha] = media;
		}
		
		System.out.printf("Médias: ");
		for(linha = 0; linha < vet.length; linha++) {
			System.out.printf("%-7.1f", vet[linha]);
		}

	}

}
