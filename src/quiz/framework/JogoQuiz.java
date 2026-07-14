package quiz.framework;

import java.util.ArrayList;
import java.util.List;

public class JogoQuiz {
    private List<Pergunta> perguntas;
    private PontuacaoStrategy estrategia;
    private QuizDisplay display;
    private List<Jogador> jogadores;
    private List<QuizObserver> observers = new ArrayList<>();

    public JogoQuiz(List<Pergunta> perguntas, PontuacaoStrategy estrategia, QuizDisplay display, List<Jogador> jogadores) {
        this.perguntas = perguntas;
        this.estrategia = estrategia;
        this.display = display;
        this.jogadores = jogadores;
    }

    public void registrarObserver(QuizObserver observer) {
        this.observers.add(observer);
    }

    private void notificarMudanca(Jogador j) {
        for (QuizObserver obs : observers) {
            obs.jogadorPontuou(j);
        }
    }

    public final void iniciar() {
        int indexPerg = 0;

        while (indexPerg < perguntas.size()) {
            Pergunta pergunta = perguntas.get(indexPerg);

            for (Jogador jogador : jogadores) {
                if (estrategia.deveEncerrar(jogador.getPontuacao(), perguntas.size(), indexPerg)) {
                    continue;
                }

                display.exibirPergunta(pergunta, indexPerg + 1, jogador);
                int resposta = display.obterRespostaUsuario(pergunta);

                // faz a verificação se o jogador acertou a questão
                boolean acertou = (resposta == pergunta.getAlternativaCorreta());

                if (acertou) {
                    jogador.incrementarAcertos();
                    jogador.setPontuacao(estrategia.calcularAcerto(jogador.getPontuacao()));
                } else {
                    jogador.incrementarErros();
                    jogador.setPontuacao(estrategia.calcularErro(jogador.getPontuacao()));
                }

                // faz o feedback para o jogador
                display.exibirFeedbackResposta(acertou, jogador.getPontuacao(), jogador);

                notificarMudanca(jogador);
            }
            indexPerg++;
        }

        for (Jogador jogador : jogadores) {
            display.exibirResultadoFinal(jogador);
        }
    }
}