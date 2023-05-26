package lacosCondicionais;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		
		int cargo, cod1 = 10, cod2 = 7, cod3 = 9, cod4 = 6, cod5 = 5, cod6 = 8;
		float salario, novoSalario;
		String colaborador, cg1 = "Gerente", cg2 = "Vendedor", cg3 = "Supervisor", cg4 = "Motorista", cg5 = "Estoquista", cg6 = "Técnito de TI";
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do Colaborador:");
		colaborador = leia.next();
		System.out.println("Código:");
		cargo = leia.nextInt();
		System.out.println("Salário:");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1:
			novoSalario = salario + (salario * cod1)/100;
			System.out.println("\nNome do Colaborador: " + colaborador);
			System.out.println("Cargo: " + cg1);
			System.out.print("Novo Salário: " + novoSalario);
			break;
			
		case 2:
			novoSalario = salario + (salario * cod2)/100;
			System.out.println("\nNome do Colaborador: " + colaborador);
			System.out.println("Cargo: " + cg2);
			System.out.print("Novo Salário: " + novoSalario);
			break;
			
		case 3:
			novoSalario = salario + (salario * cod3)/100;
			System.out.println("\nNome do Colaborador: " + colaborador);
			System.out.println("Cargo: " + cg3);
			System.out.print("Novo Salário: " + novoSalario);
			break;
			
		case 4:
			novoSalario = salario + (salario * cod4)/100;
			System.out.println("\nNome do Colaborador: " + colaborador);
			System.out.println("Cargo: " + cg4);
			System.out.print("Novo Salário: " + novoSalario);
			break;
			
		case 5:
			novoSalario = salario + (salario * cod5)/100;
			System.out.println("\nNome do Colaborador: " + colaborador);
			System.out.println("Cargo: " + cg5);
			System.out.print("Novo Salário: " + novoSalario);
			break;
			
		case 6:
			novoSalario = salario + (salario * cod6)/100;
			System.out.println("\nNome do Colaborador: " + colaborador);
			System.out.println("Cargo: " + cg6);
			System.out.print("Novo Salário: " + novoSalario);
			break;
		default:
			System.out.println("Código inválido.");
		}

	}

}
