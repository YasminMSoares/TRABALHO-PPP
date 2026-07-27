package quiz.aplicacao;

import java.util.*;
import quiz.framework.Pergunta;

public class ProgramacaoPerguntasFactory {

    public static List<Pergunta> criarPerguntasProgramacao(){
        List<Pergunta> lista = new ArrayList<>();

        lista.add(new Pergunta(
                "Quando programamos, variáveis são utilizadas para: ",
                Arrays.asList("Armazenar dados que podem ser usados e alterados durante a execução do programa", "Chamar funcões de bibliotecas.",
                              "Representar exclusivamente operações matemáticas", "Representar valores constantes."), 0));
        lista.add(new Pergunta(
                "Qual das alternativas é uma linguagem de programação? ",
                Arrays.asList("PostgreSQL", "HTML",
                              "Rust", "Springboot"), 2));
        lista.add(new Pergunta(
                "O que é um algoritmo? ",
                Arrays.asList("Uma sequência infinita de instruções utilizada para solucionar um problema", "A execução paralela de dois ou mais programas",
                              "Uma estrutura de dados", "Uma sequência finita de instruções utilizadas para solucionar um problema"), 3));
        lista.add(new Pergunta(
                "O que significa a sigla HTTP?",
                Arrays.asList("HyperText Transfer Protocol", "High Transfer Text Program",
                              "Hyperlink Text Processing Tool", "High Troublesome Text Program"), 0));
        lista.add(new Pergunta(
                "O que é criptografia? ",
                Arrays.asList("Um método para otimizar a comunicação entre dispositivos", "O estudo das linguagens de programação",
                              "Um método de proteger dados sensíveis por meio da codificação", "Uma maneira de formatar computadores"), 2));
        lista.add(new Pergunta(
                "O que significa a sigla RSA?",
                Arrays.asList("Linguagens Formais e Autômatos", "Rede-Segurança-Auditoria",
                              "Rivest-Shamir-Adleman", "Random Secure Access"), 2));
        lista.add(new Pergunta(
                "O que utilizamos no Java para representar uma condição de igualdade?",
                Arrays.asList("=", ">=",
                              "!=", "=="), 3));
        lista.add(new Pergunta(
                "O que é um banco de dados?",
                Arrays.asList("Um conjunto organizado de dados que pode ser consultado, armazenado e gerenciado.", "Qualquer estrutura como grafos, listas e árvores.",
                              "Um local utilizado para o gerenciamento de servidores", "Um tipo de hardware"), 0));
        lista.add(new Pergunta(
                "No SQL, o que devemos utilizar para especificar as tabelas que serão utilizadas na consulta? ",
                Arrays.asList("SELECT", "HAVING",
                              "FROM", "GROUP BY"), 2));
        lista.add(new Pergunta(
                "O que é um impasse?",
                Arrays.asList("Situação onde dois ou mais programas esperam pelo mesmo recurso.", "Situação onde todos os programas conseguem ser executados",
                              "O desligamento automático do computador por motivos de segurança", "Um tipo de ciberataque"), 0));


        return lista;
    }
}
