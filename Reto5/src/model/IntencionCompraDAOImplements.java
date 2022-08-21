package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IntencionCompraDAOImplements extends Conexion implements InterfaceDAO<IntencionCompra>{

    @Override
    public int insertar(IntencionCompra x) {
        PreparedStatement ps;
        String sql = "INSERT INTO intencion_Compra( Alias_cliente, Fabricante_producto,Fecha_consula) VALUES (?,?,?)";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, x.getAlias());
            ps.setString(2, x.getFabricanteProducto());
            ps.setTimestamp(3, x.getFechaConsulta());
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
    public int actualizar(IntencionCompra x) {
        return 0;
    }

    @Override
    public int eliminar(IntencionCompra x) {
        PreparedStatement ps;
        String sql = "DELETE from intencion_compra WHERE Fabricante_producto = ? and Alias_cliente = ?";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, x.getFabricanteProducto());
            ps.setString(2, x.getAlias());
            int contador = ps.executeUpdate();
            if (contador > 0) {
                System.out.println("Se elimino la intencion de compra de manera exitosa");
                return 1;
            } else {
                System.out.println("Ocurrio un problema al eliminar el registro");
                Cerrar();
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Problema al eliminar la información");
            Cerrar();
            return 0;
        }

    }

    @Override
    public List<String> listar() {
        PreparedStatement ps;
        ResultSet rs = null;
        ArrayList<String> datos = new ArrayList<String>();
        String sql =" select Fabricante_producto from Intencion_compra where Alias_cliente = 'lucky' ORDER BY Fabricante_producto ASC" ;
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String nombreFabr = rs.getString(1);
                String x = nombreFabr;
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

    @Override
    public List<String> listar2() {
        return null;
    }

    @Override
    public List<String> listar3() {
        return null;
    }

    @Override
    public List<Integer> listar4() {
        return null;
    }

    @Override
    public List<String> listar5() {
        return null;
    }
}
