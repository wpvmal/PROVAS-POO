
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

import entities.Biscoito;
import entities.Carro;
import services.Utils;
import services.Utils2;

public class Q1_2018_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Object> objs = Utils2.getLista();

        String i = sc.nextLine();
        Biscoito bis = new Biscoito(i);

        if (Utils.existe(objs, bis)) {
            for (int index = 0; index < objs.size(); index++) {
                if (Utils.existe(Arrays.asList(objs.get(index)), bis)) {
                    System.out.println(objs.get(index));
                    System.out.println();
                }
            }
        } else {
            System.out.println("Não existe");
        }

        objs.add(new Carro("Fusca"));

        Biscoito[] biscoitos = transformaListEmArray(objs);

        imprimirPrecoTotal(biscoitos);

        sc.close();
    }

    private static void imprimirPrecoTotal(Biscoito[] biscoitos) {
        int totalPrice = 0;
        for (Biscoito biscoito : biscoitos) {
            totalPrice += biscoito.getPreco();
        }
        System.out.println(totalPrice);
    }

    private static Biscoito[] transformaListEmArray(List<Object> k) {
        int qt = 0;
        for (Object object : k) {
            if (object instanceof Biscoito) {
                qt++;
            }
        }
        Biscoito[] biscoitos = new Biscoito[qt];

        int j = 0;

        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) instanceof Biscoito) {
                biscoitos[j++] = (Biscoito) k.get(i);
            }
        }
        return biscoitos;
    }

}
