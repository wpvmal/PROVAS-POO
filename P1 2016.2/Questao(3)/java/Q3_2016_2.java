import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entities.Carro;
import entities.Cor;
import entities.Motor;

public class Q3_2016_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        Motor motor = new Motor();
        carro.setMotor(motor);

        int idCarro = sc.nextInt();
        sc.nextLine();

        List<Cor> cores = new ArrayList<>(Arrays.asList(Cor.values()));
        cores.forEach(System.out::println);

        String corMotorString = sc.nextLine();
        Cor corMotor = Cor.valueOf(corMotorString);

        motor.setCor(corMotor);
        carro.setId(idCarro);
        
        imprimeDadosCarro(carro);
        sc.close();
    }

    public static void imprimeDadosCarro (Carro n ){
        System.out.println(n.getClass().getSimpleName() 
                            + ","
                            + n.getId()
                            + ","
                            + n.getMotor().getClass().getSimpleName()
                            + "-"
                            + n.getMotor().getCor().name());
    }
}
