package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAOImplements extends Conexion implements InterfaceDAO<Clientes>{

    @Override
    public int insertar(Clientes x) {
        PreparedStatement ps;
        String sql = "INSERT INTO clientes( Alias, Nombres, Apellidos, Email, Celular, Contraseña, Fecha_nacimiento) VALUES (?,?,?,?,?,?,?)";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, x.getAlias());
            ps.setString(2, x.getNombres());
            ps.setString(3, x.getApellidos());
            ps.setString(4, x.getEmail());
            ps.setLong(5, x.getCelular());
            ps.setString(6, x.getContraseña());
            ps.setTimestamp(7, x.getFechaNacimiento());
            int contador = ps.executeUpdate();
            if (contador > 0){
                System.out.println("Se Agrego el registro de manera exitosa");
                return 1;
            }
            else{
                System.out.println("No se agrego el registro");
            }
        } catch (SQLException e) {
            System.out.println("Problema al insertar la información");
            Cerrar();
            return 0;
        }
        return 0;
    }

    @Override
    public int actualizar(Clientes x) {
        PreparedStatement ps;
        String sql = "UPDATE Clientes SET Celular = ? WHERE Alias = ?";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setLong(1, x.getCelular());
            ps.setString(2, x.getAlias());
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
    public int eliminar(Clientes x) {
        PreparedStatement ps;
        String sql = "DELETE FROM Clientes WHERE Alias = ?";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, x.getAlias());
            int contador = ps.executeUpdate();
            if (contador > 0) {
                System.out.println("Se Agrego el registro de manera exitosa");
                return 1;
            } else {
                System.out.println("Ocurrio un problema al modificar el registro");
            }

        } catch (SQLException e) {
            System.out.println("Problema al eliminar la información");
            Cerrar();
            return 0;
        }

        return 0;
    }

    @Override
    public List<String> listar5() {
        PreparedStatement ps;
        ResultSet rs = null;
        ArrayList<String> datos = new ArrayList<String>();
        String sql = "select c.Alias,c.Nombres,c.Apellidos from clientes c left join intencion_compra r on Alias_cliente=Alias where Fabricante_producto = 'Yeti' order by c.Nombres";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String Alias = rs.getString(1);
                String Nombre = rs.getString(2);
                String Apellido = rs.getString(3);
                String x = (Alias+" | "+Nombre+" | "+Apellido);
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
    public List<String> listar() {
        return null;
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
}
