package org.aguzman._353.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "a12344321";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        return connection = DriverManager.getConnection(url, username, password);
    }
}
