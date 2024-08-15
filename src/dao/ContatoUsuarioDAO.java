package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.ContatoUsuario;
import util.DBConnection;

public class ContatoUsuarioDAO {

    public void addContatoUsuario(ContatoUsuario contatoUsuario) throws SQLException {
        String sql = "INSERT INTO ContatoUsuario (id_usuario, telefone, email) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, contatoUsuario.getIdUsuario());
            pstmt.setString(2, contatoUsuario.getTelefone());
            pstmt.setString(3, contatoUsuario.getEmail());
            pstmt.executeUpdate();
        }
    }

    public ContatoUsuario getContatoUsuarioById(int idUsuario) throws SQLException {
        ContatoUsuario contatoUsuario = null;
        String sql = "SELECT * FROM ContatoUsuario WHERE id_usuario = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idUsuario);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    contatoUsuario = new ContatoUsuario();
                    contatoUsuario.setIdUsuario(rs.getInt("id_usuario"));
                    contatoUsuario.setTelefone(rs.getString("telefone"));
                    contatoUsuario.setEmail(rs.getString("email"));
                }
            }
        }
        return contatoUsuario;
    }

    // Other CRUD methods...
}

