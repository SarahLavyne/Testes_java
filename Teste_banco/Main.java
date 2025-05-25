package teste_POO;

public class Main {
	public static void main(String[] args) {
		Banco novaConta = new Banco("Sarah", 1, 1); // Cria os dados no objeto
	
		
		novaConta.depositar(100.0); // Aciona a função depositar
		novaConta.mostrar(); // acima  a função mostrar
		novaConta.sacar(20.5); //acima a função sacar
		novaConta.mostrar();
		
	}
}
