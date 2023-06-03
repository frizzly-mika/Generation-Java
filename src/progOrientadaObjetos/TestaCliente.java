package progOrientadaObjetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(01, "Hamilton Pereira", 223355779, 923323223, "Designer");
		Cliente cliente2 = new Cliente(02, "Diógenes Sampaio", 1105894182, 911112222, "Engenheiro de Som");
		
		cliente1.visualiza();
		cliente2.visualiza();
		
	}

}
