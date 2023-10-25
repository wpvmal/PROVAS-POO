public class Planta {
    private String id;
    private String nome;
    private double tamanho;

    public Planta(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Planta) {
            return getId().equalsIgnoreCase(((Planta) o).getId());
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + "] " + getId() + ", " + getNome() + ", " + getTamanho();
    }
}
