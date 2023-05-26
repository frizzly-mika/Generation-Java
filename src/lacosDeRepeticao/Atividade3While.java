package lacosDeRepeticao;

import java.util.Scanner;

public class Atividade3While {

	public static void main(String[] args) {
		
		int idade = 0, idadeMin = 21, idadeMax = 50, menorIdade = 0, maiorIdade = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Descubra quantas pessoas são menores de 21 e quantas são maiores de 50.");
		System.out.println("Escreva quantas idades quiser. Para encerrar digite um número negativo\n");
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0 ) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < idadeMin && idade > 0) {
				menorIdade++;
			}else if(idade > idadeMax) {
				maiorIdade++;
			}
			
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menorIdade);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade);
	}

}
