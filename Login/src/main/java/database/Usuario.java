package database;
import database.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuario
{
    private java.sql.Connection conn;

    public Usuario()
    {
        DatabaseConnection dbConnect = new DatabaseConnection();
        this.conn = dbConnect.retornarConexao();
    }

    public void cadastrarUsuario(String email, String senha)
    {
        String query = "INSERT INTO usuarios VALUES (?, ?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            stmt.executeUpdate();
            System.out.println("Cadastro realizado com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean logarUsuario(String email, String senha)
    {
        String query = "SELECT email, senha FROM usuarios WHERE email = ? AND senha = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            var result = stmt.executeQuery();

            if (result.next()) {
                System.out.println("Logado com sucesso!");
                return true;
            }

            System.out.println("Usuário ou senha incorretos.");
            return false;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean verificarUsuarioExistente(String email)
    {
        String query = "SELECT email FROM usuarios WHERE email = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            var resultado = stmt.executeQuery(); // Pega todas os resultados, mas o índice é 0

            if (resultado.next()) { //.next() move o cursor para frente, tornando o índice = 1, se for 1, existe no banco...
                return true;
            }

            return false;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
}
