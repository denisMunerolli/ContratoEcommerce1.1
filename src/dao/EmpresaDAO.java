package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Empresa;
import util.DBConnection;

public class EmpresaDAO {

    public void addEmpresa(Empresa empresa) throws SQLException {
        String sql = "INSERT INTO Empresa (id_empresa, cnpj, tipo_empresa) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, empresa.getIdEmpresa());
            pstmt.setString(2, empresa.getCnpj());
            pstmt.setString(3, empresa.getTipoEmpresa());
            pstmt.executeUpdate();
        }
    }

    public Empresa getEmpresaById(int idEmpresa) throws SQLException {
        Empresa empresa = null;
        String sql = "SELECT * FROM Empresa WHERE id_empresa = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idEmpresa);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    empresa = new Empresa();
                    empresa.setIdEmpresa(rs.getInt("id_empresa"));
                    empresa.setCnpj(rs.getString("cnpj"));
                    empresa.setTipoEmpresa(rs.getString("tipo_empresa"));
                }
            }
        }
        return empresa;
    }

    // Other CRUD methods...
}
