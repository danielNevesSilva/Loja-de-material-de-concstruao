package br.com.infox.DAO;

import com.mycompany.projetopi.model.Estoque;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EstoqueDAO {

    static String URL = "jdbc:mysql://localhost:3306/projetoevolucao";
    static String LOGIN = "root";
    static String SENHA = "";

    public static boolean salvar(Estoque obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("insert into estoque(produto,quantidade,pcompra,pvenda) values(?,?,?,?)");

            comandoSQL.setString(1, obj.getProduto());
            comandoSQL.setInt(2, obj.getQuantidade());
            comandoSQL.setDouble(3, obj.getpCompra());
            comandoSQL.setDouble(4, obj.getpVenda());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

            /*   } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);*/
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }

    public static ArrayList<Estoque> listarEstoque(String nomeProduto) {
        ArrayList<Estoque> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from estoque where produto like ?");
            comandoSQL.setString(1, nomeProduto);
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Estoque item = new Estoque();
                    item.setIdprod(rs.getInt("idprod"));
                    item.setProduto(rs.getString("produto"));
                    item.setQuantidade(rs.getInt("quantidade"));
                    item.setpCompra(rs.getDouble("pcompra"));
                    item.setpVenda(rs.getDouble("pvenda"));

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

    public static boolean Excluir(int codigo) {
        boolean retorno = false;
        try {
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("delete from estoque where idprod =?");
            comandoSQL.setInt(1, codigo);

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }

    public static boolean alterar(Estoque obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);

            PreparedStatement comandoSQL = conexao.prepareStatement("update estoque set produto=?,quantidade=?,pcompra=?,pvenda=? where idprod=?");
            comandoSQL.setString(1, obj.getProduto());
            comandoSQL.setInt(2, obj.getQuantidade());
            comandoSQL.setDouble(3, obj.getpCompra());
            comandoSQL.setDouble(4, obj.getpVenda());
            comandoSQL.setInt(5, obj.getIdprod());

            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

            /*   } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);*/
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }

}
