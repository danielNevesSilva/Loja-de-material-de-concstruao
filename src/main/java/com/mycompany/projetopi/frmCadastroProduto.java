package com.mycompany.projetopi;

import br.com.infox.DAO.ClienteDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import br.com.infox.DAO.Conexao;
import br.com.infox.DAO.ProdutoDAO;
import com.mycompany.projetopi.model.Cliente;
import com.mycompany.projetopi.model.Produto;
import java.util.Date;

public class frmCadastroProduto extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet st = null;

    public frmCadastroProduto() {
        initComponents();
        conexao = Conexao.conector();
        System.out.println(conexao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        txtDataNascimento1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        cmbUnMed = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        try {
            txtDataNascimento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataNascimento1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascimento1FocusLost(evt);
            }
        });
        txtDataNascimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimento1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Descrição");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 550, 30));

        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 60));

        btnSair.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 160, 60));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Preço de Venda (R$)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 150, 30));

        txtPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoFocusLost(evt);
            }
        });
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 340, 30));

        cmbUnMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "PC", "UN", "KG", "M", "CM", " ", " " }));
        jPanel1.add(cmbUnMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 195, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Unidade Medida");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 260));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoKeyTyped

    private void txtDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusGained
        // TODO add your handling code here:
        txtDescricao.setBackground(Color.yellow);
    }//GEN-LAST:event_txtDescricaoFocusGained

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        // TODO add your handling code here:
        txtDescricao.setBackground(Color.white);
    }//GEN-LAST:event_txtDescricaoFocusLost

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtPrecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFocusGained
        // TODO add your handling code here:]
        txtPreco.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPrecoFocusGained

    private void txtPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoFocusLost
        // TODO add your handling code here:
        txtPreco.setBackground(Color.white);
    }//GEN-LAST:event_txtPrecoFocusLost

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String descricao = txtDescricao.getText();
        double preco = Double.parseDouble(txtPreco.getText());
        String unidadeMed = (String) cmbUnMed.getSelectedItem();

        Produto objProduto = new Produto();

        objProduto.setDescricao(descricao);
        objProduto.setUnidadeMedida(unidadeMed);
        objProduto.setPreco(preco);

        boolean retorno = ProdutoDAO.salvar(objProduto);

        if (retorno) {
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Falha na Gravação!");
        }

        /*
        if ((txtDescricao.getText().length() > 0)
                && (txtCPF.getText().length() > 0)
                && (txtCep.getText().length() > 0)
                && (txtTelefone.getText().length() > 0)
                && (rbMasculino.getText().length() > 0)
                && (rbFeminino.getText().length() > 0)) {

            // JOptionPane.showMessageDialog(null, "Dados Validados!");
        } else {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatorios!");
        }
         */

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtDescricao.setText("");
        txtPreco.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtDataNascimento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimento1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimento1FocusGained

    private void txtDataNascimento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimento1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimento1FocusLost

    private void txtDataNascimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimento1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cmbUnMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtDataNascimento1;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
