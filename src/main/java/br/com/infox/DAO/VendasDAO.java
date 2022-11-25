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
    /*
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
    */
}
