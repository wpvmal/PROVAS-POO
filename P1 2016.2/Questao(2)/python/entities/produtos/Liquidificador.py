from .Produto import Produto
from .Ligavel import Ligavel


class Liquidificador(Produto, Ligavel):
    def __init__(self, preco: float, id: int, marca: str) -> None:
        super().__init__(preco, id)
        self.marca = marca

    def ligar(self):
        print("Ligando o liquidificador da marca:", self.marca)

    def __str__(self) -> str:
        return f"Preco: {self.preco}, ID:{self.id}, Marca:{self.marca}"

