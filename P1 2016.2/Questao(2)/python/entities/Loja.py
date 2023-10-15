from .produtos.Produto import Produto
from .produtos.Ligavel import Ligavel


class Loja:
    def __init__(self, id: int, nome: str) -> None:
        self.id = id
        self.nome = nome
        self.produtosVendidos = list()
        self.estoque = list()

    def faturamento_bruto(self) -> float:
        faturamento = 0

        for p in self.produtosVendidos:
            faturamento += p.preco

        return faturamento

    def quantidade_produtos_vendidos(self) -> int:
        return len(self.produtosVendidos)

    def quantidade_produtos_ligaveis_vendidos(self) -> int:
        total = 0
        for p in self.produtosVendidos:
            if isinstance(p, Ligavel):
                total += 1
        return total

    def imprimir_relatorio_venda(self) -> None:
        for p in self.produtosVendidos:
            print(p)

    def adicionar_ao_estoque(self, produto: Produto) -> None:
        self.estoque.append(produto)

    def vender(self, produto: Produto) -> None:
        if self.estoque.__contains__(produto):
            self.produtosVendidos.append(self.estoque.pop(
                self.estoque.index(produto)))
        else:
            class NotInStockError(Exception):
                "Item not found in stock"
                pass

            raise NotInStockError

    def imprimir_produtos_no_estoque(self) -> None:
        for p in self.estoque:
            print(p)

