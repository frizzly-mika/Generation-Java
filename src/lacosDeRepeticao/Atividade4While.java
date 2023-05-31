package lacosDeRepeticao;

import java.util.Scanner;

public class Atividade4While {

	public static void main(String[] args) {
		int idade, sexo, categ,
		back = 0, front = 0, hoMoMaior = 0, muFuMenor = 0;
		String espec, continua = "S";
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Pesquisa sobre colaboradores.");
		while(!continua.equalsIgnoreCase("N")) {
			System.out.printf("\nDigite a idade: ");
			idade = leia.nextInt();

			System.out.printf("\nSexo (1 - Masc, 2 - Fem, 3 - Outros): ");
			sexo = leia.nextInt();
			if(sexo == 3) {
				System.out.println("Outros. Especifique qual: ");
				espec = leia.next();
			}
			
			System.out.printf("\nCategoria (1 - Backend, 2 - Frontend, 3 - Mobile, 4 - FullStack): ");
			categ = leia.nextInt();
			
			System.out.println("\nDeseja inserir os dados de outro colaborador? (S/N)");
			continua = leia.next();

				switch (categ){
				case 1:
					if(categ == 1) {
						back++;
						break;
					}
				case 2:
					if(categ == 2) {
						front++;
						break;
					}
				}
				
				if(idade > 40 && sexo == 1 && categ == 3) {
					hoMoMaior++;
				}
				
				if(idade < 30 && sexo == 2 && categ == 4) {
					muFuMenor++;
				}
				
			}
		System.out.printf("\nResultado da pesquisa: ");	
		System.out.printf("\nPessoas desenvolvedoras Backend: " + back);
		System.out.printf("\nPessoas desenvolvedoras Frontend: " + front);
		System.out.printf("\nHomens desenvolvedores Mobile maiores de 40 anos: " + hoMoMaior);
		System.out.printf("\nMulheres desenvolvedoras Fullstack menores de 30 anos: " + muFuMenor);
	}

}
