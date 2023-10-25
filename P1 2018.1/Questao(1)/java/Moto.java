public class Moto extends Veiculo implements Abastecivel {
    // exercício fala pra usar tamanhoTanque o ideal seria TAMANHO_TANQUE pra
    // indicar que é uma constante
    private final double tamanhoTanque;

    private double quantidadeAtual;

    public Moto(String modelo, double tamanhoTanque) {
        super(modelo);
        this.tamanhoTanque = tamanhoTanque;
    }

    public double getTamanhoTanque() {
        return tamanhoTanque;
    }

    public double getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(double quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public boolean abastecer(double litros) {
        if (quantidadeAtual < (tamanhoTanque * 0.99)) {
            quantidadeAtual += litros;
            if (quantidadeAtual > (tamanhoTanque * 0.99)) {
                quantidadeAtual -= litros;
                return false;
            }
            return true;
        }
        return false;
    }

}