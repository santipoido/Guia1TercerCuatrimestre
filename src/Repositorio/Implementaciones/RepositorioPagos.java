package Repositorio.Implementaciones;

import Excepciones.Existente;
import Excepciones.MontoInvalido;
import Excepciones.TarjetaInvalida;
import Modelo.Implementaciones.TarjetaCredito;
import Modelo.Interfaces.Media;
import Repositorio.Interfaces.RepositorioInterfaz;

import java.time.LocalDate;
import java.util.HashMap;

public class RepositorioPagos <T extends Media> implements RepositorioInterfaz<T> {

    private String nombreSistemaPagos;
    private HashMap<String, T> listaPagos;


    public RepositorioPagos(String nombreSistemaPagos) {
        this.nombreSistemaPagos = nombreSistemaPagos;
        listaPagos = new HashMap<>();
    }

    public int buscarPorId(String id){
        if (listaPagos.containsKey(id)){
            return listaPagos.get(id).hashCode();
        }
        return -1;
    }

    @Override
    public boolean agregar(T t) {
        if (t.getImporte() <= 0){
            throw new MontoInvalido();
        }

        if (t instanceof TarjetaCredito){
            if (!verificarTarjetaCredito((TarjetaCredito) t)){
                throw new TarjetaInvalida();
            }
        }

        int existe = buscarPorId(t.getId());
        if (existe == -1){
            listaPagos.put(t.getId(), t);
            return true;
        }
        throw new Existente();
    }

    @Override
    public boolean eliminar(T t) {
        int existe = buscarPorId(t.getId());
        if (existe != -1){
            listaPagos.remove(t.getId());
            return true;
        }
        return false;
    }

    @Override
    public String listar() {
        StringBuilder sb = new StringBuilder();
        for (T t : listaPagos.values()){
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }

    public boolean verificarTarjetaCredito(TarjetaCredito tc){
        String numTarjeta = Long.toString(tc.getNumeroTarjeta());
        String cvv = Integer.toString(tc.getCodigoSeguridad());
        int mesActual = LocalDate.now().getMonthValue();
        int anioActual = LocalDate.now().getYear();
        if (numTarjeta.length() != 16){
            return false;
        }else if (cvv.length() != 3){
            return false;
        }else if (tc.getAnio() < anioActual){
            return false;
        }
        return true;
    }
}
