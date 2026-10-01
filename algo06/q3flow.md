# Q3 Flowchart

Simulador de Caixa Eletrônico
Crie um programa que simule as operações básicas de um caixa eletrônico.
Ao iniciar o programa, o usuário deverá informar o valor do depósito inicial da sua conta.
Em seguida, deverá ser apresentado um menu com as seguintes opções:
1 — Consultar saldo
2 — Depositar
3 — Sacar
4 — Sair
O programa deverá utilizar o comando escolha para identificar a opção escolhida pelo usuário.
Regras
Na opção 1, o programa deverá mostrar o saldo atual da conta.
Na opção 2, o usuário deverá informar o valor que deseja depositar. O valor deverá ser acrescentado ao saldo.
Na opção 3, o usuário deverá informar o valor que deseja sacar.
Se o valor solicitado for menor ou igual ao saldo disponível, o saque deverá ser realizado e o valor deverá ser descontado do saldo.
Caso o valor solicitado seja maior que o saldo disponível, o programa deverá informar que não há saldo suficiente e não realizar o saque.
Na opção 4, o programa deverá encerrar a execução.
Caso o usuário informe uma opção que não existe no menu, o programa deverá apresentar uma mensagem de opção inválida.

## Caixa eletronico

```mermaid
graph LR
    flowchart TD
        A([Início]) --> B[/Informar depósito inicial/]
        B --> C[Saldo = depósito inicial]
        C --> D[/Exibir menu<br/>1 - Consultar saldo<br/>2 - Depositar<br/>3 - Sacar<br/>4 - Sair/]
        D --> E[/Escolher opção/]
        E --> F{Escolha}
        F -- 1 --> G[Exibir saldo atual]
        G --> D
        F -- 2 --> H[/Informar valor do depósito/]
        H --> I[Saldo = Saldo + depósito]
        I --> D
        F -- 3 --> J[/Informar valor do saque/]
        J --> K{Saque <= Saldo?}
        K -- Sim --> L[Saldo = Saldo - saque]
        L --> M[Exibir saque realizado]
        M --> D
        K -- Não --> N[Exibir saldo insuficiente]
        N --> D
        F -- 4 --> O[Encerrar programa]
        O --> P([Fim])
        F -- Outra opção --> Q[Exibir opção inválida]
        Q --> D
```