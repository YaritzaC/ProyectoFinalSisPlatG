package pe.edu.upeu.Spring01.test;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

	 private static final String URL = "jdbc:mysql://52.55.92.59:3306/sisplata";
	    private static final String DRIVER = "com.mysql.jdbc.Driver";
	    private static final String USER = "root";
	    private static final String PASS = "1234";
	    private static Connection cx = null;

	    public static Connection getConexion() {
	        try {
	            Class.forName(DRIVER);
	            if (cx == null) {
	                cx = DriverManager.getConnection(URL, USER, PASS);
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            System.out.println("Error: " + e);
	        }
	        return cx;
	    }

	    public static void cerrar() throws SQLException {
	        if (cx != null) {
	            cx.close();
	        }
	    }
}
