package Modelo;

import java.sql.*;

public abstract class Conexao {

    final private String driver = "org.gjt.mm.mysql.Driver";
    final private String url = "jdbc:mysql://localhost:3306/imortal";
    final private String user = "root";
    final private String password = "root";

    public Connection getConexao() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
