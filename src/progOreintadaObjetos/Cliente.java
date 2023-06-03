package progOreintadaObjetos;

public class Cliente {
	
	//Atributos da Classe Cliente
	private int numero;
	private String nome;
	private int cpf;
	private int telefone;
	private String ocupacao;
	
	//Método Construtor da Classa (+ parâmetros)
	public Cliente(int numero, String nome, int cpf, int telefone, String ocupacao) {
		this.numero = numero;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.ocupacao = ocupacao;
	}	
	
	//Métodos Set = mudar dados do atributo e Get = ler dados do atributo
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	
	//Método visualiza
	public void visualiza() {

		System.out.println("\n**************************************");
		System.out.println("Dados do Cliente");
		System.out.println("\n**************************************");
		System.out.println("\nNº: " + this.numero);
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nCPF: " + this.cpf);
		System.out.println("\nTelefone: " + this.telefone);
		System.out.println("\nOcupação: " + this.ocupacao);
	}

}
