package quiz.aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import quiz.framework.Pergunta;

public class MarvelPerguntasFactory {
    public static List<Pergunta> criarPerguntasMarvel() {
        List<Pergunta> lista = new ArrayList<>();

        lista.add(new Pergunta(
                "Qual é o nome real do Homem de Ferro?",
                Arrays.asList("Steve Rogers", "Tony Stark", "Bruce Banner", "Peter Parker"),
                1
        ));

        lista.add(new Pergunta(
                "De que país o herói Pantera Negra é rei?",
                Arrays.asList("Zamunda", "Genosha", "Wakanda", "Latveria"),
                2
        ));

        lista.add(new Pergunta(
                "Quem é a inteligência artificial criada por Tony Stark que substitui o J.A.R.V.I.S. a partir de Vingadores: Era de Ultron?",
                Arrays.asList("E.D.I.T.H.", "S.U.E.", "SEXTA-FEIRA", "J.O.C.A.S.T.A."),
                2
        ));

        lista.add(new Pergunta(
                "Nos cinemas, antes de se tornar o vilão Mysterio em Homem-Aranha: Longe de Casa, qual era a verdadeira profissão de Quentin Beck?",
                Arrays.asList("Cientista da Oscorp", "Ex-funcionário das Indústrias Stark, especialista em hologramas", "Ilusionista de circo aposentado", "Engenheiro mecânico que trabalhava com o Abutre"),
                1
        ));

        lista.add(new Pergunta(
                "Nos quadrinhos, qual é o nome do metal fictício que reveste todo o esqueleto do Wolverine?",
                Arrays.asList("Vibranium", "Adamantium", "Carbonadium", "Uru"),
                1
        ));

        lista.add(new Pergunta(
                "No filme Vingadores: Guerra Infinita, Thanos sacrifica sua filha Gamora em qual planeta para obter a Joia da Alma?",
                Arrays.asList("Vormir", "Nidavellir", "Titan", "Morag"),
                0
        ));

        lista.add(new Pergunta(
                "Nas histórias em quadrinhos, qual herói foi o primeiro líder e fundador oficial da equipe dos vingadores?",
                Arrays.asList("Capitão América", "Homem de Ferro", "Thor", "Homem-Formiga"),
                3
        ));

        lista.add(new Pergunta(
                "Qual frase clássica dita pelo Tio Ben moldou o caráter do Homem-Aranha?",
                Arrays.asList("O crime não compensa", "Com grandes poderes vêm grandes responsabilidades", "A justiça tarde, mas não falha", "Sempre proteja os mais fracos"),
                1
        ));

        lista.add(new Pergunta(
                "Qual é o nome do instituto fundado pelo Professor Charles Xavier que serve de base e escola para os X-Men?",
                Arrays.asList("Academia de Elite de Nova York", "Instituto Xavier para Jovens Superdotados", "Escola Mutante de Genosha", "Santuário dos Prodígios"),
                1
        ));

        lista.add(new Pergunta(
                "Qual poderosa e destrutiva entidade cósmica se funde com Jean Grey, originando uma das sagas mais famosas dos X-Men?",
                Arrays.asList("Galactus", "Força Enigma", "Força Fênix", "Eternidade"),
                2
        ));

        return lista;
    }
}