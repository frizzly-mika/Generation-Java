package lacosCondicionais;

import java.util.Scanner;

public class atividade4b {

	public static void main(String[] args) {
			
			String vertebrado, classe, alimentacao;
			Scanner leia = new Scanner(System.in);

			System.out.println("Descubra qual é o animal");
			System.out.println("\n'Vertebrado' ou 'Invertebrado'? Digite:");
			vertebrado = leia.nextLine();
			
			System.out.println("\nQual é a classe dele 'Ave', 'Mamífero', 'Inseto' ou 'Anelídeo'? Digite:");
			classe = leia.nextLine();
			
			System.out.println("\nQual a alimentação 'Carnívoro', 'Onívoro', 'Herbívoro' ou 'Hematófogo'? Digite:");
			alimentacao = leia.nextLine();
			
			
			if(vertebrado.equalsIgnoreCase("Vertebrado")) {
				if(classe.equalsIgnoreCase("Ave")) {
					if(alimentacao.equalsIgnoreCase("Carnívoro")) {
						System.out.println("O animal é a Águia.");
					}else {
						System.out.println("O animal é a Pomba.");
					}
					
				}else if(classe.equalsIgnoreCase("Mamífero")) {
					if(alimentacao.equalsIgnoreCase("Onívoro")) {
						System.out.println("Seu o animal é o Homem");
					}else {
						System.out.println("Seu animal é a Vaca!");
					}
				}
				
			}else if(vertebrado.equalsIgnoreCase("Invertebrado")) {
				if(classe.equalsIgnoreCase("Inseto")) {
					if(alimentacao.equalsIgnoreCase("Hematófago")) {
						System.out.println("Seu animal é a Pulga.");
					}else {
						System.out.println("Seu animal é a Lagarta.");
					}
					
			}else if(classe.equalsIgnoreCase("Anelídeo")) {
					if(alimentacao.equalsIgnoreCase("Hematófago")) {
						System.out.println("Seu animal é a Sanguessuga.");
					}else {
						System.out.println("Seu animal é a Minhoca.");
					}
				}
				
			}
			
		}

	}