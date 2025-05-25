package teste_POO;

public class Carro {
	int ano;
	String cor;
	String modelo;
	String marca;


void exibir() {
	System.out.println("Ano do veiculo: " +ano);
	System.out.println("Modelo do veiculo: "+modelo);
	System.out.println("Cor do veicuilo: "+cor);
	System.out.println("Marca do veiculo: "+marca);
}

void ligar() {
	System.out.println("O carro ligou");
}
}