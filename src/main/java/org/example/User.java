package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    String url = "jdbc:mysql://localhost:3306/board_manager"; // Nome do DB definido no compose
    String user = "root"; // Ou "myuser" se preferir
    String password = "password"; // Senha definida no compose


    public User() throws SQLException {
        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {

             // SQL para criar a tabela
             String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "nome VARCHAR(100) NOT NULL, " +
                "dataNascimento DATE NOT NULL" +
                ")";

            stmt.executeUpdate(sql);
            System.out.println("Tabela 'usuarios' criada com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}
