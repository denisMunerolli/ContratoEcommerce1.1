package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Contrato;
import util.DBConnection;

public class ContratoDAO {

    public void addContrato(Contrato contrato) throws SQLException {
        String sql = "INSERT INTO Contrato (id_contrato, titulo_contrato, data_criacao, vigencia_inicio, vigencia_fim, id_usuario_contratante, id_empresa_contratante, id_fornecedor, id_empresa_fornec, id_moeda, descricao, observacoes, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, contrato.getIdContrato());
            pstmt.setString(2, contrato.getTituloContrato());
            pstmt.setDate(3, new java.sql.Date(contrato.getDataCriacao().getTime()));
            pstmt.setDate(4, new java.sql.Date(contrato.getVigenciaInicio().getTime()));
            pstmt.setDate(5, new java.sql.Date(contrato.getVigenciaFim().getTime()));
            pstmt.setInt(6, contrato.getIdUsuarioContratante());
            pstmt.setInt(7, contrato.getIdEmpresaContratante());
            pstmt.setInt(8, contrato.getIdFornecedor());
            pstmt.setInt(9, contrato.getIdEmpresaFornec());
            pstmt.setInt(10, contrato.getIdMoeda());
            pstmt.setString(11, contrato.getDescricao());
            pstmt.setString(12, contrato.getObservacoes());
            pstmt.setString(13, contrato.getStatus());
            pstmt.executeUpdate();
        }
    }

    public Contrato getContratoById(int idContrato) throws SQLException {
        Contrato contrato = null;
        String sql = "SELECT * FROM Contrato WHERE id_contrato = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idContrato);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    contrato = new Contrato();
                    contrato.setIdContrato(rs.getInt("id_contrato"));
                    contrato.setTituloContrato(rs.getString("titulo_contrato"));
                    contrato.setDataCriacao(rs.getDate("data_criacao"));
                    contrato.setVigenciaInicio(rs.getDate("vigencia_inicio"));
                    contrato.setVigenciaFim(rs.getDate("vigencia_fim"));
                    contrato.setIdUsuarioContratante(rs.getInt("id_usuario_contratante"));
                    contrato.setIdEmpresaContratante(rs.getInt("id_empresa_contratante"));
                    contrato.setIdFornecedor(rs.getInt("id_fornecedor"));
                    contrato.setIdEmpresaFornec(rs.getInt("id_empresa_fornec"));
                    contrato.setIdMoeda(rs.getInt("id_moeda"));
                    contrato.setDescricao(rs.getString("descricao"));
                    contrato.setObservacoes(rs.getString("observacoes"));
                    contrato.setStatus(rs.getString("status"));
                }
            }
        }
        return contrato;
    }

    // Other CRUD methods...
}