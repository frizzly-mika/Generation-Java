package progOreintadaObjetosAtv2;

import progOreintadaObjetosAtv2.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("A", "Jamile Rodriguez", 223355779, 923323223, "Contabilidade");
		Funcionario funcionario2 = new Funcionario("B", "Mariana Meireles", 1105894182, 911112222, "Marketing");
		
		funcionario1.visualiza();
		funcionario2.visualiza();
		

	}

}
