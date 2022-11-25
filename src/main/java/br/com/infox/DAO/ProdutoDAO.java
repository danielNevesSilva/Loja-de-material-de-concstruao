package br.com.infox.DAO;

import static br.com.infox.DAO.ClienteDAO.LOGIN;
import static br.com.infox.DAO.ClienteDAO.SENHA;
import static br.com.infox.DAO.ClienteDAO.URL;
import com.mycompany.projetopi.model.Cliente;
import com.mycompany.projetopi.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    static String URL = "jdbc:mysql://localhost:3306/projetoevolucao";
    static String LOGIN = "root";
    static String SENHA = "";

    public static boolean salvar(Produto obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produto (nome, unidadeMedida, valorUnitario) VALUES (?,?,?);");

            comandoSQL.setString(1, obj.getDescricao());
            comandoSQL.setString(2, obj.getUnidadeMedida());
            comandoSQL.setDouble(3, obj.getPreco());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

            /*   } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);*/
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }

    public static ArrayList<Produto> listarProduto() {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto");
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setId_produto(rs.getInt("id_produto"));
                    item.setDescricao(rs.getString("nome"));
                    item.setUnidadeMedida(rs.getString("unidadeMedida"));
                    item.setPreco(rs.getDouble("valorUnitario"));

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

    public static boolean deletar(int id) throws ClassNotFoundException, SQLException {
        boolean retorno = false;
        try {
            Produto produto = new Produto();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Produto WHERE id_produto = " + id);
            comandoSQL.execute();
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;

    }

    public static boolean alterar(Produto obj, int id) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement(""
                    + "UPDATE Produto "
                    + "SET nome=?,unidadeMedida=?,valorUnitario=?"
                    + "WHERE id_produto=" + id + ";");
            comandoSQL.setString(1, obj.getDescricao());
            comandoSQL.setString(2, obj.getUnidadeMedida());
            comandoSQL.setDouble(3, obj.getPreco());

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;
    }
    
    public static ArrayList<Produto> filtrar(int id) {
        ArrayList<Produto> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where id_produto = "+id);
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setId_produto(rs.getInt("id_produto"));
                    item.setDescricao(rs.getString("nome"));
                    item.setUnidadeMedida(rs.getString("unidadeMedida"));
                    item.setPreco(Double.parseDouble(rs.getString("valorUnitario")));
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
    
    public static Produto consultarSelecionado(int id) throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        Produto produto = new Produto();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
        PreparedStatement comandoSQL = conexao.prepareStatement("select * from produto where id_produto = " + id);
        rs = comandoSQL.executeQuery();
        if (rs.next()) {
            produto.setId_produto(rs.getInt("id_produto"));
            produto.setDescricao(rs.getString("nome"));
            produto.setUnidadeMedida(rs.getString("unidadeMedida"));
            produto.setPreco(rs.getDouble("valorUnitario"));
        }
        return produto;
    }
}
