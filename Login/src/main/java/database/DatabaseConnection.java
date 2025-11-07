package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
    private Connection conn;

    public DatabaseConnection()
    {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/login", "postgres", "");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection retornarConexao()
    {
        return this.conn;
    }
}
