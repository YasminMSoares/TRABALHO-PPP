package quiz.framework;

public interface QuizDisplay {
    void exibirPergunta(Pergunta pergunta, int numeroAtual, Jogador jogador);
    int obterRespostaUsuario(Pergunta pergunta);

    void exibirFeedbackResposta(boolean acertou, int novaPontuacao, Jogador jogador);

    void exibirResultadoFinal(Jogador jogador);
}