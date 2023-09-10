package entities;

import entities.produtos.Produto;

public class Cliente {
    private String cpf;

    
    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void comprar(Loja loja, Produto prod){
        loja.vender(prod);
    }
}
