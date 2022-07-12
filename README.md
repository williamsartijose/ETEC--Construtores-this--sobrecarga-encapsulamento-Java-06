# ETEC-Construtores-This-Sobrecarga-Encapsulamento-Java-06


#### Construtores:

• É uma operação especial da classe, que executa no momento da instanciação do objeto
• Usos comuns: 
• Iniciar valores dos atributos
• Permitir ou obrigar que o objeto receba dados / 
dependências no momento de sua instanciação (injeção de dependência) 
• Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
Product p = new Product();
• É possível especificar mais de um construtor na mesma classe (sobrecarga)

#### Palavra this:

• É uma referência para o próprio objeto

• Usos comuns: • Diferenciar atributos de variáveis locais
• Passar o próprio objeto como argumento na chamada de um método ou
construtor

#### Sobrecarga

• É um recurso que uma classe possui de oferecer mais de uma
operação com o mesmo nome, porém com diferentes listas de
parâmetros.

#### Encapsulamento

•É um princípio que consiste em
esconder detalhes de implementação
de uma classe, expondo apenas
operações seguras e que mantenham
os objetos em um estado consistente. 
• Regra de ouro: o objeto deve sempre
estar em um estado consistente, e a
própria classe deve garantir isso.


## Exercício de fixação:
#### Problema "Resolvido abaixo" -  
(https://github.com/williamsartijose/ETEC-Praticando-Logicas-Estrutura-Repetitivas-Java-04/blob/main/src/EstruturaWhile_Enquanto/ProblemaCrescente.java)

Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
![Web 2](https://github.com/williamsartijose/ETEC-Construtores-This-Sobrecarga-Encapsulamento-Java-06/blob/main/1.PNG)
![Web 2](https://github.com/williamsartijose/ETEC-Construtores-This-Sobrecarga-Encapsulamento-Java-06/blob/main/2.PNG)
![Web 2](https://github.com/williamsartijose/ETEC-Construtores-This-Sobrecarga-Encapsulamento-Java-06/blob/main/3.PNG)


## DESAFIO: Combate

Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma 
quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo 
que em cada turno, os dois campeões se atacam. Você deve fazer um programa para instanciar dois 
campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão, 
conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o 
combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE". 
A regra para um campeão A receber dano de outro campeão B é a seguinte: 
1) A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a 
quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser menor que zero. 
2) Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder. 
Você deve criar uma classe para representar o campeão, conforme projeto abaixo. 
O método takeDamage serve para 
fazer com que o campeão receba dano 
advindo do ataque de outro campeão, 
conforme regras acima. 
O método status deve retornar o nome 
e a situação de vida do campeão 
(inclusive com a palavra "morreu" se 
a vida estiver a zero), conforme 
exemplos

![Web 2](https://github.com/williamsartijose/Desafio-Combate-em-JAVA-ECLIPSE-POO-/blob/main/1.png)



CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS): 
1) Nomes de classes, atributos, métodos e argumentos respeitando o projeto, bem como as convenções 
de nome para Java (classe com primeira letra maiúscula, e padrão "camel case" para atributos, variáveis 
e métodos. 
2) Atributos da classe Champion corretos e devidamente encapsulados com métodos get/set. 
3) Construtor da classe Champion correto. 
4) Método takeDamage da classe Champion correto. 
5) Método status da classe Champion correto. 
6) Comportamento do programa correto conforme exemplos.

# Autor

William Sarti José

https://www.linkedin.com/in/william-analistadesistema/
