package ar.edu.undec.computadoras.core.exception;

@SuppressWarnings("serial")
public class ComputadoraExisteException extends Exception {
    public ComputadoraExisteException(String msg){
        super(msg);
    }
}
