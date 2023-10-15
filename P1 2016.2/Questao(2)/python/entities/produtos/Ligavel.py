from abc import ABC, abstractmethod


class Ligavel(ABC):
    @abstractmethod
    def ligar(self) -> None:
        pass
