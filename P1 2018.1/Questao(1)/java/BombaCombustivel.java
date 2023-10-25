import java.util.ArrayList;

public class BombaCombustivel {
    private double quantidadeLitros;
    private double precoPorLitro;

    public BombaCombustivel(double quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public void completarTanque(Abastecivel x) {
        int i = 0;

        while (quantidadeLitros >= 0.1) {
            i++;
            if (x.abastecer(0.1)) {

            } else {
                i--;
                break;
            }
        }

        if (i != 0) {
            System.out.printf("Total em litros: %.2f\n", (i * 0.1));
            System.out.printf("Total a pagar: %.2f\n", (i * 0.1 * precoPorLitro));
        }

    }

    public void abastecerFila(ArrayList<Veiculo> x) {
        for (Veiculo a : x) {
            if (a instanceof Abastecivel) {
                System.out.println(a);
                completarTanque((Abastecivel) a);
            }
        }
    }

    public double getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }
}