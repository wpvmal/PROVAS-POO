# Questão 1 (6.5) 
##  Desenvolva o código conforme pedido abaixo:

A - Crie a interface Eletronico com dois métodos denominados ligar e desligar, que não possuem argumentos e que não retornam nada. 

B1 – Escreva uma classe Produto com 3 atributos: id (String),  cor (String) e preco (double). Crie os getters e setters apenas se precisar. Crie em Produto APENAS UM construtor, que recebe o id como argumento.  Implemente um método em uma classe chamada Utils com a seguinte assinatura: public static boolean existe (List x, Produto y); considere que a lista possui objetos do tipo Produto, mas podendo possuir objetos de outros tipos. Escreva esse método de forma que seja verificada a existência do objeto Produto representado por y na lista representada por x, retorne verdadeiro se existir e falso se não existir. Considere que dois objetos Produto são iguais se possuem o mesmo id. Não é permitida qualquer iteração para realizar esse item, ou seja, não use for, iterator, etc. 

B1.5 – Dado que b é uma referência a um objeto do tipo Produto, implemente o código que faz com que, caso essa referência seja impressa com o System.out.println, seja apresentado no console o id, cor e preço do produto no seguinte formato: [id – cor - preço]. Ex: [COD001 – amarelo  3000.67].

B2- Crie 1 subclasse da classe Produto: Notebook. Implemente a interface Eletronico.

C1- Considere um método denominado Utils2.getLista(): List que retorne uma lista de objetos de diversos tipos, incluindo Produtos. Não crie nem a classe Utils2 nem o método getLista(), suponha que já existe. (Não implemente nada nesse item, são apenas informações.)

C2- Crie uma classe principal que receba do console o id de um Produto. Em seguida, verifique, com base no código desenvolvido no item B1, se o Produto existe na lista retornada por Utils2.getLista(). Caso sim, exiba no console o id, cor e preço do Produto existente na lista retornada ao invocar o método Utils2.getLista(). 

C3 – Ainda na classe principal, crie um método denominado transformaListEmArray que receba uma lista k de objetos (de diversos tipos (ex: Elefante, Carro, Conta), incluindo Produtos) e retorna um array de Produtos, contendo os objetos do tipo Produto na lista representada por k. O array DEVE ter o comprimento do número de Produtos em k. Ex: se em k existem 10 Produtos e 15 Carros, o array DEVE ter tamanho 10 e estar preenchido com os 10 Produtos.

D – Em seguida, crie um método para retornar a soma de todos os preços no array de Produtos criado no item C3.
