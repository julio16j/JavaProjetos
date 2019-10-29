package Exceptions;

public class EntradaInvalidaException extends Exception{
    public EntradaInvalidaException (String msg){
        super(msg);
    }

    public EntradaInvalidaException() {
        super("Por gentileza, digite apenas numeros.");

    }

}
