from .Motor import Motor


class Carro:
    def __init__(self, id_carro: int, motor: Motor):
        self.id_carro = id_carro
        self.motor = motor
