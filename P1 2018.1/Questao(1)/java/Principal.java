import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel(5000);

        bomba.setPrecoPorLitro(4.500);

        Carro fusca = new Carro("fusca", 35);

        //bomba.completarTanque(fusca);

        Moto bis = new Moto("bis", 8);
        Moto cb = new Moto("cb", 10);

        ArrayList<Veiculo> veiculos = new ArrayList<>() {
            {
                add(fusca);
                add(bis);
                add(cb);
            }
        };

        bomba.abastecerFila(veiculos);
    }

}
