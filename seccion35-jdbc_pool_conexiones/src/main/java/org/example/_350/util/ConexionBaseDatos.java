package org.example._350.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "a12344321";
    //BasicDataSource es la clase que se encarga de administrar el pool de conexiones del paquete org.apache.commons.dbcp2 (ver pom.xml)
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(password);
            pool.setInitialSize(3); //Establece el número inicial de conexiones en el pool.
            pool.setMinIdle(3); //Establece el mínimo de conexiones inactivas, esperando para ser habilitadas.
            pool.setMaxIdle(8); //Establece el máximo de conexiones inactivas.
            pool.setMaxTotal(8); //Establece el número de total conexiones activas e inactivas.
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException { // Aca se obtiene una sola conexión desde pool que esté disponible(getInstance())
        return getInstance().getConnection();
    }
}

















