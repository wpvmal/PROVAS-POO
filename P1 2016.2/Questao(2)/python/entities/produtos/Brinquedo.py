from .Produto import Produto


class Brinquedo(Produto):
    def __init__(self, preco: float, id: int) -> None:
        super().__init__(preco, id)
