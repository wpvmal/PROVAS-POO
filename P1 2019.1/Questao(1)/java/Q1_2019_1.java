import java.util.List;
import java.util.Scanner;

import entities.Produto;
import services.Utils;
import services.Utils2;

public class Q1_2019_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Object> listaObjetos = Utils2.getLista();
        String id = sc.nextLine();
        Produto produtoProcurado = new Produto(id);

        if (Utils.existe(listaObjetos, produtoProcurado)) {
            System.out.println(produtoProcurado);
        } else {
            System.out.println("Produto não existe no sistema");
        }

        Produto[] arrayProdutos = transformaListEmArray(listaObjetos);

        double somaProdutos = somaProdutos(arrayProdutos);

        System.out.println(somaProdutos);

        sc.close();
    }

    private static double somaProdutos(Produto[] arrayProdutos) {
        double soma = 0.0;
        for (Produto produto : arrayProdutos) {
            soma += produto.getPreco();
        }
        return soma;
    }

    private static Produto[] transformaListEmArray(List<Object> k) {
        Produto[] produtos;
        int j = 0;
        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) instanceof Produto) {
                j++;
            }
        }
        produtos = new Produto[j];
        j = 0;
        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) instanceof Produto) {
                produtos[j++] = (Produto) k.get(i);
            }
        }
        return produtos;
    }
}
