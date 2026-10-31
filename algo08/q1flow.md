# Q1 Flowchart

Maior, Menor e Média Crie um programa em Java que leia um vetor de 10 números inteiros fornecidos pelo usuário. Em seguida, o programa deve calcular e exibir:

O maior valor armazenado no vetor.

O menor valor armazenado no vetor.

A média aritmética dos elementos do vetor.

## Maior, menor e mádia de um vetor.

```mermaid
graph LR
        A([Início]) --> B[/Digite 10 valores inteiros para o vetor/]
        B --> C[/vetor/]
        C --> D[maior, menor, media]
        
        
        D --> E[i=0]
        F --> G[maior=vetor[i]]
        G --> H[media=vetor[i]]
        H --> I[menor=vetor[i]]

        I --> J{Se vetor[i] < menor}
        J -- Sim -->K[menor = vetor[i]]

        J -- Não --> L{Se vetor[i] > maior}
        L -- Sim --> M[maior = vetor[i]]

        L -- Não --> N[media = (media + vetor[i])/i]
        N --> O[++i]
        
        O --> P{i <= 10?}
        P -- Sim --> J
        P
    

        E -- Sim --> F[res = num * mult]
        F --> G[mult = mult -1]
        G --> H[/res/]
        H --> E

        E -- Não --> I[/Tabuada finalizada/]
        I --> J([Fim])
```