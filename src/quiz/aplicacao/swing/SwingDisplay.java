package quiz.aplicacao.swing;

import quiz.framework.Jogador;
import quiz.framework.Pergunta;
import quiz.framework.QuizDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class SwingDisplay extends JFrame implements QuizDisplay {

    private JLabel enunciadoQuestao;
    private JLabel alternativasQuestao;
    private JLabel infoJogador;
    private JButton resposta;
    private JRadioButton[] radios;
    private ButtonGroup grupo;

    private int escolhaUsuario = -1;
    private CountDownLatch travaEspera;

    public SwingDisplay(){
        setTitle("* QUIZ DE PROGRAMAÇÃO *");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        infoJogador = new JLabel("JOGADOR: ");
        enunciadoQuestao = new JLabel("ENUNCIADO DA QUESTÃO: ");
        alternativasQuestao = new JLabel("ALTERNATIVA: ");

        JPanel cabecalho = new JPanel(new GridLayout(4 , 1));
        cabecalho.add(infoJogador);
        cabecalho.add(enunciadoQuestao);
        cabecalho.add(alternativasQuestao);
        add(cabecalho, BorderLayout.NORTH);

        JPanel conteudo = new JPanel(new GridLayout(5, 1));
        radios = new JRadioButton[4];
        grupo = new ButtonGroup();

        for(int i = 0; i < 4; i++){
            radios[i] = new JRadioButton();
            grupo.add(radios[i]);
            conteudo.add(radios[i]);
        }

        resposta = new JButton("Confirmar Resposta");
        resposta.addActionListener(e -> {
            for (int i = 0; i < 4; i++) {
                if (radios[i].isSelected()) {
                    escolhaUsuario = i;

                    // libera a trava aq
                    if (travaEspera != null) {
                        travaEspera.countDown();
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma alternativa antes de confirmar!", "Aviso", JOptionPane.WARNING_MESSAGE);
        });

        conteudo.add(resposta);
        add(conteudo, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void exibirPergunta(Pergunta pergunta, int numeroAtual, Jogador jogador){
        infoJogador.setText("Jogador: " + jogador.getPersonagem() + " [" +  jogador.getNome()  + "]");
        enunciadoQuestao.setText("Questão " + numeroAtual + " " + pergunta.getEnunciado());

        grupo.clearSelection();

        List<String> alternativas = pergunta.getAlternativas();
        for(int i = 0; i < radios.length; i++){
            radios[i].setText(alternativas.get(i));
        }
    }

    @Override
    public int obterRespostaUsuario(Pergunta pergunta){
        escolhaUsuario = -1;
        travaEspera = new CountDownLatch(1);

        try {
            travaEspera.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return escolhaUsuario;
    }

    @Override
    public void exibirFeedbackResposta(boolean acertou, int novaPontuacao, Jogador jogador){
        String msg;
        if(acertou)
            msg = "CORRETO! Você ganhou 100 PONTOS. :D\n";
        else
            msg = "INCORRETO! Você perdeu 100 PONTOS. :c\n";

        msg += "JOGADOR: " + jogador.getPersonagem() + " [" + jogador.getNome() + "]\n";
        msg += "PONTUAÇÃO ATUAL: " + novaPontuacao;

        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public void exibirResultadoFinal(Jogador jogador){
        String fimMsg = "FIM DO QUIZ DE PROGRAMAÇÃO!\n";
        fimMsg += "Jogador: " +  jogador.getNome() + "\n";
        fimMsg += "Acertos: " +  jogador.getAcertos() + "\n";
        fimMsg += "Pontuação final: " +  jogador.getPontuacao();

        JOptionPane.showMessageDialog(this, fimMsg);
    }
}
