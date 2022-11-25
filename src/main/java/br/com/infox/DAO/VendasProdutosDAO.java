/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.DAO;

import static br.com.infox.DAO.ProdutoDAO.LOGIN;
import static br.com.infox.DAO.ProdutoDAO.SENHA;
import static br.com.infox.DAO.ProdutoDAO.URL;
import com.mycompany.projetopi.model.Produto;
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
    /*
    public static ArrayList<Produto> consultarProduto(String nomeProduto) {
        
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select idprod,produto,quantidade, preco from estoque where produto like ?");
            comandoSQL.setString(1, nomeProduto);
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setIdprod(rs.getInt("idprod"));
                    item.setProduto(rs.getString("produto"));
                    item.setQuantidade(rs.getInt("quantidade"));
                    item.setPreco(rs.getDouble("preco"));

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
    */
    public static boolean Excluir(String codigo) {
        boolean retorno = false;
        try {
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("delete from estoque where idprod =?");
            comandoSQL.setString(1, codigo);

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }
}
