package org.example;

import org.example.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static org.example.persistence.config.ConnectionConfig.getConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
    }
}
