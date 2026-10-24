# Q3 Flowchart

Implemente o laço faça enquanto com a pergunta deseja continua S/N para implementar a repetição do algorimo de caixa eletronico, usando na atividade de SWITCH CASE

## Switch case: caixa eletrônico
```mermaid
graph LR
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