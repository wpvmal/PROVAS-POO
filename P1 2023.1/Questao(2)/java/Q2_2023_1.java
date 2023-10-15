import java.util.Scanner;

public class Q2_2023_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int maxNumber = 1000, contador = 0;
        double somaPeso = 0;
        String[][] matrizPessoas = new String[maxNumber][3];

        System.out.println("Formato de entrada: nome#peso#altura");
        System.out.println("Para sair inserir: \"finalizar\"\n");

        String line = sc.nextLine();
        while (!line.equalsIgnoreCase("finalizar") && contador != maxNumber) {
            matrizPessoas[contador] = line.split("#");
            line = sc.nextLine();
            contador++;
        }

        for (int i = 0; i < contador; i++) {
            somaPeso += Double.parseDouble(matrizPessoas[i][1]);
        }
        System.out.println("Soma: " + somaPeso);
        System.out.println("Media:" + (somaPeso / contador));
        sc.close();
    }
}
