package progOreintadaObjetosAtv2;

public class Funcionario {
	
	//Atributos da Classe Fliente
		private String letra;
		private String nome;
		private int cpf;
		private int telefone;
		private String setor;
		
		//Método Construtor da Classa (+ parâmetros)
		public Funcionario(String letra, String nome, int cpf, int telefone, String setor) {
			this.letra = letra;
			this.nome = nome;
			this.cpf = cpf;
			this.telefone = telefone;
			this.setor = setor;
		}	
		
		//Métodos Set = mudar dados do atributo e Get = ler dados do atributo
		public String getLetra() {
			return letra;
		}
		public void setLetra(String letra) {
			this.letra = letra;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		
		public String getSetor() {
			return setor;
		}
		public void setSetor(String setor) {
			this.setor = setor;
		}
		
		//Método visualiza
		public void visualiza() {

			System.out.println("\n**************************************");
			System.out.println("Dados do Funcionário");
			System.out.println("\n**************************************");
			System.out.println("\nLetra: " + this.letra);
			System.out.println("\nNome: " + this.nome);
			System.out.println("\nCPF: " + this.cpf);
			System.out.println("\nTelefone: " + this.telefone);
			System.out.println("\nSetor: " + this.setor);
		}

}
