package org.example.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) {
        try (Connection connection = Database.getInstance().getConnection();
             Statement statement = connection.createStatement()) {
            String sql = Files.readString(Path.of("src/main/resources/sql/init_db.sql"));
            statement.executeUpdate(sql);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
