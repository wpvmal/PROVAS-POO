import entities.Cliente;
import entities.Loja;
import entities.produtos.Carro;
import entities.produtos.Chocolate;
import entities.produtos.Liquidificador;

public class App {
    public static void main(String[] args) throws Exception {
        Loja sanacirema = new Loja(1, "Sanacirema");
        Carro fusca = new Carro(30000.0, 12, "ABC-2000");
        Liquidificador easyPower = new Liquidificador(82.35, 54, "Global");
        Chocolate linguaDeCobra = new Chocolate(10.9, 863, "Meio amargo");

        sanacirema.adicionarAoEstoque(fusca);
        sanacirema.adicionarAoEstoque(easyPower);
        sanacirema.adicionarAoEstoque(linguaDeCobra);

        Cliente williamPlace = new Cliente("643.432.337-79");

        williamPlace.comprar(sanacirema, fusca);
        williamPlace.comprar(sanacirema, linguaDeCobra);

        System.out.println("FATURAMENTO: "  + sanacirema.faturamentoBruto());
        
        System.out.println("QUANTIDADE VENDIDA:" + sanacirema.quantidadeProdutosVendidos());

        System.out.println("QUANTIDADE VENDIDA(LIGAVEIS):" + sanacirema.quantidadeProdutosLigaveisVendidos());

        System.out.println("RELATORIO DE VENDA:");
        sanacirema.imprimirRelatorioVenda();
        System.out.println("PRODUTOS EM ESTOQUE:");
        sanacirema.imprimirProdutosNoEstoque();
    }
}
