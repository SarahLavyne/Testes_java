class Carro:
    def __init__(self):
        self.ano = None
        self.cor = None
        self.modelo = None
        self.marca = None

    def exibir(self):
        print("Ano do veiculo:", self.ano)
        print("Modelo do veiculo:", self.modelo)
        print("Cor do veiculo:", self.cor)
        print("Marca do veiculo:", self.marca)

    def ligar(self):
        print("O carro ligou")

carro1 = Carro()
carro1.ano = 2017
carro1.cor = "Preto"
carro1.marca = "Honda"
carro1.modelo = "Sedan"

carro1.exibir()
carro1.ligar()
