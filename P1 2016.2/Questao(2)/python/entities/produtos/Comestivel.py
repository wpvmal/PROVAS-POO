from abc import ABC, abstractmethod


class Comestivel(ABC):
    @abstractmethod
    def desembalar(self):
        pass
