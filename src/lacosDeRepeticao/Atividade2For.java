package lacosDeRepeticao;

import java.io.InputStream;
import java.util.Scanner;

public class Atividade2For {

	public static void main(String[] args) {
		
		int num, par = 0, impar = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 10 números para saber o total de números pares e ímpares.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o "+ i +"º número: ");
			num = leia.nextInt();
			if(num % 2 == 0) {
				par++;
			}
			if(num % 2 == 1) {
				impar++;
			}
		}
		
		System.out.printf("\nTotal de números pares: " + par);
		System.out.printf("\nTotal de números ímpares: " + impar);

	}

}
