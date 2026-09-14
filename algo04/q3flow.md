# Q3 Flowchart

Faça um programa em java e seu respectivo fluxograma que dada 2 notas (p1 e p2) e a quantidade de faltas, calcule a media e verifique se a media e maior igual a seis e a quantidade de faltas <= 20 caso verdadeiro mostre aluno aprovado e mostre o valor da media, caso negativo mostre a mensagem aluno reprovado e qual a nota sera necessario tirar para ser aprovado no exame

## Aprovação ou reprovação escolar

```mermaid
graph LR
    A([Inicio]) --> B[p1, p2, p3, F, media]
    B --> C[/p1/]
    C --> D[/p2/]
    D --> E[/F/]
    E --> F["media=p1+p2/2"]
    F --> G{"media>=6? e F<=20?"}
    G -- Sim --> I[/Aprovado/]
    G -- Não --> H[/Reprovado/]
    H --> J{"Reprovado por falta?"}
    J -- Não --> K["p3=18-(p1+p2)"]
    J -- Sim --> L[/Reprovado por falta/]
    K --> M[/p3/]
    M --> N([Fim])
    L --> N([Fim])
    I --> N([Fim])
```
