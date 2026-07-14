package quiz.framework;

import java.util.List;

public class Pergunta {
    private String enunciado;
    private List<String> alternativas;
    private int alternativaCorreta;

    public Pergunta(String enunciado, List<String> alternativas, int alternativaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    public String getEnunciado() { return enunciado; }
    public List<String> getAlternativas() { return alternativas; }
    public int getAlternativaCorreta() { return alternativaCorreta; }
}