package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Usuario;
import util.DBConnection;

public class UsuarioDAO {

    public void addUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO Usuario (id_usuario, id_empresa, nome_usuario, sobrenome, login, senha, cpf, email, status, cargo, superior_imediato, cargo_superior_imediato, black_list, justificativa_bloqueio, doc_em_dia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, usuario.getIdUsuario());
            pstmt.setInt(2, usuario.getIdEmpresa());
            pstmt.setString(3, usuario.getNomeUsuario());
            pstmt.setString(4, usuario.getSobrenome());
            pstmt.setString(5, usuario.getLogin());
            pstmt.setString(6, usuario.getSenha());
            pstmt.setString(7, usuario.getCpf());
            pstmt.setString(8, usuario.getEmail());
            pstmt.setString(9, usuario.getStatus());
            pstmt.setString(10, usuario.getCargo());
            pstmt.setString(11, usuario.getSuperiorImediato());
            pstmt.setString(12, usuario.getCargoSuperiorImediato());
            pstmt.setBoolean(13, usuario.isBlackList());
            pstmt.setString(14, usuario.getJustificativaBloqueio());
            pstmt.setBoolean(15, usuario.isDocEmDia());
            pstmt.executeUpdate();
        }
    }

    public List<Usuario> getUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM Usuario";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setIdEmpresa(rs.getInt("id_empresa"));
                usuario.setNomeUsuario(rs.getString("nome_usuario"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setStatus(rs.getString("status"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setSuperiorImediato(rs.getString("superior_imediato"));
                usuario.setCargoSuperiorImediato(rs.getString("cargo_superior_imediato"));
                usuario.setBlackList(rs.getBoolean("black_list"));
                usuario.setJustificativaBloqueio(rs.getString("justificativa_bloqueio"));
                usuario.setDocEmDia(rs.getBoolean("doc_em_dia"));
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }

    // Other CRUD methods...
}