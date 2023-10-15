package entities;

public class Elefante {
    public String nome;

    public Elefante(String nome) {
        this.nome = nome;
    }

    public String comeAmendoim() {
        return nome + " comeu amendoim";
    }

    @Override
    public String toString() {
        return comeAmendoim();
    }
}
