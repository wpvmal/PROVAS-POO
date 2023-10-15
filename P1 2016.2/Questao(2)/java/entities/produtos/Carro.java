package entities.produtos;

public class Carro extends Brinquedo implements Ligavel {
    private String placa;

    public Carro(double preco, int id, String placa) {
        super(preco, id);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void ligar() {
        System.out.println("Girando a chave do carro");
    }
}
