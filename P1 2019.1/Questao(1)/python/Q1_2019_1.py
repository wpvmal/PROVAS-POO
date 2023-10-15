import numpy

from entities.Utils import Utils, Utils2
from entities.Produto import Produto


def main():
    lista_itens = Utils2.get_lista()

    id_produto = input("Id produto para buscar: ")
    produto_buscado = Produto(id_produto)

    if Utils.existe(lista_itens, produto_buscado):
        indice_produto = lista_itens.index(produto_buscado)

        print(lista_itens[indice_produto])

    array_produtos = transforma_list_em_array(lista_itens)

    total_produtos_preco = soma_valor_produtos(array_produtos)

    print(total_produtos_preco)


def transforma_list_em_array(k: list) -> numpy.array(Produto):
    qt = int()
    for o in k:
        qt += (1 if isinstance(o, Produto) else 0)

    array_produtos = numpy.empty(qt, dtype=Produto)
    qt = 0
    for o in k:
        if isinstance(o, Produto):
            array_produtos[qt] = o
            qt += 1

    return array_produtos


def soma_valor_produtos(array_produtos: numpy.array(Produto)) -> float:
    total = float()
    for p in array_produtos:
        total += p.preco

    return total


if __name__ == "__main__":
    main()
