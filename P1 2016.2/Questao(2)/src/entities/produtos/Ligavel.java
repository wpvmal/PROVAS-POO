package entities.produtos;
public interface Ligavel {
    public default void ligar(){
        System.out.println(getClass().getSimpleName() + " ligado");
    }
}
