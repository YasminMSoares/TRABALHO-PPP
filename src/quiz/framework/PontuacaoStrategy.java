package quiz.framework;

public interface PontuacaoStrategy {
    int calcularAcerto(int pontuacaoAtual);
    int calcularErro(int pontuacaoAtual);
    boolean deveEncerrar(int pontuacaoAtual, int totalPerguntas, int indexAtual);
}