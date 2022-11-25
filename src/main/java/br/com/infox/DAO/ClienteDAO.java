package br.com.infox.DAO;

import java.util.Date;
import static br.com.infox.DAO.ProdutoDAO.LOGIN;
import static br.com.infox.DAO.ProdutoDAO.SENHA;
import static br.com.infox.DAO.ProdutoDAO.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.infox.DAO.ClienteDAO;
import com.mycompany.projetopi.model.Cliente;
import com.mycompany.projetopi.frmCadastroCliente;
import com.mycompany.projetopi.model.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO {

    static String URL = "jdbc:mysql://localhost:3306/projetoevolucao";
    static String LOGIN = "root";
    static String SENHA = "";

    //CREATE
    public static boolean salvar(Cliente obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement(""
                    + "INSERT INTO Cliente"
                    + "(cpf, nome, telefone, email, dataNascimento, sexo, estadocivil, nomePais, nomeCidade, cep, logradouro, numero, complemento)\n"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");

            comandoSQL.setString(1, obj.getCpf());
            comandoSQL.setString(2, obj.getNome());
            comandoSQL.setString(3, obj.getTelefone());
            comandoSQL.setString(4, obj.getEmail());
            comandoSQL.setString(5, obj.getDataNascimento());
            comandoSQL.setString(6, obj.getSexo());
            comandoSQL.setString(7, obj.getEstadocivil());
            comandoSQL.setString(8, obj.getNomePais());
            comandoSQL.setString(9, obj.getNomeCidade());
            comandoSQL.setString(10, obj.getCep());
            comandoSQL.setString(11, obj.getLogradouro());
            comandoSQL.setString(12, obj.getNumero());
            comandoSQL.setString(13, obj.getComplemento());

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

    //READ - lista
    public static ArrayList<Cliente> listaCliente() {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente");
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente item = new Cliente();
                    item.setId_cliente(rs.getInt("id_cliente"));
                    item.setCpf(rs.getString("cpf"));
                    item.setNome(rs.getString("nome"));
                    item.setTelefone(rs.getString("telefone"));
                    item.setEmail(rs.getString("email"));
                    item.setDataNascimento(rs.getString("dataNascimento"));
                    item.setSexo(rs.getString("sexo"));
                    item.setEstadocivil(rs.getString("estadocivil"));
                    item.setNomePais(rs.getString("nomePais"));
                    item.setNomeCidade(rs.getString("nomeCidade"));
                    item.setCep(rs.getString("cep"));
                    item.setLogradouro(rs.getString("logradouro"));
                    item.setNumero(rs.getString("numero"));
                    item.setComplemento(rs.getString("numero"));
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

    //READ - where
    public static Cliente consultarSelecionado(int id) throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
        PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente where id_cliente = " + id);
        rs = comandoSQL.executeQuery();
        if (rs.next()) {
            cliente.setId_cliente(rs.getInt("id_cliente"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDataNascimento(rs.getString("dataNascimento"));
            cliente.setSexo(rs.getString("sexo"));
            cliente.setEstadocivil(rs.getString("estadocivil"));
            cliente.setNomePais(rs.getString("nomePais"));
            cliente.setNomeCidade(rs.getString("nomeCidade"));
            cliente.setCep(rs.getString("cep"));
            cliente.setLogradouro(rs.getString("logradouro"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setComplemento(rs.getString("numero"));
        }
        return cliente;
    }

    //UPTADE
    public static boolean alterar(Cliente obj, int id) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement(""
                    + "UPDATE Cliente "
                    + "SET cpf=?,nome=?,telefone=?, email=?, dataNascimento=?, sexo=?, estadocivil=?, nomePais=?, nomeCidade=?, cep=?, logradouro=?, numero=?, complemento=?"
                    + "WHERE id_cliente=" + id + ";");
            comandoSQL.setString(1, obj.getCpf());
            comandoSQL.setString(2, obj.getNome());
            comandoSQL.setString(3, obj.getTelefone());
            comandoSQL.setString(4, obj.getEmail());
            comandoSQL.setString(5, "2022-11-11");
            comandoSQL.setString(6, obj.getSexo());
            comandoSQL.setString(7, obj.getEstadocivil());
            comandoSQL.setString(8, obj.getNomePais());
            comandoSQL.setString(9, obj.getNomeCidade());
            comandoSQL.setString(10, obj.getCep());
            comandoSQL.setString(11, obj.getLogradouro());
            comandoSQL.setString(12, obj.getNumero());
            comandoSQL.setString(13, obj.getComplemento());

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

    //DELETE
    public static boolean deletar(int id) throws ClassNotFoundException, SQLException {
        boolean retorno = false;
        try {
            Cliente cliente = new Cliente();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE id_cliente = " + id);
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
    
    public static ArrayList<Cliente> filtrar(String Cpf, String Nome) {
        ArrayList<Cliente> listaRetorno = new ArrayList<>();
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from cliente where cpf like '"+Cpf+"' or nome like '"+Nome+"'");
            rs = comandoSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente item = new Cliente();
                    item.setId_cliente(rs.getInt("id_cliente"));
                    item.setCpf(rs.getString("cpf"));
                    item.setNome(rs.getString("nome"));
                    item.setTelefone(rs.getString("telefone"));
                    item.setEmail(rs.getString("email"));
                    item.setDataNascimento(rs.getString("dataNascimento"));
                    item.setSexo(rs.getString("sexo"));
                    item.setEstadocivil(rs.getString("estadocivil"));
                    item.setNomePais(rs.getString("nomePais"));
                    item.setNomeCidade(rs.getString("nomeCidade"));
                    item.setCep(rs.getString("cep"));
                    item.setLogradouro(rs.getString("logradouro"));
                    item.setNumero(rs.getString("numero"));
                    item.setComplemento(rs.getString("numero"));
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
