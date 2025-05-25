class Animal:
    def __init__(self):
        # Construtor vazio para poder definir os atributos com métodos depois
        self.nome = ""
        self.tamanho = ""
        self.raca = ""
        self.cor = ""
        self.idade = 0

    # Métodos "setters" para definir os dados
    def set_nome(self, nome):
        self.nome = nome

    def set_tamanho(self, tamanho):
        self.tamanho = tamanho

    def set_raca(self, raca):
        self.raca = raca

    def set_cor(self, cor):
        self.cor = cor

    def set_idade(self, idade):
        self.idade = idade

    # Método para exibir os dados do animal
    def mostrar(self):
        print("Nome:", self.nome)
        print("Tamanho:", self.tamanho)
        print("Raça:", self.raca)
        print("Cor:", self.cor)
        print("Idade:", self.idade)


# Programa principal
if __name__ == "__main__":
    cachorro1 = Animal()

    nome = input("Qual o nome do animal? ")
    cachorro1.set_nome(nome)

    porte = input("Qual o porte do animal? ")
    cachorro1.set_tamanho(porte)

    raca = input("Qual a raça do animal? ")
    cachorro1.set_raca(raca)

    cor = input("Qual a cor do animal? ")
    cachorro1.set_cor(cor)

    idade = int(input("Qual a idade do animal? "))
    cachorro1.set_idade(idade)

    print("\nInformações do animal:")
    cachorro1.mostrar()
