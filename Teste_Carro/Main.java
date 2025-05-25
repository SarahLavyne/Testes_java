package teste_POO;
public class Main {
	public static void main(String[] args) {
	Carro carro1 = new Carro ();
	carro1.ano = 2017;
	carro1.cor = "Preto";
	carro1.marca = "Honda";
	carro1.modelo = "Sedan";
	
	carro1.exibir();
	carro1.ligar();
	}	
}