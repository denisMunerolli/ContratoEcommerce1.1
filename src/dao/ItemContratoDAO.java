package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.ItemContrato;
import util.DBConnection;

public class ItemContratoDAO {

    public void addItemContrato(ItemContrato itemContrato) throws SQLException {
        String sql = "INSERT INTO ItemContrato (id_item, id_contrato, descricao_item, quantidade, valor_unitario, valor_total) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, itemContrato.getIdItem());
            pstmt.setInt(2, itemContrato.getIdContrato());
            pstmt.setString(3, itemContrato.getDescricaoItem());
            pstmt.setInt(4, itemContrato.getQuantidade());
            pstmt.setBigDecimal(5, itemContrato.getValorUnitario());
            pstmt.setBigDecimal(6, itemContrato.getValorTotal());
            pstmt.executeUpdate();
        }
    }

    public List<ItemContrato> getItemContratoByContratoId(int idContrato) throws SQLException {
        List<ItemContrato> itensContrato = new ArrayList<>();
        String sql = "SELECT * FROM ItemContrato WHERE id_contrato = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idContrato);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    ItemContrato itemContrato = new ItemContrato();
                    itemContrato.setIdItem(rs.getInt("id_item"));
                    itemContrato.setIdContrato(rs.getInt("id_contrato"));
                    itemContrato.setDescricaoItem(rs.getString("descricao_item"));
                    itemContrato.setQuantidade(rs.getInt("quantidade"));
                    itemContrato.setValorUnitario(rs.getBigDecimal("valor_unitario"));
                    itemContrato.setValorTotal(rs.getBigDecimal("valor_total"));
                    itensContrato.add(itemContrato);
                }
            }
        }
        return itensContrato;
    }

    // Other CRUD methods...
}