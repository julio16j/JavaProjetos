package br.edu.ifpb;

public class Professor extends Empregado implements Comparable {
    private int numHoras;

    public Professor() {
        super();
    }

    public Professor(int idade, String nome, int matricula, double salario, int numHoras) {
        super(idade, nome, matricula, salario);
        this.numHoras = numHoras;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "numHoras=" + numHoras +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
