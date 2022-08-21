package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImplements extends Conexion implements InterfaceDAO<Producto> {
    @Override
    public int insertar(Producto x) {
        PreparedStatement ps;
        String sql = "INSERT INTO productos(Nombre_fabricante,Tipo_producto, Precio_unitario, Año_construccion, Autonomia_bateria, Proveedor_motor) VALUES (?,?,?,?,?,?)";
        try {
            Conectar();
            System.out.println("conexion OK");
            ps = conexion.prepareStatement(sql);
            ps.setString(1, x.getNombre());
            ps.setString(2, x.getTipoProducto());
            ps.setInt(3, x.getPrecioUnitario());
            ps.setInt(4, x.getAñoConstruccion());
            ps.setString(5, x.getAutonomiaBateria());
            ps.setString(6, x.getProveedorMotor());
            int contador = ps.executeUpdate();
            if (contador > 0){
                System.out.println("Se Agrego el registro de manera exitosa");
                return 1;
            }
            else{
                System.out.println("No se agrego el registro");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Cerrar();
            return 0;
        }
        return 0;
    }

    @Override
    public int actualizar(Producto x) {
        PreparedStatement ps;
        String sql = "UPDATE productos SET Año_construccion = ? WHERE Nombre_fabricante = ?";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, x.getAñoConstruccion());
            ps.setString(2, x.getNombre());
            int contador = ps.executeUpdate();
            if (contador > 0) {
                System.out.println("Se Actualizo el registro de manera exitosa");
                return 1;
            } else {
                System.out.println("Ocurrio un problema al actualizar el registro");
            }
        } catch (SQLException e) {
            System.out.println("Problema al modificar la información");
            Cerrar();
            return 0;
        }
        return 0;

    }

    @Override
    public int eliminar(Producto x) {
        return 0;
    }

    @Override
    public List<String> listar() {
        return null;
    }

    @Override
    public List<String> listar2() {
        PreparedStatement ps;
        ResultSet rs = null;
        ArrayList<String> datos = new ArrayList<String>();
        String sql = "SELECT Nombre_fabricante, Precio_unitario, Año_construccion FROM productos WHERE Tipo_producto = 'bicicleta' AND Año_construccion >= 2019 ORDER BY Nombre_fabricante ASC";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String nombre = rs.getString(1);
                int precio = rs.getInt(2);
                int año = rs.getInt(3);
                String y = nombre + " " + precio + " " + año;
                datos.add(y);
            }
            Cerrar();
            return datos;
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos");
            Cerrar();
            return datos;
        }
    }

    @Override
    public List<String> listar3() {
        PreparedStatement ps;
        ResultSet rs = null;
        ArrayList<String> datos = new ArrayList<String>();
        String sql = "SELECT Nombre_fabricante FROM productos WHERE Proveedor_motor = 'Auteco' AND Tipo_producto = 'motocicleta_electrica'";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String nombre = rs.getString(1);
                String b = nombre;
                datos.add(b);
            }
            Cerrar();
            return datos;
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos");
            Cerrar();
            return datos;
        }
    }

    @Override
    public List<Integer> listar4() {
        PreparedStatement ps;
        ResultSet rs = null;
        ArrayList<Integer> datos = new ArrayList<Integer>();
        String sql = "select count(*) from productos where Tipo_producto = 'bicicleta' and Año_construccion >= 2019;";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int total = rs.getInt(1);
                datos.add(total);
            }
            Cerrar();
            return datos;
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos");
            Cerrar();
            return datos;
        }
    }

    @Override
    public List<String> listar5() {
        PreparedStatement ps;
        ResultSet rs = null;
        ArrayList<String> datos = new ArrayList<String>();
        String sql = "SELECT Nombre_fabricante From productos ORDER BY Nombre_fabricante ASC";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String nombre = rs.getString(1);
                String x = nombre;
                datos.add(x);
            }
            Cerrar();
            return datos;
        } catch (SQLException e) {
            System.out.println("Problema Buscando La Base de Datos");
            Cerrar();
            return datos;
        }
    }


}
