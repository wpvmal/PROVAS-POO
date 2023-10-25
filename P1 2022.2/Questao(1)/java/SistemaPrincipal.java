import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //COLOCA SEU PATH
        String path = "/home/wpvmal/Documents/PROVAS-POO/P1 2022.2/Questao(1)/java/plantas.txt";

        String idBuscado = sc.nextLine();
        Planta busca = new Planta(idBuscado);

        List<String> stringPlantas = LerArquivo.retornaStrings(path);
        ArrayList<Planta> plantas = Utils.retornaDados(new ArrayList<>(stringPlantas));

        if (Utils.existe(plantas, busca)){
            System.out.println(plantas.get(plantas.indexOf(busca)));
        }
        else{
            System.out.println("A planta com ID " + idBuscado + " não existe.");
        }
        

        sc.close();
    }
}