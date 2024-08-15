package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.ConfigsContato;
import util.DBConnection;

public class ConfigContatoDAO {

    public void addConfigsContato(ConfigsContato configsContato) throws SQLException {
        String sql = "INSERT INTO ConfigsContato (id_usuario, id_empresa, aceita_receber_email_geral, aceita_receber_email_oferta, aceita_receber_email_alteracao, aceita_receber_sms, numero_sms, email_notificacoes, data_ultima_atualizacao_senha, aceita_receber_notificacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, configsContato.getIdUsuario());
            pstmt.setInt(2, configsContato.getIdEmpresa());
            pstmt.setBoolean(3, configsContato.isAceitaReceberEmailGeral());
            pstmt.setBoolean(4, configsContato.isAceitaReceberEmailOferta());
            pstmt.setBoolean(5, configsContato.isAceitaReceberEmailAlteracao());
            pstmt.setBoolean(6, configsContato.isAceitaReceberSMS());
            pstmt.setString(7, configsContato.getNumeroSMS());
            pstmt.setString(8, configsContato.getEmailNotificacoes());
            pstmt.setString(9, configsContato.getDataUltimaAtualizacaoSenha());
            pstmt.setBoolean(10, configsContato.isAceitaReceberNotificacao());
            pstmt.executeUpdate();
        }
    }

    public ConfigsContato getConfigsContatoById(int idUsuario) throws SQLException {
        ConfigsContato configsContato = null;
        String sql = "SELECT * FROM ConfigsContato WHERE id_usuario = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idUsuario);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    configsContato = new ConfigsContato();
                    configsContato.setIdUsuario(rs.getInt("id_usuario"));
                    configsContato.setIdEmpresa(rs.getInt("id_empresa"));
                    configsContato.setAceitaReceberEmailGeral(rs.getBoolean("aceita_receber_email_geral"));
                    configsContato.setAceitaReceberEmailOferta(rs.getBoolean("aceita_receber_email_oferta"));
                    configsContato.setAceitaReceberEmailAlteracao(rs.getBoolean("aceita_receber_email_alteracao"));
                    configsContato.setAceitaReceberSMS(rs.getBoolean("aceita_receber_sms"));
                    configsContato.setNumeroSMS(rs.getString("numero_sms"));
                    configsContato.setEmailNotificacoes(rs.getString("email_notificacoes"));
                    configsContato.setDataUltimaAtualizacaoSenha(rs.getString("data_ultima_atualizacao_senha"));
                    configsContato.setAceitaReceberNotificacao(rs.getBoolean("aceita_receber_notificacao"));
                }
            }
        }
        return configsContato;
    }

    // Other CRUD methods...
}
	

