package br.com.infox.DAO;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;

public class Conexao {

    static Connection Connection() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    Connection conexao;

    public static Connection conector() {
        java.sql.Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/projetoevolucao";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

 

}
