import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2_2018_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BancoDeDados BD = new BancoDeDados();
        BD.incializarParaTeste();

        String nomeProcurado = sc.nextLine();
        List<String> funcs = BD.getFunc();

        List<String[]> matrizFunc = new ArrayList<>();
        int somaIdades = 0;
        for (int i = 0; i < funcs.size(); i++) {
            matrizFunc.add(funcs.get(i).split("#"));
            somaIdades += Integer.parseInt(matrizFunc.get(i)[1]);

            if (nomeProcurado.equalsIgnoreCase(matrizFunc.get(i)[0])) {

                System.out.print(matrizFunc.get(i)[0]
                        + " - idade: "
                        + matrizFunc.get(i)[1]);
            }
        }

        System.out.println(" - media da idade de todos funcionarios - " + somaIdades / funcs.size());
        sc.close();
    }
}
