import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import dao.ProdutoDAO;
import entities.Produto;
import util.DBConnection; // Certifique-se de que o pacote está correto

public class Main {
    public static void main(String[] args) {
        // Testando a conexão com o banco de dados
        try {
            Connection conn = util.DBConnection.getConnection();
            if (conn != null) {
                System.out.println("Conexão bem-sucedida!");
                conn.close();  // Não se esqueça de fechar a conexão
            } else {
                System.out.println("Falha na conexão!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar: " + e.getMessage());
            return; // Saia se a conexão falhar, já que não podemos prosseguir sem ela
        }

        // Operações com ProdutoDAO
        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setIdProduto(1);
        produto.setNomeProduto("Produto Teste");
        produto.setDescricao("Descrição do Produto Teste");
        produto.setCategoria("Categoria Teste");
        produto.setUnidadeMedida("kg");
        produto.setPeso(new BigDecimal("1.5"));
        produto.setQuantidade(new BigDecimal("10"));
        produto.setValorUnitario(new BigDecimal("19.99"));

        try {
            produtoDAO.addProduto(produto);
            System.out.println("Produto adicionado com sucesso!");

            produtoDAO.getProdutos().forEach(p ->
                System.out.printf("ID: %d, Nome: %s, Descrição: %s, Categoria: %s, Unidade: %s, Peso: %s, Quantidade: %s, Valor Unitário: %s%n",
                    p.getIdProduto(), p.getNomeProduto(), p.getDescricao(), p.getCategoria(), p.getUnidadeMedida(), p.getPeso(), p.getQuantidade(), p.getValorUnitario()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
