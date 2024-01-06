# Fazenda Simulada - Sistema de Gerenciamento

Este é um programa de simulação de uma fazenda que gerencia animais e funcionários. Ele foi desenvolvido em Java e utiliza conceitos de orientação a objetos para representar a dinâmica de uma fazenda com diferentes tipos de animais e funcionários.

## Funcionalidades Principais

### Animais

- **Gado, Porcos e Vacas**
  - Cada animal possui suas características específicas como ID, idade e peso.
  - Emitem sons característicos quando solicitado.
  - Podem ser alimentados para aumentar seu peso.
  - Calculam valores estimados para abate ou venda de leite.

### Funcionários

- **Tratadores de Animais e Gerentes**
  - Funcionários com diferentes funções na fazenda.
  - Gerentes têm um percentual sobre o total arrecadado, enquanto os tratadores possuem um percentual sobre as vendas realizadas.

### Operações

O programa simula diversas operações realizadas na fazenda:

- Adição e remoção de animais e funcionários.
- Alimentação e obtenção de informações sobre os animais.
- Cálculo de salários de funcionários após vendas.
- Manipulação de valores relacionados ao abate dos animais.
- Extração de leite e cálculo de preços estimados.

## Estrutura do Código

O código é organizado em classes e interfaces:

- **`Main`**: Ponto de entrada do programa, realiza as operações na fazenda.
- **`Funcionarios`**: Classe abstrata que define comportamentos dos funcionários.
- **`TratadorAnimais` e `Gerente`**: Implementações específicas de funcionários.
- **`Gado`, `Porcos` e `Vacas`**: Representações dos diferentes tipos de animais na fazenda.
- **`Animais`**: Interface que define comportamentos comuns dos animais.

## Utilização

Para utilizar o programa, basta executar o arquivo `Main.java`. Isso iniciará a simulação da fazenda, demonstrando diversas operações e interações entre animais e funcionários.

## Observações

O programa foi desenvolvido para demonstrar conceitos de orientação a objetos em Java, não refletindo necessariamente uma implementação realista de uma fazenda.

## Como Utilizar

Clone o repositório para sua máquina local:

'''
git clone https://github.com/marceloflp/sistema-de-gerenciamento-de-fazenda.git
Abra o projeto em seu ambiente de desenvolvimento Java preferido.
'''

Execute a classe Main para testar as funcionalidades do sistema de gerenciamento da fazenda.
