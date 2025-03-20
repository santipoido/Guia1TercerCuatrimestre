package Excepciones;

public class Existente extends RuntimeException {
    public Existente() {
    }

    @Override
    public String getMessage() {
        return "Ya existe un pago igual";
    }
}
