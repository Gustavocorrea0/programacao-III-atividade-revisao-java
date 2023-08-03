package br.edu.umfg.tecnologia;

public class Backend {
    private String nome;
    private long ra;
    private double prova1, prova2, trabalho;
    private double total;
    private String estadoDoAluno;
    public Backend(String nome, long ra, double prova1, double prova2, double trabalho) {
        this.nome = nome;
        this.ra = ra;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    private void media(){
        prova1 = prova1 * 0.35;
        prova2 = prova2 * 0.35;
        trabalho = trabalho * 0.3;
        total = prova1 + prova2 + trabalho;
    }

    private void situacao(){
        media();
        if (total >= 7.0){
            estadoDoAluno = "APROVADO";
        } else if (total < 7.0) {
            estadoDoAluno = "REPROVADO";
        }
    }

    @Override
    public String toString(){
        situacao();
        return "| Ra: " + ra + " | Nome: " + nome + " | Media: " + total + " | Situacao: " + estadoDoAluno;
    }
}
