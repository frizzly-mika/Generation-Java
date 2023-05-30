package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1CollectionList {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String cores = "";
		
		System.out.println("Escreva algumas cores: ");
		for(int i = 1; i <= 5; i++) {
			System.out.printf(i + "ª cor: ");
			cores = leia.next();
			lista.add(cores);
		}
		
			System.out.printf("\nListar todas as cores: " + lista);
			Collections.sort(lista);
			System.out.println("\nOrdenar cores: " + lista);
		
			leia.close();
	}
	
}
