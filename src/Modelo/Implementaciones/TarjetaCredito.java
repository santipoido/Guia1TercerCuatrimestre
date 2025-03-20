package Modelo.Implementaciones;

import java.time.LocalDate;

public class TarjetaCredito extends MetodoDePago {
    private long numeroTarjeta;
    private int codigoSeguridad;
    private int mes;
    private int anio;
    private String nombreTitular;
    private String nombreBancoTarjeta;

    public TarjetaCredito(String id, LocalDate fecha, double importe, long numeroTarjeta, int codigoSeguridad, int mes, int anio, String nombreTitular, String nombreBancoTarjeta) {
        super(id, "Tarjeta de Crédito", fecha, importe);
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.mes = mes;
        this.anio = anio;
        this.nombreTitular = nombreTitular;
        this.nombreBancoTarjeta = nombreBancoTarjeta;
    }

    public TarjetaCredito() {}

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNombreBancoTarjeta() {
        return nombreBancoTarjeta;
    }

    public void setNombreBancoTarjeta(String nombreBancoTarjeta) {
        this.nombreBancoTarjeta = nombreBancoTarjeta;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numeroTarjeta=" + numeroTarjeta +
                ", codigoSeguridad=" + codigoSeguridad +
                ", mes=" + mes +
                ", anio=" + anio +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", nombreBancoTarjeta='" + nombreBancoTarjeta + '\'' +
                '}';
    }
}
