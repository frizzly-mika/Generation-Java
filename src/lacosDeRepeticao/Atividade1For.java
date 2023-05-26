package lacosDeRepeticao;

import java.util.Scanner;

public class Atividade1For {

	public static void main(String[] args) {
		
		int x, num1, num2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Saiba os números que são múltiplos de 3 e 5");
		System.out.println("\nDigite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		num2 = leia.nextInt();
		
		if(num2 > num1) {
			System.out.println("No Intervalo entre " + num1 + " e " + num2 + ":");
			for (x = num1; x < num2; x++) {
				if(x % 3 == 0 && num1 % 5 == 0) {
					System.out.println(x + " é múltiplo de 3 e 5.");
					
				}
			}
		}else if(num1<num2) {
			System.out.println("Intervalo Inválido.");
		}else {
			System.out.println("Número Inválido.");
		}
		

	}

}
