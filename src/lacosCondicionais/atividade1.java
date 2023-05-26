package lacosCondicionais;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		a = leia.nextInt();
		System.out.println("Digite o número B:");
		b = leia.nextInt();
		System.out.println("Digite o número C:");
		c = leia.nextInt();
		
		if(a+b>c) {
			System.out.println("\nA soma de A + B é Maior que C.");
		}else if(a+b<c) {
			System.out.println("\nA soma de A + B é Menor que C.");
		}else if(a+b == c) {
			System.out.println("\nA soma de A + B é Igual a C.");
		}

	}

}
