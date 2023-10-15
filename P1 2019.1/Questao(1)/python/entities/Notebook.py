from Eletronico import Eletronico
from Produto import Produto


class Notebook(Produto, Eletronico):
    def __init__(self, id_produto: str):
        super().__init__(id_produto)
        self.is_power_on = False

    def ligar(self) -> None:
        if not self.is_power_on:
            self.is_power_on = True
            print("Notebook Ligando")
        else:
            print("Notebook já está ligado")

    def desligar(self) -> None:
        if self.is_power_on:
            self.is_power_on = False
            print("Notebook Desligando")
        else:
            print("Notebook Ligando")
