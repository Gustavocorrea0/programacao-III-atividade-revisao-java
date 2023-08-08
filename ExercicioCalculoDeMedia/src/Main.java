import br.edu.umfg.tecnologia.Aluno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final String NOTA_PRIMEIRA_PROVA = "nota primeira prova";
    private static final String NOTA_SEGUNDA_PROVA = "nota segunda prova";
    private static final String NOTA_TRABALHO = "nota trabalho prova";

    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno(getRa(), getNome(), getNota(NOTA_PRIMEIRA_PROVA), getNota(NOTA_SEGUNDA_PROVA), getNota(NOTA_TRABALHO));
            System.out.println("RESULTADO");
            System.out.println(aluno.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static double getNota(String mensagem) throws IOException {
        System.out.println("Digite a " + mensagem);
        return Double.parseDouble(reader.readLine());
    }

    private static String getNome() throws IOException {
        System.out.println("Digite seu nome: ");
        return reader.readLine();
    }

    private static int getRa() throws IOException {
        System.out.println("Digite seu Registro acadêmico: ");
        return Integer.parseInt(reader.readLine());
    }

}
