import Modelo.Implementaciones.Efectivo;
import Modelo.Implementaciones.Paypal;
import Modelo.Implementaciones.TarjetaCredito;
import Repositorio.Implementaciones.RepositorioPagos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RepositorioPagos rp = new RepositorioPagos<>("PagoFacil");
        TarjetaCredito tc = new TarjetaCredito("CD123", LocalDate.now(), 20000,11111111, 333, 12, 28, "Santiago", "Banco Nacion"); //modificar el tipo de dato para poder ingresar el número de tarjeta
        Efectivo ef = new Efectivo("EF333", LocalDate.now(), 100000, "Pesos Argentinos");
        Paypal pp = new Paypal("PP223", LocalDate.now(), 150000, "test2005@gmail.com");
        System.out.println(rp.agregar(tc));
        System.out.println(rp.agregar(ef));
        System.out.println(rp.agregar(pp));
        System.out.println(rp.buscarPorId("CD123"));
        System.out.println(rp.buscarPorId("EF333"));
        System.out.println(rp.buscarPorId("PP223"));
        System.out.println(rp.buscarPorId("ERROR"));
        System.out.println(rp.listar());
    }
}