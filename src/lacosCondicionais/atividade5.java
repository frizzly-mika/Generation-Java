package lacosCondicionais;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		
		int cod, qtd, tot, hotD = (int) 10.00, xSal = (int) 15.00, xBac = (int) 18.00, bau = (int) 12.00, refr = (int) 8.00, suLar = (int) 13.00;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha seu produto\n");
		System.out.println("Cod				Produto				Preço Uni");
		System.out.println(" 1				Hot-dog				R$10.00");
		System.out.println(" 2				X-Salada			R$15.00");
		System.out.println(" 3				X-Bacon				R$18.00");
		System.out.println(" 4				Bauru				R$12.00");
		System.out.println(" 5				Refrigerante			R$8.00");
		System.out.println(" 6				Suco de Laranja			R$13.00");
		
		System.out.println("Digite o Código:");
		cod = leia.nextInt();
		System.out.println("Digite a Qtd:");
		qtd = leia.nextInt();
		
		switch(cod) {
			case 1:
				cod = 1;
				cod = hotD;
				tot = cod*qtd;
				System.out.println("Produto: Hot-dog");
				System.out.println("Valor Total: R$ " + tot);
				break;
			
			case 2:
				cod = 2;
				cod = xSal;
				tot = cod*qtd;
				System.out.println("Produto: X-Salada");
				System.out.println("Valor Total: R$ " + tot);
				break;
			
			case 3:
				cod = 3;
				cod = xBac;
				tot = cod*qtd;
				System.out.println("Produto: X-Bacon");
				System.out.println("Valor Total: R$ " + tot);
				break;
			
			case 4:
				cod = 4;
				cod = bau;
				tot = cod*qtd;
				System.out.println("Produto: Bauru");
				System.out.println("Valor Total: R$ " + tot);
				break;
			
			case 5:
				cod = 5;
				cod = refr;
				tot = cod*qtd;
				System.out.println("Produto: Refrigerante");
				System.out.println("Valor Total: R$ " + tot);
				break;
			
			case 6:
				cod = 6;
				cod = suLar;
				tot = cod*qtd;
				System.out.println("Produto: Suco de Laranja");
				System.out.println("Valor Total: R$ " + tot);
				break;
				
		}
	}

}
