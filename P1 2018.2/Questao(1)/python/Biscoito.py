from Comestivel import Comestivel


class Biscoito:
    def __init__(self, id: str):
        self.id = id
        self.cor = str()
        self.preco = int()

    def __eq__(self, other):
        if isinstance(other, Biscoito):
            return self.id == other.id
        return False

    def __str__(self) -> str:
        return f"{self.__class__.__name__}, id: {self.id}"


class Negresco(Biscoito, Comestivel):
    def comer(self) -> None:
        print("Comendo Negresco")


class Skinny(Biscoito, Comestivel):
    def comer(self) -> None:
        print("Comendo Skinny")
