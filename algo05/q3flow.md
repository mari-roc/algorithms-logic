# Q3 Flowchart

Construa um programa em Java e seu respectivo fluxograma para o seguinte problema: Informada a pressão arterial sistólica do paciente e duas medições de temperatura (t1 e t2). Primeiro, identifique se a pressão arterial sistólica é maior que 180 (crise hipertensiva); caso verdadeiro, mostre: "Encaminhamento Imediato para Emergência". Caso negativo, calcule a média das temperaturas t1 e t2 e verifique se a média é menor que 37.5°C; caso afirmativo, mostre: "Paciente Liberado / Triagem Verde". Caso negativo (indicando febre), colete a medição da frequência cardíaca do paciente e calcule a média combinada dos três indicadores clínicos. Verifique se essa nova média passa do limite de alerta estabelecido; caso afirmativo, mostre: "Paciente em Observação"; caso negativo, mostre: "Paciente Medicado e Liberado".

## Triagem de paciente

```mermaid
graph LR
    A([Inicio]) --> B[p, t1, t2, t3, media]
    B --> C[/p/]
    C --> D[/t1/]
    D --> E[/t2/]
    E --> F{"p>180?"}
    F -- Sim --> G["Encaminhamento Imediato para Emergência"]
    F -- Não --> H["media=(t1 + t2)/2"]
    H --> I{"media<=37.5?"}
    I -- Não --> J[/t3/]
    J -- Sim --> K["Paciente Liberado / Triagem Verde"]
    K --> O["media=(t1+t2+t3)/3"]
    O --> L{"media<=37.5?"}
    L -- Não --> M["Paciente em Observação"]
    L -- Sim --> N["Paciente Medicado e Liberado"]
    G --> Q([Fim])
    K --> Q([Fim])
    M --> Q([Fim])
    N --> Q([Fim])
    
```