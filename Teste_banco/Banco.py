import locale

locale.setlocale(locale.LC_ALL, 'pt_BR.UTF-8')  # Para formatar como moeda brasileira

class Banco:
    def __init__(self, nome, numero, agencia):
        # Atributos "protegidos" (por convenção em Python, usamos underline)
        self._nome = nome
        self._numero = numero
        self._agencia = agencia
        self._saldo = 0.0

    # Método para depositar valor
    def depositar(self, valor):
        self._saldo += valor

    # Método para sacar valor
    def sacar(self, valor):
        if self._saldo >= valor:
            self._saldo -= valor
        else:
            print("Saldo insuficiente")

    # Método para mostrar os dados da conta
    def mostrar(self):
        print(f"Nome: {self._nome}")
        print(f"Número: {self._numero}")
        print(f"Agência: {self._agencia}")
        print("Saldo: R$", locale.currency(self._saldo, grouping=True))


# Programa principal
if __name__ == "__main__":
    nova_conta = Banco("Sarah", 1, 1)

    nova_conta.depositar(100.0)
    nova_conta.mostrar()

    nova_conta.sacar(20.5)
    nova_conta.mostrar()
