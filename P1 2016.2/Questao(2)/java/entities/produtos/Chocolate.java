package entities.produtos;

public class Chocolate extends Produto implements Comestivel {
    private String tipo;

    public Chocolate(double preco, int id, String tipo) {
        super(preco, id);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void desembalar() {
        System.out.println("Abrindo a embalagem do chocolate: " + getTipo());
    }
}
