package br.edu.ifpb;


import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Universidade
{
    private static TreeSet<Professor> professors;
    public static void main( String[] args )
    {
        professors = new TreeSet<>();
        Menu menu = new Menu(professors);
        menu.ExibirMenu();
    }

    @Override
    public String toString() {
        return "Universidade{}";
    }

    public static void CadastraFunc(String[] funcionario){
        int idade = Integer.parseInt(funcionario[0]);
        String nome = funcionario[1];
        int matricula = Integer.parseInt(funcionario[2]);
        double salario = Double.parseDouble(funcionario[3]);
        int numHoras = Integer.parseInt(funcionario[4]);
        Professor novo = new Professor(idade, nome, matricula, salario, numHoras);
        System.out.println(novo.toString());
    }
    public static void RemoveFunc(int matricula){

    }
    public static void AtualizaFunc(String[] funcionario){

    }

}
