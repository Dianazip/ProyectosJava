package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProveedoresDAOImplements extends Conexion implements InterfaceDAO<Proveedores>{

    @Override
    public int insertar(Proveedores x) {
        PreparedStatement ps;
        String sql = "INSERT INTO proveedores( idproveedores, Nombre, Direccion, telefono) VALUES (?,?,?,?)";
        try {
            Conectar();
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, x.getIdProveedores());
            ps.setString(2, x.getNombre());
            ps.setString(3, x.getDireccion());
            ps.setLong(4, x.getTelefono());
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
    public int actualizar(Proveedores x) {
        return 0;
    }

    @Override
    public int eliminar(Proveedores x) {
        return 0;
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

    @Override
    public List<String> listar5() {
        return null;
    }
}
