package teste_POO;
import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class Main {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); // Cria o objeto Scanner para entrada de dados
		Animal cachorro1 = new Animal(); // Cria um novo objeto da classe Animal
		
		System.out.print("Qual o nome do animal? ");
		String nome = entrada.nextLine(); // Lê o nome digitado pelo usuário
		cachorro1.setNome(nome); // Define o nome no objeto cachorro1
		
		System.out.print("Qual o porte do animal? ");
		String porte = entrada.nextLine();
		cachorro1.setTamanho(porte);
		
		System.out.print("Qual a raça do animal? ");
		String raca = entrada.nextLine();
		cachorro1.setRaca(raca);
		
		System.out.print("Qual a cor do animal? ");
		String cor = entrada.nextLine();
		cachorro1.setCor(cor);
		
		System.out.print("Qual a idade do animal? ");
		int idade = entrada.nextInt();
		cachorro1.setIdade(idade);
		
		cachorro1.mostrar();
	}
}
