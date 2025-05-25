package teste_POO;

public class Animal {
	private String Nome;
	private String Tamanho;
	private String Raca;
	private String Cor;
	private int Idade;

	public Animal() {
		// Contrutor vazio para o set enviar os dados
	}
	
// "trasnformando" os atributos em públicos para acessar e modificar
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public void setTamanho(String Tamanho) {
		this.Tamanho = Tamanho;
	}
	public void setRaca(String Raca) {
		this.Raca = Raca;
	}
	public void setCor(String Cor) {
		this.Cor = Cor;
	}
	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
	
	//Método para mostrar os dados do animal
	void mostrar() {
		System.out.println(this.Nome);
		System.out.println(this.Tamanho);
		System.out.println(this.Raca);
		System.out.println(this.Cor);
		System.out.println(this.Idade);
	}
}
