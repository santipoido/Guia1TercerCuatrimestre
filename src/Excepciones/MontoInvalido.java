package Excepciones;

public class MontoInvalido extends RuntimeException {
    public MontoInvalido() {
    }

    @Override
    public String getMessage() {
        return "El monto es invalido";
    }
}
