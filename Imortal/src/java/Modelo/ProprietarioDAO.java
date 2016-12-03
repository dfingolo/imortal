package Modelo;

import Entidade.Proprietario;
import java.sql.*;
import java.util.*;

public class ProprietarioDAO extends Conexao {

    private Connection con;

    public ProprietarioDAO() throws ClassNotFoundException, SQLException {
        con = getConexao();
    }
    
    public List<Proprietario> listar() throws SQLException {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            List<Proprietario> proprietarios = new ArrayList<Proprietario>();

            pst = con.prepareStatement("SELECT * FROM proprietarios");

            rs = pst.executeQuery();

            while (rs.next()) {
                Proprietario proprietario = new Proprietario();

                proprietario.setId(rs.getInt("id"));
                proprietario.setNome(rs.getString("nome"));
                proprietario.setCpf(rs.getString("cpf"));
                proprietario.setEndereco(rs.getString("endereco"));
                proprietario.setTelefone(rs.getString("telefone"));
                
                proprietarios.add(proprietario);
            }

            pst.close();
            rs.close();
            return proprietarios;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void adiciona(Proprietario proprietario) {
        try {
            PreparedStatement pst = con.prepareStatement("INSERT INTO proprietarios (nome, cpf, endereco, telefone) values (?, ?, ?, ?)");

            pst.setString(1, proprietario.getNome());
            pst.setString(2, proprietario.getCpf());
            pst.setString(3, proprietario.getEndereco());
            pst.setString(4, proprietario.getTelefone());

            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Proprietario> listarVendas() throws SQLException {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            List<Proprietario> proprietarios = new ArrayList<Proprietario>();

            pst = con.prepareStatement("SELECT * FROM (SELECT proprietarios.*, COUNT(imoveis.id) AS total_vendidos "
                                     + "FROM proprietarios "
                                     + "    INNER JOIN imoveis ON imoveis.ant_proprietario_id = proprietarios.id "
                                     + "UNION "
                                     + "SELECT proprietarios.*, 0 AS total_vendidos "
                                     + "FROM proprietarios "
                                     + "WHERE id NOT IN (SELECT ant_proprietario_id FROM imoveis)) AS a "
                                     + "ORDER BY total_vendidos DESC;");

            rs = pst.executeQuery();

            while (rs.next()) {
                Proprietario proprietario = new Proprietario();

                proprietario.setNome(rs.getString("nome"));
                proprietario.setCpf(rs.getString("cpf"));
                proprietario.setEndereco(rs.getString("endereco"));
                proprietario.setTelefone(rs.getString("telefone"));
                proprietario.setTotalVendidos(rs.getInt("total_vendidos"));
                
                proprietarios.add(proprietario);
            }

            pst.close();
            rs.close();
            return proprietarios;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Proprietario> listarCompras() throws SQLException {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            List<Proprietario> proprietarios = new ArrayList<Proprietario>();

            pst = con.prepareStatement("SELECT * FROM (SELECT proprietarios.*, COUNT(imoveis.id) AS total_comprados "
                                     + "FROM proprietarios "
                                     + "    INNER JOIN imoveis ON imoveis.novo_proprietario_id = proprietarios.id "
                                     + "UNION "
                                     + "SELECT proprietarios.*, 0 AS total_vendidos "
                                     + "FROM proprietarios "
                                     + "WHERE id NOT IN (SELECT novo_proprietario_id FROM imoveis "
                                     + "                    WHERE novo_proprietario_id IS NOT NULL)) AS a "
                                     + "ORDER BY total_comprados DESC;");

            rs = pst.executeQuery();

            while (rs.next()) {
                Proprietario proprietario = new Proprietario();

                proprietario.setNome(rs.getString("nome"));
                proprietario.setCpf(rs.getString("cpf"));
                proprietario.setEndereco(rs.getString("endereco"));
                proprietario.setTelefone(rs.getString("telefone"));
                proprietario.setTotalComprados(rs.getInt("total_comprados"));
                
                proprietarios.add(proprietario);
            }

            pst.close();
            rs.close();
            return proprietarios;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
