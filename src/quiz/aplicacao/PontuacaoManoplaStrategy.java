package quiz.aplicacao;

import quiz.framework.PontuacaoStrategy;

public class PontuacaoManoplaStrategy implements PontuacaoStrategy {
    @Override
    public int calcularAcerto(int pontuacaoAtual) { return pontuacaoAtual + 100; }

    @Override
    public int calcularErro(int pontuacaoAtual) { return pontuacaoAtual / 2; } // Estalo do Thanos!

    @Override
    public boolean deveEncerrar(int pontuacaoAtual, int totalPerguntas, int indexAtual) {
        return indexAtual >= totalPerguntas;
    }
}