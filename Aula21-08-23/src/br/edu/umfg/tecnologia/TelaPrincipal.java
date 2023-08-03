package br.edu.umfg.tecnologia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaPrincipal {
    static Scanner capturaDeTexto = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        long ra;
        double prova1, prova2, trabalho;

        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                      Calculo de Media                       |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| > Qual o nome do Aluno?");
        nome = capturaDeTexto.nextLine();

        try {
            System.out.println("+-------------------------------------------------------------+");
            System.out.println("| > Qual o RA do aluno?");
            ra = capturaDeTexto.nextLong();

            do {
                System.out.println("+-------------------------------------------------------------+");
                System.out.println("| > Nota de trabalho? (APENAS DE 0 a 10)");
                trabalho = capturaDeTexto.nextDouble();
            } while (trabalho < 0 || trabalho > 10);

            do {
                System.out.println("+-------------------------------------------------------------+");
                System.out.println("| > Nota da Prova 1? (APENAS DE 0 a 10)");
                prova1 = capturaDeTexto.nextDouble();
            } while (prova1 < 0 || prova1 > 10);

            do {
                System.out.println("+-------------------------------------------------------------+");
                System.out.println("| > Nota da Prova 2? (APENAS DE 0 a 10)");
                prova2 = capturaDeTexto.nextDouble();
            } while (prova2 < 0 || prova2 > 10);

            Backend backend = new Backend(nome, ra, trabalho, prova1, prova2);
            System.out.println("+-------------------------------------------------------------+");
            System.out.println(backend.toString());
            System.out.println("+-------------------------------------------------------------+");

        } catch (InputMismatchException ex) {
            System.out.println("Apenas números");
        }
    }
}
