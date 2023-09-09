package entities;

public class Biscoito{

    private String id;
    private String cor;
    private int preco;

    public Biscoito(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getCor(){
        return cor;
    }

    public int getPreco(){
        return preco;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Biscoito){
            return ((Biscoito)o).getId().compareTo(id) == 0;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " id=" + id + ", cor=" + cor + ", preco=" + preco + "]";
    }
}
