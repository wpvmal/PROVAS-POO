from BancoDeDados import BancoDeDados
from Funcionario import Funcionario


def main():
    func_nome = input("Insira o Nome do Funcionario: ")

    func_lista_strings = BancoDeDados.get_func()
    func_lista = []

    for s in func_lista_strings:
        func_lista_aux = s.split("#", 2)
        func_aux = Funcionario(nome=func_lista_aux[0], idade=int(func_lista_aux[1]))
        func_lista.append(func_aux)

    media_idades = 0
    for f in func_lista:
        media_idades += f.idade / len(func_lista)

    index = func_lista.index(func_nome)
    if index >= 0:
        print("{} - idade: {} - Media de todos os funcionarios - {:.2f}".format(func_lista[index].nome,
                                                                                func_lista[index].idade, media_idades))


if __name__ == "__main__":
    main()
