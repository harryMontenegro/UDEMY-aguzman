package org.aguzman._338;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
        String username = "root";
        String password = "a12344321";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM productos");
            while (resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }
            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
