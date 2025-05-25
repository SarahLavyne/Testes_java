package teste_POO;
import java.util.Scanner; 
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	ArrayList<Aluno>ListaAlunos = new ArrayList<>();
	
	int escolha;
	do { 
		System.out.println("_-_-_Menu_-_-_");
		System.out.println("1- Cadastrar aluno");
		System.out.println("2- Excluir aluno");
		System.out.println("3- Mostrar dados");
		System.out.println("0_ Sair");
		escolha = entrada.nextInt();
		entrada.nextLine();
		
		switch(escolha){
			case 1:
				System.out.println("Nome: ");
				String Nome = entrada.nextLine();
				System.out.println("Matricula: ");
				int Matricula = entrada.nextInt();
				System.out.println("Idade: ");
				int Idade = entrada.nextInt();
				System.out.println("Série: ");
				int Serie = entrada.nextInt();
				entrada.nextLine(); 
				System.out.println("Turma: ");
				String Turma = entrada.nextLine();
				System.out.println("CPF: ");
				String CPF = entrada.nextLine();
				System.out.println("Telefone: ");
				String Telefone = entrada.nextLine();
				entrada.nextLine();
				  
					
				 ListaAlunos.add(new Aluno(Nome, Matricula, Idade, Serie, Turma, CPF, Telefone));
                 System.out.println("Aluno cadastrado com sucesso!");
                 break;
			case 2: 
                System.out.print("Digite o nome do aluno que deseja remover: ");
                String nomeRemover = entrada.nextLine();
                boolean removido = false;
                for (int i = 0; i < ListaAlunos.size(); i++) {
                    if (ListaAlunos.get(i).getNome().equalsIgnoreCase(nomeRemover)) {
                        ListaAlunos.remove(i);
                        removido = true;
                        System.out.println("Aluno removido com sucesso.");
                        break;
                    }
                }
                if (!removido) {
                    System.out.println("Aluno não encontrado.");
                }
                break;
			case 3:
				  System.out.println("\n=== Lista de Alunos ===");
                  for (Aluno a : ListaAlunos) {
                      a.Mostrar();	
                  }
                  if (ListaAlunos.isEmpty()) {
                      System.out.println("Nenhum animal cadastrado.");
                  }
                  break;
			case 0:
				System.out.println("==SISTEMA ENCERRADO==");
				break;
			default: 
				System.out.println("Opção inválida!!");
		}
		
	
	}while(escolha!=0);
			entrada.close();
	}	
}
