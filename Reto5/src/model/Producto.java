package model;
// para semejar el modelo de la base de datos
public class Producto extends Proveedores {

    protected String tipoProducto;
    protected int precioUnitario;
    protected int añoConstruction;
    protected String autonomiaBateria;
    protected String proveedorMotor;

    public Producto(){

    }

    public Producto(int idProveedores, String nombre, String direccion, Long telefono, String tipoProducto, int precioUnitario, int añoConstruccion, String autonomiaBateria, String proveedorMotor) {
        super(idProveedores, nombre, direccion, telefono);
        this.tipoProducto = tipoProducto;
        this.precioUnitario = precioUnitario;
        this.añoConstruction = añoConstruccion;
        this.autonomiaBateria = autonomiaBateria;
        this.proveedorMotor = proveedorMotor;
    }

    public Producto(String nombre) {

    }

    public Producto(String nombre, int precio, int año) {


    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getAñoConstruccion() {
        return añoConstruction;
    }

    public void setAñoConstruccion(int añoConstruccion) {
        this.añoConstruction = añoConstruccion;
    }

    public String getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(String autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public String getProveedorMotor() {
        return proveedorMotor;
    }

    public void setProveedorMotor(String proveedorMotor) {
        this.proveedorMotor = proveedorMotor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tipoProducto='" + tipoProducto + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", añoConstruccion=" + añoConstruction +
                ", autonomiaBateria='" + autonomiaBateria + '\'' +
                ", proveedorMotor='" + proveedorMotor + '\'' +
                "} " + super.toString();
    }
}
