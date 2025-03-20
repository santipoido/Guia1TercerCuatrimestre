package Modelo.Implementaciones;

import Modelo.Interfaces.Media;

import java.time.LocalDate;

public abstract class MetodoDePago implements Media {
    private String id;
    private String nombre;
    private LocalDate fecha;
    private double importe;

    public MetodoDePago(String id, String nombre, LocalDate fecha, double importe) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.importe = importe;
    }

    public MetodoDePago(){}

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public LocalDate getFecha() {
        return this.fecha;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public double getImporte() {
        return this.importe;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "MetodoDePago{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha.toString() +
                ", importe=" + importe +
                '}';
    }
}
