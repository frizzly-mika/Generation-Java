package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1FilaQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String nome;
		
		do {
			System.out.println("\t _______________________________");
			System.out.println("\t|                               |");
			System.out.println("\t| 1 - Adicionar Cliente na Fila |");
			System.out.println("\t| 2 - Listar todos os Clientes  |");
			System.out.println("\t| 3 - Retirar Cliente da Fila   |");
			System.out.println("\t| 0 - Sair                      |");
			System.out.println("\t|_______________________________|");
			
			
			System.out.printf("\n\tDigite a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.printf("\tDigite um nome: ");
				nome = leia.next();
				fila.add(nome);
				break;
			case 2:
				if(fila.isEmpty()) {
					System.out.printf("\tA Fila está vazia!\n");
				}else {
					System.out.printf("\tLista de Clientes na Fila: " + fila + "\n");
				}
				break;
			case 3:
				if(fila.isEmpty()) {
					System.out.printf("\tA Fila está vazia!\n");
				}else {
					fila.poll();
					System.out.printf("\tFila: " + fila + "\n");
					System.out.println("\tO Cliente foi Chamado!");
				}
				break;
			}
			
		}while (opcao == 1 || opcao == 2 || opcao == 3);
		
		if(opcao == 0) {
		System.out.printf("\tPrograma Finalizado!");
		}		
		
	}

}
