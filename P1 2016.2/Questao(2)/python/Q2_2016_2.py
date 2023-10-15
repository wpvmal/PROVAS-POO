from entities.produtos.Carro import Carro
from entities.produtos.Chocolate import Chocolate
from entities.Cliente import Cliente
from entities.produtos.Liquidificador import Liquidificador
from entities.Loja import Loja


def main():
    mubak_loja = Loja(1, "mubaK")

    car_fusca = Carro(15999.99, 521, "WPV-2023")
    liqui_laidnom = Liquidificador(99.00, 324, "Laidnom")
    choco_kalag = Chocolate(3.99, 865, "Branco")

    mubak_loja.adicionar_ao_estoque(car_fusca)
    mubak_loja.adicionar_ao_estoque(liqui_laidnom)
    mubak_loja.adicionar_ao_estoque(choco_kalag)

    cli_william = Cliente("111.222.333-44")

    cli_william.comprar(mubak_loja, car_fusca)
    cli_william.comprar(mubak_loja, choco_kalag)

    print("Faturamento:", mubak_loja.faturamento_bruto())

    print("Produtos Vendidos:", mubak_loja.quantidade_produtos_vendidos())

    print("Produtos Ligaveis Vendidos:", mubak_loja.quantidade_produtos_ligaveis_vendidos())

    mubak_loja.imprimir_relatorio_venda()

    mubak_loja.imprimir_produtos_no_estoque()


if __name__ == "__main__":
    main()
