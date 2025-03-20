package Modelo.Implementaciones;

import java.time.LocalDate;

public class Efectivo extends MetodoDePago{
    private String moneda;

    public Efectivo(String id, LocalDate fecha, double importe, String moneda) {
        super(id, "Efectivo", fecha, importe);
        this.moneda = moneda;
    }

    public Efectivo(){}

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return super.toString() +
                "moneda='" + moneda + '\'' +
                '}';
    }
}
