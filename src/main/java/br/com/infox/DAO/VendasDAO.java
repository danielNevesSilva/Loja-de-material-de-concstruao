/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infox.DAO;

import static br.com.infox.DAO.ClienteDAO.LOGIN;
import static br.com.infox.DAO.ClienteDAO.SENHA;
import static br.com.infox.DAO.ClienteDAO.URL;
import com.mycompany.projetopi.model.Cliente;
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
public class VendasDAO {
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


   /* public static ArrayList<Cliente> consultarClientes() throws SQLException, SQLException {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        //Armazeno as informaçoes da tabela (resultSet) em um ArrayList
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        try {

            //conexao = GerenciadorConexao.abrirConexao();
            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/projetoevolucao?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            //Passo 3 - Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT nome, CPF, telefone FROM cliente where CPF");
            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();

            //Percorrer o resultSet
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCpf(rs.getString("CPF"));
                c.setNome(rs.getString("nome"));
                //   c.setCidade(rs.getString("Cidade"));
                // c.setEstadocivil(rs.getString("estado civil"));
                // c.setSexo(rs.getString("Sexo"));
                c.setTelefone(rs.getString("Telefone"));
                //Adiciono na listaClientes
                listaClientes.add(c);


            }
            System.out.println(instrucaoSQL.toString());

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaClientes = null;
        } finally {
            //Libero os recursos da memória

        }
        return null;
    }



*/
}
