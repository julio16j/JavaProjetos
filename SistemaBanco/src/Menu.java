import Exceptions.EntradaInvalidaException;
import Exceptions.QuantiaNegativaException;
import Exceptions.SaldoInsuficienteException;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void ExibirMenu(ContaCorrente conta) throws SaldoInsuficienteException, EntradaInvalidaException, QuantiaNegativaException {
        System.out.println("Digite a opção desejada: ");
        int opcao;
        double valor;
        System.out.println("(1)- Saque");
        System.out.println("(2)- Deposito");
        System.out.println("(3)- Extrato");
        System.out.println("(4)- Saldo");
        System.out.println("(5)- Sair");
        Scanner sc = new Scanner(System.in);


        try {
            while (true) {
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("Digite a quantia desejada para saque: ");
                    valor = sc.nextDouble();
                    System.out.println(conta.saque(valor));
                } else if (opcao == 2) {
                    System.out.println("Digite a quantia desejada para depositar: ");
                    valor = sc.nextDouble();

                    System.out.println(conta.deposito(valor));
                } else if (opcao == 3) {
                    conta.extrato();

                } else if (opcao == 4) {
                    System.out.println("O saldo atual de sua conta é: R$ " + conta.getSaldo());

                } else if (opcao == 5) {
                    System.out.println("Obrigado pela preferencia. Até a próxima.");
                    break;
                } else {
                    System.out.println("Opção Invalida \n Digite novamente: ");
                }


            }
        }


    catch (InputMismatchException e) {
        throw new EntradaInvalidaException();
    }
    }


        public static void main (String[]args ) throws SaldoInsuficienteException, EntradaInvalidaException, QuantiaNegativaException {

        ContaCorrente correntista = new ContaCorrente(2121, "Eduardo Donato", 5000 );
        ExibirMenu(correntista);

        }


    }

