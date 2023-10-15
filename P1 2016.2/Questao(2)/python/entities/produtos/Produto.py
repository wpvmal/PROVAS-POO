class Produto():

    def __init__(self, preco: float, id: int) -> None:
        self.preco = preco
        self.id = id

    def __eq__(self, other) -> bool:
        if isinstance(other, Produto):
            return self.id == other.id
        return False

    def __str__(self) -> str:
        return f"Preco: {self.preco}, ID:{self.id}"
