from entities.Carro import Carro
from entities.Elefante import Elefante
from entities.Notebook import Notebook
from entities.Produto import Produto


class Utils:
    @staticmethod
    def existe(x: list, y: Produto):
        return x.__contains__(y)


class Utils2:
    @staticmethod
    def get_lista() -> list:
        return [Notebook("ABC"),
                Elefante("Dumbo", "Orelhudo"),
                Notebook("DEF"),
                Carro("MER", 3.2),
                Carro("WMB", 5.0)]
