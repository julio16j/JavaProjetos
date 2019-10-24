package br.edu.ifpb;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Menu {
    public TreeSet<Professor> ListaP;
    public Menu(TreeSet<Professor> ListaP  ) {
        this.ListaP = new TreeSet<>();
        this.ListaP = ListaP;
    }
    public void ExibirMenu(){
        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        String dados;
        String[] funcionario = new String[5];
        System.out.println("Bem vindo ao quadro de novos funcionários das indústrias Stark");
        while (true){
            System.out.println("Esolha a próxima opção");
            System.out.println("Prima 1 para Cadastrar novos funcionários");
            System.out.println("Prima 2 para Remover funcionarios");
            System.out.println("Prima 3 para Atualizar os funcionarios");
            System.out.println("Prima 4 para Imprimir todos os funcionários");
            entrada = scanner.nextInt();
            if (entrada == 1){
                System.out.println("Prima os dados do novo funcionário espaçados com apenas 1 espaço");
                dados = scanner.next();
                funcionario = dados.split(" ");
                Universidade.CadastraFunc(funcionario);
            }
            else if (entrada == 2){
                System.out.println("Prima a matrícula do funcionário que queres demitir");
                entrada = scanner.nextInt();
                Universidade.RemoveFunc(entrada);
            }else if (entrada == 3){
                System.out.println("Prima a matrícula que deseja-se a alteração");
                entrada = scanner.nextInt();
                System.out.println("Prima os dados a serem atualizados espaçados com apenas 1 espaço");
                dados = scanner.next();
                funcionario = dados.split(" ");
                Universidade.AtualizaFunc(funcionario);
            }else if (entrada == 4){
                System.out.println("");
            }else if (entrada == 5){
                break;
            }

        }
    }

}