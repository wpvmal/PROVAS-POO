package entities.produtos;
public interface Comestivel {
    public default void desembalar(){
        System.out.println(getClass().getSimpleName() + " desembalado");
    }
}
