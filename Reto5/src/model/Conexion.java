package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Conexion {

    protected Connection conexion;
    private Properties mispropiedades;
    private String db;
    private String iploc;
    private String user;
    private String pass;
    private String url;
    private String timezone;

    public Conexion() {
        mispropiedades = new Properties();
        conexion = null;

        try {
            mispropiedades.load(new FileReader("data/config.properties"));
            db = mispropiedades.getProperty("database");
            iploc = mispropiedades.getProperty("IPLocal");
            user = mispropiedades.getProperty("usuario");
            pass = mispropiedades.getProperty("pass");
            timezone = mispropiedades.getProperty("serverTimezone");
            url = "jdbc:mysql://" + iploc + ":3306/" + db + "?serverTimezone=" + timezone;
        } catch (FileNotFoundException ex) {
            System.out.println("Error de conexion");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error de conexion");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Conectar(){
        try {
            System.out.println("iniciando conexion: "+ url);
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion");
            e.printStackTrace();
        }
    }

    public void Cerrar(){
        try {
            conexion.close();
        }catch (SQLException e){
            System.out.println("Prolema al cerrar la conexion a la base de datos");
        }
    }


}
