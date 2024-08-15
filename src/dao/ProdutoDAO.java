package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import util.DBConnection;

public class ProdutoDAO {

    public void addProduto(Produto produto) throws SQLException {
        String sql = "INSERT INTO Produto (id_produto, nome_produto, descricao, categoria, unidade_medida, peso, quantidade, valor_unitario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, produto.getIdProduto());
            pstmt.setString(2, produto.getNomeProduto());
            pstmt.setString(3, produto.getDescricao());
            pstmt.setString(4, produto.getCategoria());
            pstmt.setString(5, produto.getUnidadeMedida());
            pstmt.setBigDecimal(6, produto.getPeso());
            pstmt.setBigDecimal(7, produto.getQuantidade());
            pstmt.setBigDecimal(8, produto.getValorUnitario());
            pstmt.executeUpdate();
        }
    }

    public List<Produto> getProdutos() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produto";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setUnidadeMedida(rs.getString("unidade_medida"));
                produto.setPeso(rs.getBigDecimal("peso"));
                produto.setQuantidade(rs.getBigDecimal("quantidade"));
                produto.setValorUnitario(rs.getBigDecimal("valor_unitario"));
                produtos.add(produto);
            }
        }
        return produtos;
    }

    // Other CRUD methods...
}