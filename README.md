# Framework de Quiz Genérico (Orientado a Objetos)

Este projeto consiste em um **framework genérico e extensível orientado a objetos para jogos do tipo *Quiz***, desenvolvido para a disciplina de **Princípios e Padrões de Projetos (PPP)** da Universidade Federal de Uberlândia (UFU).

O objetivo principal da arquitetura é fornecer toda a infraestrutura e o controle de fluxo genéricos de um jogo de perguntas e respostas sem depender de implementações concretas de interface gráfica ou regras específicas de domínio, promovendo alta coesão, baixo acoplamento e reusabilidade de código.

---

## Integrantes do Projeto

* Carlos Eduardo Rabelo Rodrigues Pelet
* Yasmin Moreira Soares

---

## Arquitetura e Organização do Projeto

O projeto é estritamente dividido em dois módulos conceituais:

1. **Núcleo do Framework (`quiz.framework`)**: Contém os componentes abstratos, modelos de dados, controladores do fluxo do jogo e interfaces de abstração (exibições e estratégias). Não possui nenhuma dependência de bibliotecas de interface visual (como Java Swing) ou de entradas específicas do console.
2. **Aplicações Clientes (`quiz.aplicacao`)**: Implementações concretas de jogos e interfaces que estendem e utilizam a estrutura fornecida pelo framework.

### Estrutura de Diretórios e Arquivos

```text
src/
└── quiz/
    ├── framework/                       # NÚCLEO DO FRAMEWORK (GENÉRICO)
    │   ├── Jogador.java                 # Entidade que representa o jogador
    │   ├── JogoQuiz.java                # Controlador e fluxo principal do jogo
    │   ├── Pergunta.java                # Modelo para perguntas e alternativas
    │   ├── PontuacaoStrategy.java       # Interface para políticas de pontuação
    │   ├── QuizDisplay.java             # Interface/abstração da camada de exibição
    │   └── QuizObserver.java            # Interface Observer para notificações do jogo
    │
    └── aplicacao/                       # APLICAÇÕES CONCRETAS
        ├── MarvelPerguntasFactory.java   # Fábrica de perguntas do Quiz da Marvel
        ├── ProgramacaoPerguntasFactory.java # Fábrica de perguntas de Programação
        ├── PontuacaoManoplaStrategy.java # Estratégia de pontuação temática (Marvel)
        ├── PontuacaoProgramacaoStrategy.java # Estratégia de pontuação de Programação
        │
        ├── console/                     # Aplicação 1: Quiz em modo Console
        │   ├── ConsoleDisplay.java      # Implementação do display via Terminal
        │   └── MainConsole.java         # Ponto de entrada do Quiz em Console
        │
        └── swing/                       # Aplicação 2: Quiz com Interface Gráfica
            ├── SwingDisplay.java        # Implementação do display via Java Swing
            └── MainSwing.java           # Ponto de entrada do Quiz Swing
