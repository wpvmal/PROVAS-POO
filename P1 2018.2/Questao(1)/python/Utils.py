from Biscoito import Biscoito, Negresco, Skinny
from Moto import Moto


class Utils:
    @staticmethod
    def existe(x: list, y: Biscoito) -> bool:
        return x.__contains__(y)


class Utils2:
    @staticmethod
    def get_lista() -> list:
        items = list([Negresco("1"), Moto("2"), Biscoito("3"), Skinny("4"), Moto("5"), Moto("6"), Skinny("7"),
                      Negresco("8")])

        return items
