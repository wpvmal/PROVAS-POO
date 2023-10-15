package entities.produtos;

public abstract class Produto {
    private double preco;
    private int id;

    public Produto(double preco, int id) {
        this.preco = preco;
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object p) {
        if (((Produto) p).getId() == getId()) {
            return true;
        }
        return false;
    }
}
