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

# Autor

William Sarti José

https://www.linkedin.com/in/william-analistadesistema/
