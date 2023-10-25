### Questão 1 – (6) – Não use generics nessa questão. Se não sabe o que é, não se preocupe. 

## A: 
    Crie uma classe abstrata chamada Veículo. Crie um atributo chamado modelo (String). Crie apenas UM construtor nessa classe, que recebe o modelo do Veículo. Crie os getters e setters para modelo. Se a referencia de um objeto Veiculo for impressa no console, deverá ser impresso o modelo do veículo. Syso (x), em que x é do tipo Veicul## o:> saída XYZ1243.

## B: 
    Crie a interface Abastecivel. Abastecivel possui um método chamado abastecer (double litros), que retorna um boolean que indica se o tanque desse Abastecivel recebeu aquela quantidade ou esta cheio. 

## C: 
    Crie a classe Bicicleta como subclasse de Veiculo. Crie a classe Carro e Moto como subclasse de Veiculo e, além disso, as duas devem implementar Abastecivel. Crie nas classes Carro e Moto uma constante privada que represente o tamanho total do tanque, denominada tamanhoTanque (double).  Essa constante deve ser inicializada sempre pelos respectivos construtores. Crie apenas o getter para tamanhoTanque. Crie o atributo privado quantidadeAtual, que representa quantos litros há no tanque de gasolina. Crie os getters e setters para quantidadeAtual. Implemente a lógica do abastecer tanto de Moto como de Carro. Considere que o abastecer de carro permite encher o tanque até o tamanho total do tanque (tamanhoTanque) e o de moto, completa até 99% da capacidade (Repare que é o método abastecer das duas classes que permite ou não que o combustível seja inserido). Considere que as  bombas sempre abastecem de 0.1 em 0.1 litros.  Considere que o método abastecer sempre vai receber 0.1.

## D: 
    Crie a classe BombaCombustivel. Crie os atributos quantidadeLitros (que representa a quantidade de litros de gasolina que existe na bomba) e o preço por litro. Crie o método completarTanque que receba um abastecivel como argumento. O método deve controlar o abastecimento dos Abasteciveis, ou seja, deve colocar 0.1 litros de gasolina até que o tanque seja completado. Ao final, deve imprimir no console o total de litros para encher o tanque e o preço que o dono do Abastecivel deve pagar. Observe que, se acabar a gasolina da bomba, o sistema deve parar de funcionar, não pode continuar. Mesmo assim, o preço a ser pago pelo dono deve ser impresso no console. 

## E: 
    Crie, ainda em BombaCombustivel, um novo método chamado abastecerFila (ArrayList x), que deve abastecer (completar o tanque) os Abasteciveis da fila (do ArrayList) até que a fila acabe ou a gasolina acabe. Percorra a lista do inicio ao fim (não remova os carros da fila). Antes de abastecer o Abastecivel efetivamente, imprima no console a referencia ao Abastecivel. 

## F: 
    Crie a classe principal. Crie uma BombaCombustivel. Coloque 5000 litros de gasolina nessa bomba. Crie um objeto do tipo Carro. Mande abastecer (completar). Crie um ArrayList (representando uma fila) contendo 1 objeto do tipo Carro e dois do tipo Moto. Utilize o método abastecerFila para abastecer. Considere o litro da gasolina custando 4.50 reais.
## G: 
    Você pode passar um objeto da classe bicicleta para o método completarTanque da classe BombaCombustivel? Desenvolva sua resposta.

## H:
    Considerando uma classe denominada GarrafaPet que implementa Abastecivel e não implementa Veiculo, podemos passar um objeto dessa classe para o método completarTanque da classe BombaCombustivel? Desenvolva sua resposta.