class Funcionario:
    def __init__(self, nome: str, idade: int):
        self.nome = nome
        self.idade = idade

    def __eq__(self, other) -> bool:
        if isinstance(other, str):
            return self.nome == other
        if isinstance(other, Funcionario):
            return self.nome == other.nome

        return False
