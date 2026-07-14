package quiz.aplicacao.console;

import java.util.ArrayList;
import java.util.List;
import quiz.aplicacao.MarvelPerguntasFactory;
import quiz.aplicacao.PontuacaoManoplaStrategy;
import quiz.framework.JogoQuiz;
import quiz.framework.Pergunta;
import quiz.framework.Jogador;

public class MainConsole {
    public static void main(String[] args) {
        List<Pergunta> perguntas = MarvelPerguntasFactory.criarPerguntasMarvel();
        PontuacaoManoplaStrategy estrategia = new PontuacaoManoplaStrategy();
        ConsoleDisplay display = new ConsoleDisplay();

        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Yasmin", "Homem de Ferro"));
        jogadores.add(new Jogador("Fabiola", "Thor"));

        JogoQuiz jogo = new JogoQuiz(perguntas, estrategia, display, jogadores);
        jogo.iniciar();
    }
}