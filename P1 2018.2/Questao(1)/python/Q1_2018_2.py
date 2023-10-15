from Biscoito import Biscoito, Negresco, Skinny
from Utils import Utils, Utils2
import numpy


def main():
    items = Utils2.get_lista()
    id_biscoito = input("Id para busca: ")
    bis = Negresco(id_biscoito)

    if Utils.existe(items, bis):
        print("ID: {}, Cor: {}, Preco: {}".format(bis.id, bis.cor, bis.preco))

    array_bis = transforma_list_em_array(items)

    for b in array_bis:
        print(b)

    print(calcular_soma_biscoitos(array_bis))


def transforma_list_em_array(k: list) -> numpy.array:
    qt = 0
    for x in k:
        if isinstance(x, Biscoito):
            qt += 1

    array_bis = numpy.empty(qt, dtype=Biscoito)

    qt = 0
    for i in range(0, len(k)):
        if isinstance(k[i], Biscoito):
            array_bis[qt] = k[i]
            qt += 1

    return array_bis


def calcular_soma_biscoitos(array_bis: numpy.array) -> int:
        total = 0
        for b in array_bis:
            total += b.preco

        return total


if __name__ == "__main__":
    main()
