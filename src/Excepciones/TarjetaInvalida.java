package Excepciones;

public class TarjetaInvalida extends RuntimeException {
    public TarjetaInvalida() {
    }

    @Override
    public String getMessage() {
        return "La tarjeta es inválida, verifique el la longitud del número, su CVV o si está expirada";
    }
}
