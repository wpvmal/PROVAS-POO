# Questão 1 (6) –  Desenvolva o código conforme pedido abaixo:

A - Crie a interface Comestivel com apenas um método denominado comer, que não possui argumentos e que não retorna nada.

B1 – Escreva uma classe Biscoito com 3 atributos: id (String),  cor (String) e preco (int). Crie os getters e setters apenas se precisar. Crie em Biscoito APENAS UM construtor, que recebe o id como argumento.  Implemente um método em uma classe chamada Utils com a seguinte assinatura: public static boolean existe (List x, Biscoito y); considere que a lista possui objetos do tipo Biscoito, mas podendo possuir outros objetos. Escreva esse método de forma que seja verificada a existência do objeto Biscoito representado por y na lista representada por x, retorne verdadeiro se existir e falso se não existir. Considere que dois objetos Biscoito são iguais se possuem o mesmo id. Não é permitida qualquer iteração para realizar esse item, ou seja, não use for, iterator, etc.

B2- Crie 2 subclasses da classe Biscoito: Negresco e Skiny. Implemente a interface Comestivel.

C1- Considere um método denominado Utils2.getLista(): List que retorne uma lista de objetos de diversos tipos, incluindo Biscoitos. Não crie nem a classe Utils2 nem o método getLista(), suponha que já existe. Crie uma classe principal que receba do console o id de um Biscoito. Em seguida, verifique, com base no código desenvolvido no item B, se o Biscoito existe na lista retornada por Utils2.getLista(). Caso sim, exiba no console uma mensagem informando o id, cor e preço do Biscoito.

C2 – Ainda na classe principal, crie um método denominado transformaListEmArray que receba uma lista k de objetos (de diversos tipos (ex: Elefante, Carro, Conta), incluindo Biscoitos) e retorna um array de Biscoitos, contendo os objetos do tipo Biscoito na lista representada por k. O array DEVE ter o comprimento do número de Biscoitos em k. Ex: se em k existem 10 Biscoitos e 15 Carros, o array DEVE ter tamanho 10 e estar preenchido com o s 10 Biscoitos.

D – Em seguida, crie um método para calcular a soma de todos os valores no array de Biscoitos criado no item C2. Imprima o total no console.

