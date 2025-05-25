class Aluno:
    def __init__(self, nome, matricula, idade, serie, turma, cpf, telefone):
        self.nome = nome
        self.matricula = matricula
        self.idade = idade
        self.serie = serie
        self.turma = turma
        self.cpf = cpf
        self.telefone = telefone

    def mostrar(self):
        print(f"Nome: {self.nome}")
        print(f"Matrícula: {self.matricula}")
        print(f"Idade: {self.idade}")
        print(f"Série: {self.serie}")
        print(f"Turma: {self.turma}")
        print(f"CPF: {self.cpf}")
        print(f"Telefone: {self.telefone}")
        print("===========================\n")


def main():
    lista_alunos = []

    while True:
        print("_-_-_Menu_-_-_")
        print("1 - Cadastrar aluno")
        print("2 - Excluir aluno")
        print("3 - Mostrar dados")
        print("0 - Sair")

        try:
            escolha = int(input("Escolha uma opção: "))
        except ValueError:
            print("Por favor, insira um número válido.")
            continue

        if escolha == 1:
            nome = input("Nome: ")
            try:
                matricula = int(input("Matrícula: "))
                idade = int(input("Idade: "))
                serie = int(input("Série: "))
            except ValueError:
                print("Erro: matrícula, idade e série devem ser números inteiros.")
                continue
            turma = input("Turma: ")
            cpf = input("CPF: ")
            telefone = input("Telefone: ")

            aluno = Aluno(nome, matricula, idade, serie, turma, cpf, telefone)
            lista_alunos.append(aluno)
            print("Aluno cadastrado com sucesso!")

        elif escolha == 2:
            nome_remover = input("Digite o nome do aluno que deseja remover: ")
            removido = False
            for aluno in lista_alunos:
                if aluno.nome.lower() == nome_remover.lower():
                    lista_alunos.remove(aluno)
                    removido = True
                    print("Aluno removido com sucesso.")
                    break
            if not removido:
                print("Aluno não encontrado.")

        elif escolha == 3:
            if not lista_alunos:
                print("Nenhum aluno cadastrado.")
            else:
                print("\n=== Lista de Alunos ===")
                for aluno in lista_alunos:
                    aluno.mostrar()

        elif escolha == 0:
            print("== SISTEMA ENCERRADO ==")
            break
        else:
            print("Opção inválida!")


if __name__ == "__main__":
    main()
