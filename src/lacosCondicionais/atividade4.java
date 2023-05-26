package lacosCondicionais;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		String animal, aniClas1, aniClas1A,
					   aniClas01, aniClas01A,
					   aniClas2, aniClas2A,
					   aniClas02, aniClas02A,
											   vertClas1A = "Carnívoro", vertClas1Aa = "Águia",
							vertClas1 = "Ave", vertClas1B = "Onívoro", vertClas1Bb = "Pomba",
		vert = "Vertebrado", 
							vertClas2 = "Mamífero", vertClas2A = "Onívoro", vertClas2Aa = "Homem", 
													vertClas2B = "Herbívoro", vertClas2Bb = "Vaca",
		
					   							       invertClas1A = "Hematófago", invertClas1Aa = "Pulga",
						       invertClas1 = "Inseto", invertClas1B = "Herbívoro", invertClas1Bb = "Lagarta",
		invert = "Invertebrado", 
							   invertClas2 = "Anelídeo", invertClas2A = "Hematófago", invertClas2Aa = "Sanguessuga", 
							  						     invertClas2B = "Onívoro", invertClas2Bb = "Minhoca";
 					 
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Descubra qual é o animal");
		System.out.println("\n'Vertebrado' ou 'Invertebrado'? Digite para saber:");
		animal = leia.next();
		
		//vertebrados
		if(animal == vert) {
			System.out.println("'Ave' ou 'Mamífero'? Digite:");
			aniClas1 = leia.next();
			if(aniClas1 == vertClas1) {
				System.out.println("'Carnívoro' ou 'Onívoro'? Digite:");
				aniClas1A = leia.next();
				if(aniClas1A == vertClas1A) {
					System.out.println("O animal descoberto é o(a): "+ vertClas1Aa);
				}else if(aniClas1A == vertClas1B) {
							System.out.println("O animal descoberto é o(a): "+ vertClas1Bb);
					
			}else if(aniClas01 == vertClas2) {
				System.out.println("'Onívoro' ou 'Herbívero'? Digite:");
				aniClas01A = leia.next();
				if(aniClas01A == vertClas2A) {
					System.out.println("O animal descoberto é o(a): "+ vertClas2Aa);
				}else if(aniClas01A == vertClas2B) {
							System.out.println("O animal descoberto é o(a): "+ vertClas2Bb);
					}
				}
			}
			
		}else if(animal == invert) {
			System.out.println("'Inseto' ou 'Anelídeo'? Digite:");
			aniClas2 = leia.next();
			if(aniClas2 == invertClas1) {
				System.out.println("'Hematófago' ou 'Herbívoro'? Digite:");
				aniClas2A = leia.next();
				if(aniClas2A == invertClas1A) {
					System.out.println("O animal descoberto é o(a): "+ invertClas1Aa);
				}else if(aniClas2A == invertClas1B) {
							System.out.println("O animal descoberto é o(a): "+ invertClas1Bb);
					
			}else if(aniClas02 == invertClas2) {
				System.out.println("'Hematófago' ou 'Onívoro'? Digite:");
				aniClas02A = leia.next();
				if(aniClas02A == invertClas2A) {
					System.out.println("O animal descoberto é o(a): "+ invertClas2Aa);
				}else if(aniClas02A == invertClas2B) {
							System.out.println("O animal descoberto é o(a): "+ invertClas2Bb);
					}
				}
			}

		}
		
	}

}
