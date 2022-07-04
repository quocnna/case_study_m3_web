package cg.m3.furama.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Configuration {
    private static final String URL = "jdbc:mysql://localhost:3306/cs_m3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return connection;
    }
}
