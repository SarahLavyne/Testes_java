package teste_POO;

public class Aluno {
	private String Nome;
	private int Matricula;
	private int Idade;
	private int Serie;
	private String Turma;
	private String CPF;
	private String Telefone;
	
	public Aluno(String nome, int matricula, int idade, int serie, String turma, String cpf, String telefone) {
	    this.Nome = nome;
	    this.Matricula = matricula;
	    this.Idade = idade;
	    this.Serie = serie;
	    this.Turma = turma;
	    this.CPF = cpf;
	    this.Telefone = telefone;
	}


	
	public void setNome(String Nome) {this.Nome = Nome;}
	public void setMatricula(int Matricula) {this.Matricula = Matricula;}
	public void setIdade(int Idade) {this.Idade = Idade;}
	public void setSerie(int  Serie) {this.Serie = Serie;}
	public void setTurma(String Turma) {this.Turma = Turma;}
	public void setCPF(String CPF) {this.CPF = CPF;}
	public void setTelefone(String Telefone) {this.Telefone = Telefone;}
	
	public void Mostrar() {
	    System.out.println("Nome: " + this.Nome);
	    System.out.println("Matricula: " + this.Matricula);
	    System.out.println("Idade: " + this.Idade);
	    System.out.println("Série: " + this.Serie);
	    System.out.println("Turma: " + this.Turma);
	    System.out.println("CPF: " + this.CPF);
	    System.out.println("Telefone: " + this.Telefone);
	    System.out.println("===========================\n");
	}
	public String getNome() {
		return Nome;
	}
	
}
