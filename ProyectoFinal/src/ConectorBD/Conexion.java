package ConectorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static Connection getConexion() {
		String conexionUrl =  "jdbc:sqlserver://25.99.169.199:1433;"
							+ "database=TrabajoFinalAlgoritmos;"
							+ "user=Algoritmos;"
							+ "password=1234;"
							+ "loginTimeout=30;";
		try {
			Connection conexion = DriverManager.getConnection(conexionUrl);
			//System.out.println("CORRECTO");
			return conexion;
		} catch (SQLException e) {
			System.out.println(e.toString());
			return null;
		}
		
	}
}
