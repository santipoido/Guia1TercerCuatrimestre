package Modelo.Implementaciones;

import java.time.LocalDate;

public class Criptomoneda extends MetodoDePago{
    private String criptomoneda;
    private String walletId;

    public Criptomoneda(String id, LocalDate fecha, double importe, String criptomoneda, String walletId) {
        super(id, "Criptomoneda", fecha, importe);
        this.criptomoneda = criptomoneda;
        this.walletId = walletId;
    }

    public Criptomoneda(){}

    public String getCriptomoneda() {
        return criptomoneda;
    }

    public void setCriptomoneda(String criptomoneda) {
        this.criptomoneda = criptomoneda;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "criptomoneda='" + criptomoneda + '\'' +
                ", walletId='" + walletId + '\'' +
                '}';
    }
}
