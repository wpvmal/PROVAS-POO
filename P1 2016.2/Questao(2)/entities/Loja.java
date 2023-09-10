package entities;

import java.util.ArrayList;
import java.util.List;

import entities.produtos.Carro;
import entities.produtos.Chocolate;
import entities.produtos.Ligavel;
import entities.produtos.Liquidificador;
import entities.produtos.Produto;

public class Loja {
    private int id;
    private String nome;
    private List<Produto> produtosVendidos = new ArrayList<>();
    private List<Produto> estoque = new ArrayList<>();

    public Loja(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public double faturamentoBruto(){
        double soma = 0.0;

        for (Produto produto : produtosVendidos) {
            soma += produto.getPreco();
        }
        return soma;
    }

    public int quantidadeProdutosVendidos(){
        return produtosVendidos.size();
    }

    public int quantidadeProdutosLigaveisVendidos(){
        int soma = 0;
        for (Produto produto : produtosVendidos) {
            if (produto instanceof Ligavel){
                soma++;
            }
        }
        return soma;
    }

    public void imprimirRelatorioVenda(){
        for (Produto produto : produtosVendidos) {
            System.out.print(produto.getClass().getSimpleName() 
                                            + "," 
                                            + produto.getId() 
                                            + "," 
                                            + produto.getPreco());
// Se não fosse o enunciado eu só implementaria um toString na Produto e daria
// @Override nessas classes com esses adicionais
            if (produto instanceof Carro){
                System.out.println("," + ((Carro)produto).getPlaca());
            }
            else 
            if (produto instanceof Liquidificador){
                System.out.println("," + ((Liquidificador)produto).getMarca());
            }
            else 
            if (produto instanceof Chocolate){
                System.out.println("," + ((Chocolate)produto).getTipo());
            }
            else{
                System.out.println();
            }
        }
    }

    public void adicionarAoEstoque(Produto produto){
        estoque.add(produto);
    }

    public void vender(Produto produto){
        int i = estoque.indexOf(produto);
        produtosVendidos.add(estoque.remove(i));
    }

    public void imprimirProdutosNoEstoque(){
        for (Produto produto : estoque) {
            System.out.print(produto.getClass().getSimpleName() 
                                            + "," 
                                            + produto.getId() 
                                            + "," 
                                            + produto.getPreco());
// Se não fosse o enunciado eu só implementaria um toString na Produto e daria
// @Override nessas classes com esses adicionais
            if (produto instanceof Carro){
                System.out.println("," + ((Carro)produto).getPlaca());
            }
            else 
            if (produto instanceof Liquidificador){
                System.out.println("," + ((Liquidificador)produto).getMarca());
            }
            else 
            if (produto instanceof Chocolate){
                System.out.println("," + ((Chocolate)produto).getTipo());
            }
            else{
                System.out.println();
            }
        }
    }
}
