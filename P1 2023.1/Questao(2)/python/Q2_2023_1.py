class Pessoa:
    def __init__(self, nome: str, peso: float, altura: float):
        self.nome = nome
        self.peso = peso
        self.altura = altura


def main():
    lista_pessoas = list()
    for i in range(0, 1000):
        string = input("Insira nome#peso#altura e exit para sair: ")

        if string != "exit":
            dados_pessoa = string.split("#")
            lista_pessoas.append(Pessoa(dados_pessoa[0],
                                        float(dados_pessoa[1]),
                                        float(dados_pessoa[2])))
        else:
            break

    total_pesos = float()

    for p in lista_pessoas:
        total_pesos += p.peso

    print("Media Pesos:", total_pesos / len(lista_pessoas))


if __name__ == "__main__":
    main()
