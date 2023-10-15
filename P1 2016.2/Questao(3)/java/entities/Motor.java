package entities;

public class Motor {
    private Cor cor;

    public Motor() {
    }

    public Motor(Cor cor){
        this.cor = cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }

    public Cor getCor(){
        return cor;
    }
}
