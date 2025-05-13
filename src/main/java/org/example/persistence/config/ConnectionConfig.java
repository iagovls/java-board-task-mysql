package org.example.persistence.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConnectionConfig {


    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/board_manager";
        String user = "root";
        String password = "password";
        Connection connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }
}
