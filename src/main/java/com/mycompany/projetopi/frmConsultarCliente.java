/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetopi;

import br.com.infox.DAO.ClienteDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import com.mycompany.projetopi.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 *
 * @author daniel.nsilva20
 */
public class frmConsultarCliente extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet st = null;

    /**
     * Creates new form NewJFrame
     */
    public frmConsultarCliente() {
        initComponents();
        lblid.setVisible(false);
                
    }

    public void consultar() {
        String sql = "select * from cliente where cpf=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCPF.getText());
            st = pst.executeQuery();
            if (st.next()) {
                lblid.setText(st.getString(1));
                txtCPF.setText(st.getString(2));
                txtNomeCliente.setText(st.getString(3));
                txtTelefone.setText(st.getString(4));
                txtEmail.setText(st.getString(5));
                //txtDataNascimento.setText(st.getDate(6).toString().replaceAll("-", ""));
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                txtDataNascimento.setText(formatador.format(st.getDate(6)));
                txtSexo.setText(st.getString(7));
                txtEstadoCivil.setText(st.getString(8));
                txtEndereco.setText(st.getString(9));
            } else {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void atualizar() {
        String sql = "update cliente set cpf=?,nome=?,telefone=?,email=?,datanascimento=?,sexo=?,estadocivil=?,endereco=? where idcliente=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCPF.getText());
            pst.setString(2, txtNomeCliente.getText());
            pst.setString(3, txtTelefone.getText());
            pst.setString(4, txtEmail.getText());

            String dia = txtDataNascimento.getText().substring(0, 2);
            String mes = txtDataNascimento.getText().substring(3, 5);
            String ano = txtDataNascimento.getText().substring(6);
            String dataParaMYSQL = ano + "-" + mes + "-" + dia;
            pst.setString(5, dataParaMYSQL);
            /* if(txtSexo.getText() = "M"){
                pst.setString(6,"M");
            }else if(rbFeminino.isSelected()){
                 pst.setString(6,"F");
            }*/
            pst.setString(6, txtSexo.getText());
            // pst.setString(6,rbMasculino.getText());
            //pst.setString(6,rbFeminino.getText());
            pst.setString(7, txtEstadoCivil.getText());
            pst.setString(8, txtEndereco.getText());
            pst.setString(9, txtId.getText());

            if ((txtId.getText().isEmpty() || txtCPF.getText().isEmpty() || txtNomeCliente.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtEmail.getText().isEmpty() || dataParaMYSQL.isEmpty() || txtSexo.getText().isEmpty() || txtEstadoCivil.getText().isEmpty() || txtEndereco.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do usuário alterado com sucesso");
                    pst.setString(4, dataParaMYSQL);
                    pst.setString(5, txtSexo.getText());
                    pst.setString(6, txtEstadoCivil.getText());
                    pst.setString(7, txtEndereco.getText());
                    pst.setString(8, txtId.getText());

                    if ((txtCPF.getText().isEmpty()) || (txtNomeCliente.getText().isEmpty()) || (txtTelefone.getText().isEmpty()) || (txtEmail.getText().isEmpty()) || (dataParaMYSQL.isEmpty()) || (txtSexo.getText().isEmpty()) || (txtEstadoCivil.getText().isEmpty()) || (txtEndereco.getText().isEmpty())) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
                    } else {

                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void remover() {
        //a estrtura abaixo confirma a remoção do usuario
        int confirmar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este usuário", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION) {
            String sql = "delete from cliente where cpf=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtCPF.getText());
                pst.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtNomeCliente = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtSexo = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtIdcliente = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CPF");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 194, -1));

        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar ");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        btnAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 104, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Apagar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 96, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Data de nascimento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 171, -1));

        txtNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeClienteFocusLost(evt);
            }
        });
        jPanel1.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Endereço");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Telefone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Estado Civil");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 170, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 280, -1));

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, -1));
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 170, -1));

        txtEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCivilActionPerformed(evt);
            }
        });
        jPanel1.add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 190, -1));
        jPanel1.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 260, -1));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 40, 0, -1));

        txtIdcliente.setText("jTextField2");
        jPanel1.add(txtIdcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 30, 0, -1));
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String id = lblid.getText();
        String cpf = txtCPF.getText();
        String nome = txtNomeCliente.getText();
        String telefone = txtTelefone.getText();
        String email = txtEmail.getText();
        String datanascimento = txtDataNascimento.getText().toString().replaceAll("-", " ");
        String sexo = txtSexo.getText();
        String estadoCivil = txtEstadoCivil.getText();
        String endereco = txtEndereco.getText();
        
         Cliente objCliente = new Cliente(cpf, nome, telefone, email, datanascimento, sexo, estadoCivil, endereco);
     boolean retorno = ClienteDAO.consultar(objCliente);
        if (retorno) {
        JOptionPane.showMessageDialog(null, "Produtos Cadastrados com sucesso!");
        } else {
        JOptionPane.showMessageDialog(null, "Falha na Consulta!");
        }
        
        
        
        
        /*String sql = "select * from cliente where cpf=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCPF.getText());
            st = pst.executeQuery();
            if (st.next()) {
                lblid.setText(st.getString(1));
                txtCPF.setText(st.getString(2));
                txtNomeCliente.setText(st.getString(3));
                txtTelefone.setText(st.getString(4));
                txtEmail.setText(st.getString(5));
                //txtDataNascimento.setText(st.getDate(6).toString().replaceAll("-", ""));
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                txtDataNascimento.setText(formatador.format(st.getDate(6)));
                txtSexo.setText(st.getString(7));
                txtEstadoCivil.setText(st.getString(8));
                txtEndereco.setText(st.getString(9));
            } else {
            }*/        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // TODO add your handling code here:
        txtCPF.setText("");
        txtNomeCliente.setText("");
        txtTelefone.setText("");
        txtDataNascimento.setText("");
        txtSexo.setText("");
        txtEstadoCivil.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        remover();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        atualizar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        frmCadastroCliente frmVendas = new frmCadastroCliente();
        frmVendas.setVisible(true);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusGained
        // TODO add your handling code here:
        txtCPF.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCPFFocusGained

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        // TODO add your handling code here:
        txtCPF.setBackground(Color.white);
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtNomeClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeClienteFocusGained
        // TODO add your handling code here:
        txtNomeCliente.setBackground(Color.yellow);
    }//GEN-LAST:event_txtNomeClienteFocusGained

    private void txtNomeClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeClienteFocusLost
        // TODO add your handling code here:
        txtNomeCliente.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeClienteFocusLost

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblid;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdcliente;
    private javax.swing.JFormattedTextField txtNomeCliente;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
