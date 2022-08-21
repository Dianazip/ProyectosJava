package model;

import java.util.List;

public interface InterfaceDAO<T> {

    int insertar(T x);
    int actualizar(T x);
    int eliminar(T x);
    List<String> listar();
    List<String> listar2();
    List<String> listar3();
    List<Integer> listar4();
    List<String> listar5();

}
