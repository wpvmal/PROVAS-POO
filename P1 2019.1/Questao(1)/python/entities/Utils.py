from .Carro import Carro
from .Elefante import Elefante
from .Notebook import Notebook
from .Produto import Produto


class Utils:
    @staticmethod
    def existe(x: list, y: Produto):
        return x.__contains__(y)


class Utils2:
    @staticmethod
    def get_lista() -> list:
        lista = [Notebook("ABC"),
                 Elefante("Dumbo", "Orelhudo"),
                 Notebook("DEF"),
                 Carro("MER", 3.2),
                 Carro("WMB", 5.0)]

        lista[0].preco = lista[2].preco = 2999.99
        lista[3].preco = lista[4].preco = 549900.00
        return lista
