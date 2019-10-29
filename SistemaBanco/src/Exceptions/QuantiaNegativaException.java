package Exceptions;

public class QuantiaNegativaException extends Exception {
    public QuantiaNegativaException (String msg){
        super(msg);
    }

    public QuantiaNegativaException() {
        super("Por gentileza, Não digite numeros negativos!");
    }
}
