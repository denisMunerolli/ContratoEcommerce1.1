package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Endereco;
import util.DBConnection;

public class EnderecoDAO {

    public void addEndereco(Endereco endereco) throws SQLException {
        String sql = "INSERT INTO Endereco (id_endereco, id_empresa, logradouro, numero, complemento, bairro, cidade, estado, distrito, cep, tipo_endereco, padrao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, endereco.getIdEndereco());
            pstmt.setInt(2, endereco.getIdEmpresa());
            pstmt.setString(3, endereco.getLogradouro());
            pstmt.setString(4, endereco.getNumero());
            pstmt.setString(5, endereco.getComplemento());
            pstmt.setString(6, endereco.getBairro());
            pstmt.setString(7, endereco.getCidade());
            pstmt.setString(8, endereco.getEstado());
            pstmt.setString(9, endereco.getDistrito());
            pstmt.setString(10, endereco.getCep());
            pstmt.setString(11, endereco.getTipoEndereco());
            pstmt.setBoolean(12, endereco.isPadrao());
            pstmt.executeUpdate();
        }
    }

    public Endereco getEnderecoById(int idEndereco) throws SQLException {
        Endereco endereco = null;
        String sql = "SELECT * FROM Endereco WHERE id_endereco = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idEndereco);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    endereco = new Endereco();
                    endereco.setIdEndereco(rs.getInt("id_endereco"));
                    endereco.setIdEmpresa(rs.getInt("id_empresa"));
                    endereco.setLogradouro(rs.getString("logradouro"));
                    endereco.setNumero(rs.getString("numero"));
                    endereco.setComplemento(rs.getString("complemento"));
                    endereco.setBairro(rs.getString("bairro"));
                    endereco.setCidade(rs.getString("cidade"));
                    endereco.setEstado(rs.getString("estado"));
                    endereco.setDistrito(rs.getString("distrito"));
                    endereco.setCep(rs.getString("cep"));
                    endereco.setTipoEndereco(rs.getString("tipo_endereco"));
                    endereco.setPadrao(rs.getBoolean("padrao"));
                }
            }
        }
        return endereco;
    }

    // Other CRUD methods...
}
