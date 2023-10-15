class Biscoito:
    def __init__(self, id: str):
        self.id = id
        self.cor = str()
        self.preco = int()

    def __eq__(self, other):
        if isinstance(other, Biscoito):
            return self.id == other.id
        return False

