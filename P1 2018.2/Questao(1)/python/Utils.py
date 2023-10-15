from .Biscoito import Biscoito


class Utils:
    @staticmethod
    def existe(self, *x, y: Biscoito) -> bool:
        return x.__contains__(y)
