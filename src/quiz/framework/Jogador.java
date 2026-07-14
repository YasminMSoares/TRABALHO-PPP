package quiz.framework;

public class Jogador {
    private String nome;
    private String personagem; // Nome do herói ou programador histórico
    private int pontuacao;
    private int acertos;
    private int erros;

    public Jogador(String nome, String personagem) {
        this.nome = nome;
        this.personagem = personagem;
        this.pontuacao = 0;
        this.acertos = 0;
        this.erros = 0;
    }

    public String getNome() { return nome; }
    public String getPersonagem() { return personagem; }
    public int getPontuacao() { return pontuacao; }
    public int getAcertos() { return acertos; }
    public int getErros() { return erros; }

    public void setPontuacao(int pontuacao) { this.pontuacao = pontuacao; }
    public void incrementarAcertos() { this.acertos++; }
    public void incrementarErros() { this.erros++; }
}