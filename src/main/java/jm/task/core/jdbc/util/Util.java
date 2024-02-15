package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/ex";
    private static final String USERNAME = "Vesnina";
    private static final String PASSWORD = "Willi1210";

    public static Connection getNewConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection == null) {
                System.out.println("Ошибка подключения к БД");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
