
package br.com.infox.DAO;

import static br.com.infox.DAO.ClienteDAO.LOGIN;
import static br.com.infox.DAO.ClienteDAO.SENHA;
import static br.com.infox.DAO.ClienteDAO.URL;
import static br.com.infox.DAO.ProdutoDAO.LOGIN;
import static br.com.infox.DAO.ProdutoDAO.SENHA;
import static br.com.infox.DAO.ProdutoDAO.URL;
import com.mycompany.projetopi.model.Cliente;
import com.mycompany.projetopi.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class OrcamentoDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/projetoevolucao";
    static String LOGIN = "root";
    static String SENHA = "";
    
    public static ArrayList<Cliente> consultarCliente(String CPF) {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select CPF,nome,telefone from cliente where CPF like ?");
            comandoSQL.setString(1, CPF);
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente item = new Cliente();
                    item.setCpf(rs.getString("CPF"));
                    item.setNome(rs.getString("Nome"));
                    item.setTelefone(rs.getString("Telefone"));

                    listaRetorno.add(item);
                }

            }
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas == 0) {
                System.out.println("Não existe");
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
