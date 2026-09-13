# Q4 Flowchart

Faça um programa em java e seu respectivo fluxograma que dado um salario informado e uma parcela de emprestimo solicitado, calcule 30% do salario, caso o valor da parcela do emprestimo for maior que 30% do salario, mostre a mensagem, emprestimo nao concedido e mostre a margem atual, caso o percentual for menor, mostre a mensagem: emprestimo concedido

## Conceção de empréstimo

```mermaid
graph LR
    A([Inicio]) --> B[sal, parc, p30]
    B --> C[/sal/]
    C --> D[/parc/]
    D --> E["p30=sal*0.30"]
    E --> F{"parc<=p30"}
    F -- Sim --> G[/Empréstimo concedido/]
    F -- Não --> H[/Empréstimo não concedido, p30/]
    G --> I([Fim])
    H --> I([Fim])
```
