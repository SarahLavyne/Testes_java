// Aqui temos encapsulamento, que é basicamente os atributos do objeto de forma protegida.
package teste_POO;
import java.text.DecimalFormat;

//Criação da classe e suas variaveis
public class Banco {
	private int numero; 
	private int agencia;
	private String nome;
	private double saldo;
	DecimalFormat dfDinheiro = new DecimalFormat("###,##0.00");

// Construtor que inicializa os atributos da classe, mesmo que estejam encapsulados (privados),
//porque estamos dentro da própria classe.
public Banco (String nome, int numero, int agencia) {
	this.nome = nome; // O this faz referencia ao parametro do Objeto.
	this.numero = numero;
	this.agencia = agencia;            
	this.saldo = 0.00;
} 

//Função para depositar algum valor
void depositar(Double valor) {
	this.saldo += valor;
}

//Função para sacar algum valor
void sacar(Double valor) {
	if (this.saldo >= valor) {
		this.saldo -= valor;
	} else { 
		System.out.println("Saldo insuficiente");
	}
}

// Função para mostrar os dados
void mostrar() {
System.out.println("Nome: " + this.nome);
System.out.println("Número: " + this.numero);
System.out.println("Agência: " + this.agencia);
System.out.println("Saldo: R$ " + dfDinheiro.format(this.saldo));}

}                
