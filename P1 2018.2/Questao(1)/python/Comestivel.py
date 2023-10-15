from abc import ABC, abstractmethod


class Comestivel(ABC):
    @abstractmethod
    def comer(self) -> None:
        pass
