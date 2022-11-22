
package br.com.infox.DAO;

import java.util.Date;
import static br.com.infox.DAO.EstoqueDAO.LOGIN;
import static br.com.infox.DAO.EstoqueDAO.SENHA;
import static br.com.infox.DAO.EstoqueDAO.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.infox.DAO.ClienteDAO;
import com.mycompany.projetopi.model.Cliente;
import com.mycompany.projetopi.frmCadastroCliente;
import com.mycompany.projetopi.model.Estoque;
import java.sql.ResultSet;


public class ClienteDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/projetoevolucao";
    static String LOGIN = "root";
    static String SENHA = "";
    
 public static boolean salvar(Cliente obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("insert into cliente(cpf,nome,telefone,email,datanascimento,sexo,estadocivil,cidade) values(?,?,?,?,?,?,?,?)");

            comandoSQL.setString(1, obj.getCpf());
            comandoSQL.setString(2, obj.getNome());
            comandoSQL.setString(3, obj.getTelefone());
            comandoSQL.setString(4, obj.getEmail());
            comandoSQL.setString(5, obj.getDataNascimento());
            comandoSQL.setString(6, obj.getSexo());
            comandoSQL.setString(7, obj.getEstadocivil());
            comandoSQL.setString(8, obj.getCidade());
           

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

public static boolean consultar(Cliente obj){
   ResultSet rs = null;
   boolean retorno = false;
    
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
             PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente where cpf=?");
             comandoSQL.setString(1, obj.getCpf());
             rs = comandoSQL.executeQuery();
             if(rs != null){
                 comandoSQL.setString(1, obj.getCpf());
                 comandoSQL.setString(2, obj.getNome());
                 comandoSQL.setString(3, obj.getTelefone());
                 comandoSQL.setString(4, obj.getEmail());
                 comandoSQL.setString(5, obj.getDataNascimento());
                 comandoSQL.setString(6, obj.getSexo());
                 comandoSQL.setString(7, obj.getEstadocivil());
                 comandoSQL.setString(8, obj.getCidade());
                 
               /*  Cliente item = new Cliente();
                    item.setCpf(rs.getString("cpf"));
                    item.setNome(rs.getString("nome"));
                    item.setTelefone(rs.getString("telefone"));
                    item.setEmail(rs.getString("email"));
                    item.setDataNascimento(rs.getString("datanascimento"));
                    item.setSexo(rs.getString("sexo"));
                    item.setEstadocivil(rs.getString("estadocivil"));
                    item.setCidade(rs.getString("cidade"));*/
                    


             
            } else {
                 JOptionPane.showMessageDialog(null, "Erro ao consultar");
            }
             
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return retorno;
}
}
