from .Produto import Produto
from .Comestivel import Comestivel


class Chocolate(Produto, Comestivel):
    def __init__(self, preco: float, id: int, tipo: str) -> None:
        super().__init__(preco, id)
        self.tipo = tipo

    def desembalar(self):
        print("Abrindo o chocolate do tipo:", self.tipo)

    def __str__(self) -> str:
        return f"Preco: {self.preco}, ID:{self.id}, Tipo:{self.tipo}"


