package entities.produtos;

public class Liquidificador extends Produto implements Ligavel {
    public String marca;

    public Liquidificador(double preco, int id, String marca) {
        super(preco, id);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void ligar() {
        System.out.println("Ligando o liquidificador");
    }
}
