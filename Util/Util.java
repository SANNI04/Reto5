
package mintic.reto5listo.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {    
    private static final String UBICACION_BD = "C:\\Users\\judit\\Documents\\NetBeansProjects\\reto4\\ProyectosConstruccion.db";
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection(url);
    }    

}