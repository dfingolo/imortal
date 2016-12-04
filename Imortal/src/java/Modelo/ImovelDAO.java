package Modelo;

import Entidade.Imovel;
import java.sql.*;
import java.util.*;

public class ImovelDAO extends Conexao {

    private Connection con;

    public ImovelDAO() throws ClassNotFoundException, SQLException {
        con = getConexao();
    }

    public void adiciona(Imovel imovel) {
        try {
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO imoveis "
                    + " (endereco, bairro_id, area, ant_proprietario_id, descricao, preco_min, preco_compra) "
                    + " values (?, ?, ?, ?, ?, ?, ?)"
            );

            pst.setString(1, imovel.getEndereco());
            pst.setInt(2, imovel.getBairroId());
            pst.setDouble(3, imovel.getArea());
            pst.setInt(4, imovel.getAntProprietarioId());
            pst.setString(5, imovel.getDescricao());
            pst.setDouble(6, imovel.getPrecoMin());
            pst.setDouble(7, imovel.getPrecoCompra());

            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void vender(Imovel imovel) {
        try {
            PreparedStatement pst = con.prepareStatement(
                    "UPDATE imoveis SET novo_proprietario_id = ?, preco_venda = ? WHERE id = ?"
            );

            pst.setInt(1, imovel.getNovoProprietarioId());
            pst.setDouble(2, imovel.getPrecoVenda());
            pst.setInt(3, imovel.getId());

            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Imovel> listarDisponiveis() throws SQLException {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            List<Imovel> imoveis = new ArrayList<Imovel>();

            pst = con.prepareStatement("SELECT imoveis.id, imoveis.endereco, bairros.nome AS bairro, imoveis.area, proprietarios.nome AS ant_proprietario, "
                    + "    imoveis.descricao, ROUND(imoveis.preco_min, 2) AS preco_min, ROUND(imoveis.preco_compra, 2) AS preco_compra "
                    + "FROM imoveis "
                    + "    INNER JOIN bairros ON bairros.id = imoveis.bairro_id "
                    + "    INNER JOIN proprietarios ON proprietarios.id = imoveis.ant_proprietario_id "
                    + "WHERE novo_proprietario_id IS NULL;");

            rs = pst.executeQuery();

            while (rs.next()) {
                Imovel imovel = new Imovel();

                imovel.setId(rs.getInt("id"));
                imovel.setEndereco(rs.getString("endereco"));
                imovel.setBairroNome(rs.getString("bairro"));
                imovel.setArea(rs.getDouble("area"));
                imovel.setAntProprietarioNome(rs.getString("ant_proprietario"));
                imovel.setDescricao(rs.getString("descricao"));
                imovel.setPrecoMin(rs.getDouble("preco_min"));
                imovel.setPrecoCompra(rs.getDouble("preco_compra"));

                imoveis.add(imovel);
            }

            pst.close();
            rs.close();
            return imoveis;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Imovel> listarVendidos() throws SQLException {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            List<Imovel> imoveis = new ArrayList<Imovel>();

            pst = con.prepareStatement("SELECT imoveis.endereco, bairros.nome AS bairro, imoveis.area, p1.nome AS ant_proprietario, "
                    + "    p2.nome AS novo_proprietario, imoveis.descricao, ROUND(imoveis.preco_min, 2) AS preco_min, "
                    + "    ROUND(imoveis.preco_compra, 2) AS preco_compra, ROUND(imoveis.preco_venda, 2) AS preco_venda "
                    + "FROM imoveis "
                    + "    INNER JOIN bairros ON bairros.id = imoveis.bairro_id "
                    + "    INNER JOIN proprietarios p1 ON p1.id = imoveis.ant_proprietario_id "
                    + "    INNER JOIN proprietarios p2 ON p2.id = imoveis.novo_proprietario_id;");

            rs = pst.executeQuery();

            while (rs.next()) {
                Imovel imovel = new Imovel();

                imovel.setEndereco(rs.getString("endereco"));
                imovel.setBairroNome(rs.getString("bairro"));
                imovel.setArea(rs.getDouble("area"));
                imovel.setAntProprietarioNome(rs.getString("ant_proprietario"));
                imovel.setNovoProprietarioNome(rs.getString("novo_proprietario"));
                imovel.setDescricao(rs.getString("descricao"));
                imovel.setPrecoMin(rs.getDouble("preco_min"));
                imovel.setPrecoCompra(rs.getDouble("preco_compra"));
                imovel.setPrecoVenda(rs.getDouble("preco_venda"));

                imoveis.add(imovel);
            }

            pst.close();
            rs.close();
            return imoveis;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
