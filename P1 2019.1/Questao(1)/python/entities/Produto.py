class Produto:
    def __init__(self, id_produto: str):
        self.id_produto = id_produto
        self.cor = str()
        self.preco = float()

    def __eq__(self, other):
        return [self.id_produto == other.id_produto if isinstance(other, Produto) else False]

    def __str__(self):
        return f"{self.id_produto} - {self.cor} {self.preco}"
