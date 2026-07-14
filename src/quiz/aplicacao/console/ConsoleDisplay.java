package quiz.aplicacao.console;

import java.util.Scanner;
import quiz.framework.Pergunta;
import quiz.framework.QuizDisplay;
import quiz.framework.Jogador;

public class ConsoleDisplay implements QuizDisplay {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void exibirPergunta(Pergunta pergunta, int numeroAtual, Jogador jogador) {
        System.out.println("\n=================================================================");
        System.out.println("   TURNO DO VINGADOR: " + jogador.getPersonagem().toUpperCase());
        System.out.println("   Jogador: " + jogador.getNome());
        System.out.println("   Energia Cósmica Atual: " + jogador.getPontuacao() + " pts");
        System.out.println("=================================================================");
        System.out.println("Questão " + numeroAtual + ": " + pergunta.getEnunciado() + "\n");

        // Exibe as alternativas
        for (int i = 0; i < pergunta.getAlternativas().size(); i++) {
            System.out.println("  [" + i + "] " + pergunta.getAlternativas().get(i));
        }
    }

    @Override
    public int obterRespostaUsuario(Pergunta pergunta) {
        int resposta = -1;
        int totalAlternativas = pergunta.getAlternativas().size();

        // Loop de validação para garantir que o usuário digite uma opção válida
        while (resposta < 0 || resposta >= totalAlternativas) {
            System.out.print("\n Escolha sua alternativa: ");
            if (scanner.hasNextInt()) {
                resposta = scanner.nextInt();
                if (resposta < 0 || resposta >= totalAlternativas) {
                    System.out.println(" Opção inválida! Escolha um número entre 0 e " + (totalAlternativas - 1) + ".");
                }
            } else {
                System.out.println(" Entrada inválida! Digite apenas números.");
                scanner.next(); // faz a limpeza do buffer no scanner
            }
        }
        return resposta;
    }

    @Override
    public void exibirFeedbackResposta(boolean acertou, int novaPontuacao, Jogador jogador) {
        System.out.println("\n-----------------------------------------------------------------");
        if (acertou) {
            System.out.println(" CORRETO! O Vingador " + jogador.getPersonagem() + " desferiu um golpe certeiro!");
        } else {
            System.out.println(" ERROU! Thanos usou a Manopla e rebateu o ataque com um estalo!");
        }
        System.out.println(" Nova Energia Cósmica de " + jogador.getNome() + ": " + novaPontuacao + " pts");
        System.out.println("-----------------------------------------------------------------");

        // efeitinho dramático
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void exibirResultadoFinal(Jogador jogador) {
        System.out.println("\n=================================================================");
        System.out.println("              PLACAR BATALHA FINAL: " + jogador.getPersonagem().toUpperCase());
        System.out.println("=================================================================");
        System.out.println("  • Codinome Real: " + jogador.getNome());
        System.out.println("  • Ataques Assertivos (Acertos): " + jogador.getAcertos());
        System.out.println("  • Danos Sofridos (Erros): " + jogador.getErros());
        System.out.println("  • Energia Cósmica Acumulada: " + jogador.getPontuacao() + " pontos");
        System.out.println("=================================================================");
    }
}