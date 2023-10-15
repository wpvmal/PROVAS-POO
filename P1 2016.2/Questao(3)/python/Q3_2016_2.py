from entities.Carro import Carro
from entities.Motor import Motor


def main():
    motor_cor = input("Insira a cor do Motor: ")
    motor_ls = Motor(motor_cor)
    carro_camaro = Carro(int(input("Insira a ID do Carro: ")), motor_ls)

    imprime_dados_carro(carro_camaro)


def imprime_dados_carro(n: Carro):
    print("Cor do Motor do Carro ID-{} é: {}".format(n.id_carro, n.motor.cor))


if __name__ == "__main__":
    main()
