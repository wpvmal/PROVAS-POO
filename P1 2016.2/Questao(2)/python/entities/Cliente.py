from .produtos.Produto import Produto
from .Loja import Loja


class Cliente:
    def __init__(self, cpf: str) -> None:
        self.cpf = cpf

    def comprar(self, loja: Loja, prod: Produto) -> None:
        loja.vender(prod)

