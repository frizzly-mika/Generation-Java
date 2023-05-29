package arraysVetoresMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class atividade1Vetor {

	public static void main(String[] args) {
		
		int num, vetInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean teste = false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Conforma a sequência abaixo, digite o número que você deseja encontrar:");
		System.out.println("| 2 | 5 | 1 | 3 | 4 | 9 | 7 | 8 | 10 | 6 |\n");
		num = leia.nextInt();
		
		for(int i = 0; i < vetInteiros.length; i++) {
			if(num == vetInteiros[i]) {
				System.out.println("O número " + num + " está localizado na posição: " + i);
				teste = true;
			}
		}
		
		if(teste == false) {
			System.out.println("O número " + num + " não foi encontrado.");
		}
		
		
	}

}
