package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3CollectionSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		Integer num, num2;
		Iterator<Integer> Set2 = set2.iterator();
		
		System.out.println("Digite 10 valores (1 por vez) da Lista Set.");
		for(int loop1 = 1; loop1 < 11; loop1++) {
			System.out.printf("Digite o " + loop1 + "º valor: ");
			num = leia.nextInt();
			set.add(num);
		}
		
		System.out.println("\nDigite mais 10 valores (1 por vez) da Lista Set 2.");
		for(int loop2 = 1; loop2 < 11; loop2++) {
			System.out.printf("Digite o " + loop2 + "º valor: ");
			num2 = leia.nextInt();
			set2.add(num2);
		}
		for(int ordem : set) {
			if(ordem != 0) {
			}
		}
		
		System.out.printf("\nListar dados do Set: " + set);
	

		System.out.printf("\nListar dados do Set 2: " + set2);
		while(Set2.hasNext()) {
			System.out.print(Set2.next());
		}
		
		
	}

}
