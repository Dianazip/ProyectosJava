package model;

import java.sql.Timestamp;

public class IntencionCompra extends Clientes{

    private String fabricanteProducto;
    private Timestamp fechaConsulta;

    public IntencionCompra (){

    }

    public IntencionCompra(String alias, String nombres, String apellidos, String email, Long celular, String contraseña, Timestamp fechaNacimiento, String fabricanteProducto, Timestamp fechaConsulta ) {
        super(alias, nombres, apellidos, email, celular, contraseña, fechaNacimiento);
        this.fabricanteProducto = fabricanteProducto;
        this.fechaConsulta = fechaConsulta;
    }

    public IntencionCompra(String nombreFabr) {

    }

    public String getFabricanteProducto() {
        return fabricanteProducto;
    }

    public void setFabricanteProducto(String fabricanteProducto) {
        this.fabricanteProducto = fabricanteProducto;
    }

    public Timestamp getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Timestamp fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    @Override
    public String toString() {
        return "IntencionCompra{" +
                "fabricanteProducto='" + fabricanteProducto + '\'' +
                ", fechaConsulta='" + fechaConsulta + '\'' +
                "} " + super.toString();
    }
}
