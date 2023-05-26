package lacosCondicionais;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		String doadorNome;
		int doadorIdade, idadeMin = 18, idadeMinFalse = 59, idadeMaxFalse = 69, idadeMax = 69;
		Boolean primeiraDoacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador:");
		doadorNome = leia.next();
		System.out.println("Digite o idade do doador:");
		doadorIdade = leia.nextInt();
		
		if(doadorIdade < idadeMin) {
			System.out.println(doadorNome + " não está apto para doar sangue.");
		}else {
				System.out.println("Primeira doação de sangue ('true' para sim e 'false' para não)?");
				primeiraDoacao = leia.nextBoolean();
			
				if(doadorIdade >= idadeMin && doadorIdade <= idadeMinFalse && (primeiraDoacao == false || primeiraDoacao == true)) {
					System.out.println(doadorNome + " está APTO para doar sangue.");
				}else if(doadorIdade > idadeMinFalse && doadorIdade <= idadeMaxFalse && primeiraDoacao == true) {
					System.out.println(doadorNome + " está APTO para doar sangue.");
				
				}else if(doadorIdade >= idadeMin && doadorIdade <= idadeMax && primeiraDoacao == false) {
					System.out.println(doadorNome + " NÃO está apto para doar sangue.");
				}
			
		}
		

	}

}
