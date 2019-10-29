
import Exceptions.QuantiaNegativaException;
import Exceptions.SaldoInsuficienteException;

import java.util.ArrayList;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;
    private ArrayList <Double>ExtratoList;
    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposito(double valorDEP) throws QuantiaNegativaException {
        if (valorDEP < 0 ){
            throw new QuantiaNegativaException();
        }
        this.saldo += valorDEP;
        ExtratoList.add(this.saldo);
        return true;
    }
    public boolean saque (double valorSAQ) throws SaldoInsuficienteException, QuantiaNegativaException {
        if (valorSAQ < 0 ){
            throw new QuantiaNegativaException();
        }
        if (valorSAQ > this.saldo){
            throw new SaldoInsuficienteException();

        }
        this.saldo = saldo - valorSAQ ;
        ExtratoList.add(this.saldo);
        return true;
    }

   @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void extrato() {
        int i;
        for (i = 1; i < ExtratoList.size(); i++) {
            double resultado = ExtratoList.get(i) - ExtratoList.get(i - 1);
            if (resultado > 0) {
                System.out.println("Deposito: \n" +
                        "Valor Inicial: " + ExtratoList.get(i - 1) + "\n" +
                        "Movimentação: " + resultado + "\n" +
                        "Valor Final: " + ExtratoList.get(i));
            } else {
                System.out.println("Saque \n" +
                        "Valor Inicial: " + ExtratoList.get(i - 1) + "\n" +
                        "Movimentação: " + resultado + "\n" +
                        "Valor Final: " + ExtratoList.get(i));
            }

        }

    }

    public ContaCorrente(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.ExtratoList = new ArrayList<Double>();
        this.ExtratoList.add(this.saldo);


    }

    public ContaCorrente() { //Contrutor que nao tenha parametro, colocamos atributos padroes as variaveis, conforme abaixo
        this.titular = "Nome Invalido";
        this.numero= 0;
        this.saldo= 0.00;
        this.ExtratoList = new ArrayList<Double>();
    }
}
