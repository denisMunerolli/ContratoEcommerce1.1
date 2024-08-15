package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Atualize o nome do banco de dados para Ecomerce
    private static final String URL = "jdbc:mysql://localhost:3306/Ecomerce?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";  // Nome de usuário do MySQL
    private static final String PASSWORD = "12345687";  // Senha do MySQL

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}