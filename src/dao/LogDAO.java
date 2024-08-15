package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Log;
import util.DBConnection;

public class LogDAO {

    public void addLog(Log log) throws SQLException {
        String sql = "INSERT INTO Log (id_log, id_usuario, id_empresa, acao, data_hora, descricao) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, log.getIdLog());
            pstmt.setInt(2, log.getIdUsuario());
            pstmt.setInt(3, log.getIdEmpresa());
            pstmt.setString(4, log.getAcao());
            pstmt.setTimestamp(5, new java.sql.Timestamp(log.getDataHora().getTime()));
            pstmt.setString(6, log.getDescricao());
            pstmt.executeUpdate();
        }
    }

    public Log getLogById(int idLog) throws SQLException {
        Log log = null;
        String sql = "SELECT * FROM Log WHERE id_log = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idLog);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    log = new Log();
                    log.setIdLog(rs.getInt("id_log"));
                    log.setIdUsuario(rs.getInt("id_usuario"));
                    log.setIdEmpresa(rs.getInt("id_empresa"));
                    log.setAcao(rs.getString("acao"));
                    log.setDataHora(rs.getTimestamp("data_hora"));
                    log.setDescricao(rs.getString("descricao"));
                }
            }
        }
        return log;
    }

    // Other CRUD methods...
}