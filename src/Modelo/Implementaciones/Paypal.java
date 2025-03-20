package Modelo.Implementaciones;

import java.time.LocalDate;

public class Paypal extends MetodoDePago{
    private String gmailUsuario;

    public Paypal(String id, LocalDate fecha, double importe, String gmailUsuario) {
        super(id, "Paypal", fecha, importe);
        this.gmailUsuario = gmailUsuario;
    }

    public Paypal(){}

    public String getGmailUsuario() {
        return gmailUsuario;
    }

    public void setGmailUsuario(String gmailUsuario) {
        this.gmailUsuario = gmailUsuario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "gmailUsuario='" + gmailUsuario + '\'' +
                '}';
    }
}
