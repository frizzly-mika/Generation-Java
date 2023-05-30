package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade2CollectionList {

	public static void main(String[] args) {
		

		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		Integer num = Integer.valueOf(1);
		
		lista.add(2); lista.add(5); lista.add(1); lista.add(3);lista.add(4);
		lista.add(9); lista.add(7); lista.add(8); lista.add(10); lista.add(9);
		
		System.out.printf("Digite um número para saber se ele está na lista: ");
		num = leia.nextInt();
		
		if(num > 10 || num < 1) {
			System.out.printf("\nO número " + num + " não foi encontrado na lista.");
		}else {
			System.out.printf("\nO valor " + num + " está na posição " + lista.indexOf(num) + " da lista.");
		}
		

	}

}
