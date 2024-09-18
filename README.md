# Desafio Controle de Fluxo - DIO - Trilha Java Básico
Este projeto foi desenvolvido como parte do módulo de Controle de Fluxo, onde exercitamos conceitos de laços de repetição e tratamento de exceções em Java.

## Descrição do Desafio
O desafio consiste em criar um programa que receba dois parâmetros via terminal, ambos representando números inteiros. 
A partir desses números, o programa executará um loop (`for`) para realizar interações e imprimir a contagem de números no console.

### Regras:
1. Contagem de Números: O programa deve contar e imprimir os números incrementados no formato:

`Imprimindo o número 1`

`Imprimindo o número 2`

Exemplo: Se os números passados forem 12 e 30, o programa executará 18 iterações e imprimirá os números de 1 até 18.

2. Validação de Parâmetros: Caso o primeiro parâmetro seja maior que o segundo, o sistema deverá lançar uma exceção customizada
chamada `ParametrosInvalidosException` com a mensagem: "O segundo parâmetro deve ser maior que o primeiro."

### Estrutura do Projeto

O projeto consiste em duas classes principais:

**Contador.java:** Contém toda a lógica do programa, desde a recepção dos parâmetros até a execução do loop `for` para realizar a contagem e impressão no console.

**ParametrosInvalidosException.java:** Exceção personalizada para lidar com o cenário onde o primeiro número passado é maior que o segundo. Essa classe será 
utilizada para garantir a integridade das entradas e fornecer uma mensagem de erro adequada.


### Como Executar
1. Clone o repositório do projeto.
2. Compile o código Java usando sua IDE ou via terminal.
3. Execute o programa fornecendo os parâmetros via terminal.
