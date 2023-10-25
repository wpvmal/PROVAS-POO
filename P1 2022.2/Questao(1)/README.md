## Questão 1 (6.8) – Desenvolva o código conforme pedido abaixo:
### A1:
    Um botânico iniciante deseja criar um sistema para buscar as Plantas que estudou e
    catalogou. Como não sabia Java, catalogou as Plantas em um arquivo txt, uma por linha. Em
    seguida, pediu para você criar um sistema para buscar as plantas catalogadas. Como você não
    aprendeu a ler arquivos, encontrou na internet uma classe que lê as linhas de um arquivo e retorna
    um ArrayList com cada linha do arquivo sendo representada por uma String. Dessa maneira,
    quando você utiliza a classe LerArquivo e chama o método
    LerArquivo.retornaStrings(“c:/plantas.txt”), o método retorna um ArrayList de Strings no formato
    id#nome#tamanho#tipo. Note que o retorno do método é List. Nessa questão você precisa criar
    todas as classes necessárias para o funcionamento, menos a LerArquivo.
    Escreva uma classe Planta com 3 atributos: id (String), nome (String) e tamanho (double). Crie os
    getters e setters apenas se precisar. Crie em Planta APENAS UM construtor, que recebe o id como
    argumento.

### A2:
    Implemente um método em uma classe chamada Utils com a seguinte assinatura: public static
    boolean existe (ArrayList x, Planta y). Escreva esse método de forma que seja verificada a
    existência do objeto Planta representado por y no ArrayList representado por x, retorne verdadeiro
    se existir e falso se não existir. Considere que dois objetos Planta são iguais se possuem o mesmo
    id. Não é permitida qualquer iteração para realizar esse item, ou seja, não use for, iterator, etc.

### B:
    Crie um método em Utils com a seguinte assinatura public static Planta [] ordena (List x). Esse
    método deve retornar um array com as plantas da Lista x ordenadas pelo tamanho (tanto faz se
    for em ordem crescente ou decrescete).

### C:
    Ao utilizar o System.out.println em uma referência a um objeto Planta, deve sair no console o
    id, nome e o tamanho da Planta, ou seja, a representação desse objeto como String. Atente para
    o idem D.

### D:
    Crie 2 subclasses da classe Planta: Briofita e Pteridofita. Ao utilizar o System.out.println em uma
    referência a um objeto Briofita, deve sair no console o texto “[Briofita] ” concatenado com id, nome
    e a tamanho. No caso de Pteridofita, deve sair no console o texto “[Pteridofita] ” concatenado com
    id, nome e a tamanho. Obrigatório reutilizar o que foi feito no item C.

### E:
    Dada a classe Utils, crie o método public static ArrayList retornaDados(ArrayList
    stringsPlantas).
    Considere que o ArrayList recebido como argumento (stringsPlantas) contém Strings no seguinte
    formato: id#nome#tamanho#tipo. Por exemplo, considere os elementos desse ArrayList como
    (D1586#Musgo#15#B, 553-2#Samambaia#4#P, etc.). Esses valores representam id, nome, tamanho e tipo da Planta (Briofita (B) ou Pteridofita (P)). Em resumo, esse método deve receber
    um ArrayList contendo Strings e retornar um ArrayList contendo objetos do tipo Briofita ou
    Pteridofita.
    Assim, implemente o método retornaDados de forma que seja retornado um novo ArrayList da
    seguinte forma: os elementos de stringsPlantas devem ser percorridos (lembre-se, são Strings) e
    os valores do ArrayList que será retornado serão objetos do tipo Briofita ou Pteridofita. Resumindo,
    você irá criar um objeto Briofita (se o último caractere das Strings em stringsPlantas for B) ou
    Pteridofita (caso seja P) e adicionar ao ArrayList.

### F:
    Crie uma classe chamada SistemaPrincipal com o método main. Em seguida, receba do
    console o ID de uma planta que deseja verificar se está cadastrada no sistema. Essa classe deve
    utilizar a classe LerArquivo discutida no início da questão para ler o arquivo de plantas criado pelo
    botânico. Em seguida, use o método para transformar as Strings lidas pela classe LerArquivo em
    um ArrayList contendo Briofitas ou Pteridofitas. Desenvolva o resto desse item utilizando os
    métodos desenvolvidos nos itens anteriores para fazer o seguinte:

### F1:
    verifique se existe, no ArrayList contendo Briofitas ou Pteridofitas, uma planta com o ID inserido(utilize, obrigatoriamente, o método existente desenvolvido no item A2). Caso exista, exiba, no
    console, os dados da planta que o botânico cadastrou (id, nome e tamanho), ou seja, imprima a
    representação desse objeto como String com base nos itens C e D; caso tenha dúvidas como
    proceder, releia o item C e o item Dda questão.

### F1.2:
    caso não exista uma planta com o ID inserido, exiba no console a seguinte mensagem para
    o botânico.
    A planta com ID XYZ não existe. Considere que XYZ será o id inserido.