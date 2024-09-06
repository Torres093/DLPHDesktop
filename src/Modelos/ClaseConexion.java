package Modelos;

import java.sql.*;

public class ClaseConexion {
     private static final String URL = "jdbc:oracle:192.168.1.24:@localhost:1521:xe";
    private static final String USUARIO = "DLPH_EXPO";
    private static final String CONTRASENA = "fakedrips";
    public static Connection getConexion() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            return conexion;
        } catch (SQLException e) {
            System.out.println("Hubo un error" + e);
              return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("La clase presentó un error" + ex);
              return null;
        }
    }
}
