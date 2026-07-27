package quiz.aplicacao.swing;

import quiz.aplicacao.PontuacaoProgramacaoStrategy;
import quiz.aplicacao.ProgramacaoPerguntasFactory;
import quiz.framework.Jogador;
import quiz.framework.JogoQuiz;
import quiz.framework.Pergunta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainSwing {

    static void main(String[] args) {
        SwingDisplay swingDisplay = new SwingDisplay();
        List<Pergunta> perguntas = ProgramacaoPerguntasFactory.criarPerguntasProgramacao();
        List<Jogador> jogadores = new ArrayList<>();
            jogadores.add(new Jogador("Carlos", "Turing"));
            jogadores.add(new Jogador("Yasmin", "Lovelace"));

        JogoQuiz jogo = new JogoQuiz(perguntas, new PontuacaoProgramacaoStrategy(),
                swingDisplay, jogadores);

        swingDisplay.setVisible(true);
        jogo.iniciar();
    }
}
