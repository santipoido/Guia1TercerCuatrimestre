package Repositorio.Interfaces;

public interface RepositorioInterfaz <T>{
    boolean agregar(T t);
    boolean eliminar(T t);
    String listar();
}
