# Q1 Flowchart

Campeonato de Atletismo, Uma escola de atletismo deseja inscrever seus alunos em uma competição. Para definir a categoria de cada atleta, o programa deverá receber a idade do aluno.

As categorias são:
De 0 a 5 anos: não pode competir
De 6 a 8 anos: Pré-mirim
De 9 a 11 anos: Mirim
De 12 a 14 anos: Infantil
De 15 a 17 anos: Juvenil
De 18 a 39 anos: Adulto
De 40 a 49 anos: Master 1
De 50 a 59 anos: Master 2
60 anos ou mais: Master 3

O programa deverá informar a categoria do atleta ou informar que ele não pode competir.

## Campeonato de atletismo

```mermaid
graph LR
    A([Início]) --> B[/Digite a idade/]
    B --> C{Idade <= 5?}
    C -- Sim --> D[Não pode competir]
    C -- Não --> E{Idade <= 8?}
    E -- Sim --> F[Pré-mirim]
    E -- Não --> G{Idade <= 11?}
    G -- Sim --> H[Mirim]
    G -- Não --> I{Idade <= 14?}
    I -- Sim --> J[Infantil]
    I -- Não --> K{Idade <= 17?}
    K -- Sim --> L[Juvenil]
    K -- Não --> M{Idade <= 39?}
    M -- Sim --> N[Adulto]
    M -- Não --> O{Idade <= 49?}
    O -- Sim --> P[Master 1]
    O -- Não --> Q{Idade <= 59?}
    Q -- Sim --> R[Master 2]
    Q -- Não --> S[Master 3]
    D --> T([Fim])
    F --> T
    H --> T
    J --> T
    L --> T
    N --> T
    P --> T
    R --> T
    S --> T 
```
