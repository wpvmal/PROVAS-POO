from .Ligavel import Ligavel
from .Brinquedo import Brinquedo


class Carro(Brinquedo, Ligavel):
    def __init__(self, preco: float, id: int, placa: str):
        super().__init__(preco, id)
        self.placa = placa

    def ligar(self):
        print("Girando a chave do carro")

    def __str__(self) -> str:
        return f"Preco: {self.preco}, ID:{self.id}, Placa:{self.placa}"
