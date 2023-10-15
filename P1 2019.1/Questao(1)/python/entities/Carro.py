from .Produto import Produto


class Carro(Produto):
    def __init__(self, id_produto: str, litragem_motor: float):
        super().__init__(id_produto)
        self.litragem_motor = litragem_motor

