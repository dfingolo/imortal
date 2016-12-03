package Modelo;

import Entidade.Bairro;
import java.sql.*;
import java.util.*;

public class BairroDAO extends Conexao {
    
    private Connection con;

    public BairroDAO() throws ClassNotFoundException, SQLException {
        con = getConexao();
    }
    
    public List<Bairro> listar() throws SQLException {
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            List<Bairro> bairros = new ArrayList<Bairro>();

            pst = con.prepareStatement("SELECT * FROM bairros");

            rs = pst.executeQuery();

            while (rs.next()) {
                Bairro bairro = new Bairro();

                bairro.setId(rs.getInt("id"));
                bairro.setNome(rs.getString("nome"));
                
                bairros.add(bairro);
            }

            pst.close();
            rs.close();
            return bairros;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void adiciona(Bairro bairro) {
        try {
            PreparedStatement pst = con.prepareStatement("INSERT INTO bairros (nome) values (?)");

            pst.setString(1, bairro.getNome());

            pst.execute();
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
