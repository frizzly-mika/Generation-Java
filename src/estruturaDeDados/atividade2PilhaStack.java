package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class atividade2PilhaStack {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String livro;

		do {
			System.out.println("\t _______________________________");
			System.out.println("\t|                               |");
			System.out.println("\t| 1 - Adicionar Livro na Pilha  |");
			System.out.println("\t| 2 - Listar todos os Livros    |");
			System.out.println("\t| 3 - Retirar Livro da Pilha    |");
			System.out.println("\t| 0 - Sair                      |");
			System.out.println("\t|_______________________________|");
			

			System.out.printf("\n\tDigite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.printf("\tDigite um livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("\n\tO Livro '" + livro + "' foi Adicionado!");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.printf("\tA pilha está vazia!\n");
				} else {
					System.out.printf("\tLista de Livros na pilha: " + pilha + "\n");
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.printf("\tA pilha está vazia!\n");
				} else {
					pilha.pop();
					System.out.printf("\tPilha: " + pilha + "\n");
					System.out.println("\tUm Livro foi retirado da pilha!");
				}
				break;
			}

		} while (opcao == 1 || opcao == 2 || opcao == 3);

		if (opcao == 0) {
			System.out.printf("\tPrograma Finalizado!");
		}

	}

}
