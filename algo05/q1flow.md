# Q1 Flowchart

Construa um programa em java e seu respectivo fluxograma para o seguinte problema: informada duas notas p1 e p2 e a quantidade de faltas, primeiro identifique se as faltas são maior que 20, caso verdadeiro mostre: aluno reprovado por faltas, caso negativo, calcule a media de p1 e p2 e verifique se a media e maior que 6 caso afirmativo mostre aluno aprovado, caso negativo colete a variável p3 e calcule a media aritmética entre as 3 e verifique novamente se a media recalculada e maior que 6 caso afirmativo mostre, aluno aprovado no exame, caso negativo aluno reprovado no exame

## Aprovação ou reprovação escolar

```mermaid
graph LR
    A([Inicio]) --> B[p1, p2, p3, F, media]
    B --> C[/p1/]
    C --> D[/p2/]
    D --> E[/F/]
    E --> F{"F>20?"}
    F -- Sim --> G["Aluno reprovado por faltas."]
    F -- Não --> H["media=(p1 + p2)/2"]
    H --> I{"media>=6?"}
    I -- Não --> J{"p3=nul?"}
    J -- Sim --> K[/p3/]
    K --> O["media=(p1+p2+p3)/3"]
    J -- Não --> P["Aluno reprovado no exame."]
    I -- Sim --> L{"p3=nul?"}
    L -- Sim --> M["Aluno aprovado!"]
    L -- Não --> N["Aluno aprovado no exame!"]
    O --> I
    G --> Q([Fim])
    P --> Q([Fim])
    M --> Q([Fim])
    N --> Q([Fim])
    
```
