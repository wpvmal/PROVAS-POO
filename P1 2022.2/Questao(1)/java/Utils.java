import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean existe(ArrayList<Planta> x, Planta y) {
        return x.contains(y);
    }

    public static Planta[] ordena(List<Planta> x) {
        Planta[] plantas = new Planta[x.size()];

        x.sort((a, b) -> a.getTamanho() > b.getTamanho() ? 1 : 0);

        for (int i = 0; i < plantas.length; i++) {
            plantas[i] = x.get(i);
        }
        return plantas;
    }

    public static ArrayList<Planta> retornaDados(ArrayList<String> stringsPlantas) {
        ArrayList<Planta> plantas = new ArrayList<>();

        for (String s : stringsPlantas) {
            String[] valores = s.split("#");

            if (valores[3].equalsIgnoreCase("b")) {
                Briofita b = new Briofita(valores[0]);
                b.setNome(valores[1]);
                b.setTamanho(Double.parseDouble(valores[2]));
                plantas.add(b);
            }

            if (valores[3].equalsIgnoreCase("p")) {
                Pteridofita p = new Pteridofita(valores[0]);
                p.setNome(valores[1]);
                p.setTamanho(Double.parseDouble(valores[2]));
                plantas.add(p);
            }
        }
        return plantas;
    }
}
