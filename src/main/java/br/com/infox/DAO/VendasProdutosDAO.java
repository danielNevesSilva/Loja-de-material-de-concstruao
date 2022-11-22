/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.DAO;

import static br.com.infox.DAO.EstoqueDAO.LOGIN;
import static br.com.infox.DAO.EstoqueDAO.SENHA;
import static br.com.infox.DAO.EstoqueDAO.URL;
import com.mycompany.projetopi.model.Estoque;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class VendasProdutosDAO {

    public static ArrayList<Estoque> consultarProduto(String nomeProduto) {
        ArrayList<Estoque> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select idprod,produto,quantidade from estoque where produto like ?");
            
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Estoque item = new Estoque();
                    item.setIdprod(rs.getInt("idprod"));
                    item.setProduto(rs.getString("produto"));
                    item.setQuantidade(rs.getInt("quantidade"));

                    listaRetorno.add(item);
                }

            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception ex) {

                }

            }
        }

        return listaRetorno;
    }
}
